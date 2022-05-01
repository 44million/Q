package qlang.core.lang;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;
import org.jetbrains.annotations.NotNull;
import qlang.core.internal.CompilerFileTree;
import qlang.core.internal.Environment;
import qlang.core.internal.Parser;
import qlang.core.lang.Q.Value;
import qlang.runtime.errors.Problem;
import qlang.runtime.libs.AWT.AWT;
import qlang.runtime.libs.Math;
import qlang.runtime.libs.Time;
import qlang.runtime.libs.WebServer;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;

public class util {

    public static boolean getOrDefault(boolean otherB, Visitor v) {
        try {
            return v.scope.parent().parent().parent().sore;
        } catch (Exception e) {
            return otherB;
        }
    }

    public static void lpFolder(File folder) {
        for (File fileEntry : Objects.requireNonNull(folder.listFiles())) {
            if (fileEntry.isDirectory()) {
                lpFolder(fileEntry);
            } else {
                try {
                    String content = Files.readString(fileEntry.toPath(), StandardCharsets.US_ASCII);
                    new Parser().fromText(content).parse();
                } catch (IOException e) {
                    throw new Problem(e);
                }
            }
        }
    }

    public static void animate(String @NotNull [] args) {
        int counter = 0;
        for (String cmd : args) {

            switch (cmd) {
                case "--setpath", "-p" -> {
                    File input = new File(args[++counter]);
                    try {

                        if (!new File(input.getAbsolutePath().replaceAll("\\.x", ".comp")).exists()) {
                            try {
                                new File(input.getAbsolutePath().replaceAll("\\.x", ".comp")).createNewFile();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        Parser parser = new Parser(CharStreams.fromFileName(input.getAbsolutePath()));
                        Environment.global.lst.addAll(parser.parse(false));

                    } catch (Exception e) {

                        String err = "[FATAL] " + e.getMessage();
                        if (e.getMessage().startsWith("src\\main\\Q\\") || e.getMessage().startsWith("C:") || e.getMessage().endsWith(".x")) {
                            err += " (File not found)";
                        }

                        System.out.println(err);
                        System.exit(0);
                    }
                }
                case "--help", "-h" -> System.out.println("""
                        Help Menu
                        ---------
                        cmd: [--setpath/-p] Sets the path to the file to execute.
                        cmd: [--help/-h] Sends this help menu
                        cmd: [--fromtext/-t] Executes the given text as if it were a file
                        """);
                case "" -> counter++;
            }
        }
    }

    public static String getTextFromGithub(String link) {
        URL Url;
        try {
            Url = new URL(link);
        } catch (MalformedURLException e1) {
            throw new Problem(e1.getMessage());
        }
        HttpURLConnection Http = null;
        try {
            assert Url != null;
            Http = (HttpURLConnection) Url.openConnection();
        } catch (IOException e1) {
            System.out.println("[FATAL] " + e1.getMessage());
        }
        assert Http != null;
        Map<String, List<String>> headerMapMap = Http.getHeaderFields();

        for (String header : headerMapMap.get(null)) {
            if (header.contains(" 302 ") || header.contains(" 301 ")) {
                link = headerMapMap.get("Location").get(0);
                try {
                    Url = new URL(link);
                } catch (MalformedURLException e) {
                    System.out.println("[FATAL] " + e.getMessage());
                }
                try {
                    Http = (HttpURLConnection) Url.openConnection();
                } catch (IOException e) {
                    System.out.println("[FATAL] " + e.getMessage());
                }
                headerMapMap = Http.getHeaderFields();
            }
        }
        InputStream Stream = null;
        try {
            Stream = Http.getInputStream();
        } catch (IOException e) {
            System.out.println("[FATAL] " + e.getMessage());
        }
        String Response = null;
        try {
            Response = getStringFromStream(Stream);
        } catch (IOException e) {
            System.out.println("[FATAL] " + e.getMessage());
        }
        return Response;
    }

    public static WebServer getWebByName(String name) {
        return Environment.global.webs.getOrDefault(name, null);
    }

    public static void register(String text, boolean formatted) {
        if (formatted) {
            if (Environment.global.allowedLibs.contains(text)) {
                return;
            }
            Environment.global.allowedLibs.add(text);

        } else {
            String lib = text.replaceFirst("\\.q\\.", "");
            if (Environment.global.allowedLibs.contains(lib)) {
                return;
            }
            Environment.global.allowedLibs.add(lib);
        }
    }

    // straight from stackoverflow
    public static String string() {
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * alphabet.length());
            salt.append(alphabet.charAt(index));
        }
        return salt.toString();

    }

    private static String getStringFromStream(InputStream stream) throws IOException {
        if (stream != null) {
            Writer Writer = new StringWriter();

            char[] buffer = new char[2048];
            try (stream) {
                Reader Reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
                int counter;
                while ((counter = Reader.read(buffer)) != -1) {
                    Writer.write(buffer, 0, counter);
                }
            }
            return Writer.toString();
        } else {
            return "No Contents";
        }
    }

    public static void resolveImport(String imp) {

        File file = new File(System.getProperty("user.dir") + "/" + imp + ".l");

        for (File f : Environment.global.parsed) {
            if (f.getPath().equals(file.getPath())) {
                return;
            }
        }

        Environment.global.parsed.add(file);

        Parser parser = new Parser(file);
        try {
            Environment.global.lst.addAll(parser.parse(false));
        } catch (Exception e) {

            if (imp.equals("System")) {
                return;
            }

            throw new Problem("Could not parse " + imp + ".l (the file may not exist or be in the wrong format)");
        }

    }

    public static AWT getWinByName(String name) {

        for (AWT xc : Environment.global.wins) {
            if (xc.realName.equals(name)) {
                return xc;
            }
        }
        return null;
    }

    // suppress warnings because this code is phenomenally bad
    @SuppressWarnings("all")
    public static void check(String p, String t2, ParserRuleContext ctx, boolean sore, String c, String namespace) {
        if ((p.equals(".std") || p.equals("std")) && namespace.equals("standard")) {
            return;
        }

        if (sore || Environment.global.allowedLibs.contains(p)) {
            return;
        } else {
            throw new Problem("Cannot reference '" + t2 + "', as the package has not been imported. The library can be found at: 'q." + t2 + "'", ctx, c);
        }
    }

    public static void registerNatives() {

        register("std", true);
        register("lang", true);
        register("String", true);

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {
            }

            @Override
            public String name() {
                return "cur";
            }

            @Override
            public Value ret() {
                return new Time().cur();
            }

            @Override
            public String parent() {
                return "Time";
            }

            @Override
            public void exec(List<Value> list) {

            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return false;
            }

        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {
            }

            @Override
            public String name() {
                return "date";
            }

            @Override
            public Value ret() {
                return new Time().date();
            }

            @Override
            public String parent() {
                return "Time";
            }

            @Override
            public void exec(List<Value> list) {

            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return false;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {
            }

            @Override
            public String name() {
                return "printf";
            }

            @Override
            public Value ret() {
                return null;
            }

            @Override
            public String parent() {
                return "io";
            }

            @Override
            public void exec(List<Value> list) {
                String output = list.get(0).toString();
                String format = list.get(1).toString();

                System.out.printf(output + "\n", format);

            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return true;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {
            }

            @Override
            public String name() {
                return "err";
            }

            @Override
            public Value ret() {
                return null;
            }

            @Override
            public String parent() {
                return "io";
            }

            @Override
            public void exec(List<Value> list) {
                String output = list.get(0).toString();

                System.err.println(output);

            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return true;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {
            }

            @Override
            public String name() {
                return "errf";
            }

            @Override
            public Value ret() {
                return null;
            }

            @Override
            public String parent() {
                return "io";
            }

            @Override
            public void exec(List<Value> list) {
                String output = list.get(0).toString();
                String format = list.get(1).toString();

                System.err.printf(output + "\n", format);

            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return true;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {
            }

            @Override
            public String name() {
                return "instant";
            }

            @Override
            public Value ret() {
                return new Time().instant();
            }

            @Override
            public String parent() {
                return "Time";
            }

            @Override
            public void exec(List<Value> list) {

            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return false;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {
                System.console().flush();
            }

            @Override
            public String name() {
                return "flush";
            }

            @Override
            public Value ret() {
                return null;
            }

            @Override
            public String parent() {
                return "Console";
            }

            @Override
            public void exec(List<Value> list) {

            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return false;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {

            }

            @Override
            public String name() {
                return "readPassword";
            }

            @Override
            public Value ret() {
                return new Value("broken");
            }

            @Override
            public String parent() {
                return "Console";
            }

            @Override
            public void exec(List<Value> list) {

            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return false;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {

            }

            @Override
            public String name() {
                return "property";
            }

            @Override
            public Value ret() {
                return null;
            }

            @Override
            public String parent() {
                return "std";
            }

            @Override
            public void exec(List<Value> list) {
            }

            @Override
            public Value ret(List<Value> list) {
                String request = list.get(0).toString();
                return new Value(System.getProperty(request));
            }

            @Override
            public boolean args() {
                return true;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {

            }

            @Override
            public String name() {
                return "countLines";
            }

            @Override
            public Value ret() {
                return null;
            }

            @Override
            public String parent() {
                return "Files";
            }

            @Override
            public void exec(List<Value> list) {
            }

            @Override
            public Value ret(List<Value> list) {
                File file = new File(list.get(0).toString());

                if (!file.exists()) {
                    throw new Problem("File '" + list.get(0).toString() + "' does not exist");
                }

                long amount = file.length();

                return new Value(amount);
            }

            @Override
            public boolean args() {
                return true;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {
            }

            @Override
            public String name() {
                return "cout";
            }

            @Override
            public Value ret() {
                return null;
            }

            @Override
            public String parent() {
                return "std";
            }

            @Override
            public void exec(List<Value> list) {
                System.out.print(list.get(0).toString());
            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return true;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {
                System.out.println();
            }

            @Override
            public String name() {
                return "coutln";
            }

            @Override
            public Value ret() {
                return null;
            }

            @Override
            public String parent() {
                return "std";
            }

            @Override
            public void exec(List<Value> list) {
                System.out.println(list.get(0).toString());
            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return true;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {

            }

            @Override
            public String name() {
                return "workspace";
            }

            @Override
            public Value ret() {
                return null;
            }

            @Override
            public String parent() {
                return "std";
            }

            @Override
            public void exec(List<Value> list) {
            }

            @Override
            public Value ret(List<Value> list) {
                for (Value v : list) {
                    if (v.toString().equals("home")) {
                        return new Value(System.getProperty("user.home"));
                    } else if (v.toString().equals("make")) {
                        String dirname = list.get(1).toString();
                        if (!new File(dirname).exists()) {
                            new File(dirname).mkdirs();
                            return new Value(true);
                        } else {
                            return new Value(false);
                        }
                    } else if (v.toString().equals("verify")) {
                        return new Value(new File(list.get(1).toString()).exists());
                    } else if (v.toString().equals("makefile")) {
                        String dirname = list.get(1).toString();
                        if (!new File(dirname).exists()) {
                            try {
                                new File(dirname).createNewFile();
                            } catch (IOException e) {
                                System.out.println(e.getMessage());
                            }
                            return new Value(true);
                        } else {
                            return new Value(false);
                        }
                    }

                }
                return new Value(false);
            }

            @Override
            public boolean args() {
                return true;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {
            }

            @Override
            public String name() {
                return "getClass";
            }

            @Override
            public Value ret() {
                return new Value(Environment.global.toString());
            }

            @Override
            public String parent() {
                return "std";
            }

            @Override
            public void exec(List<Value> list) {

            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return false;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {

            @Override
            public void exec() {

            }

            @Override
            public String name() {
                return "compilerFileTree";
            }

            @Override
            public Value ret() {
                return new Value(new CompilerFileTree().tree(new File("src/main/java/qlang").toPath()).get());
            }

            @Override
            public String parent() {
                return "std";
            }

            @Override
            public void exec(List<Value> list) {

            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return false;
            }

        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {

            }

            @Override
            public String name() {
                return "writeFile";
            }

            @Override
            public Value ret() {
                return null;
            }

            @Override
            public String parent() {
                return "Files";
            }

            @Override
            public void exec(List<Value> list) {
                String path = list.get(0).toString();

                File file = new File(path);

                try {
                    FileWriter fw = new FileWriter(file);
                    fw.write(list.get(1).toString());
                    fw.close();
                } catch (IOException e) {
                    throw new Problem(e);
                }


            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return false;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {

            }

            @Override
            public String name() {
                return "countChars";
            }

            @Override
            public Value ret() {
                return null;
            }

            @Override
            public String parent() {
                return "FileUtils";
            }

            @Override
            public void exec(List<Value> list) {

            }

            @Override
            public Value ret(List<Value> list) {
                try {
                    FileUtil n = new FileUtil(list.get(0).toString());
                    return new Value(n.getCharCount());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                return Value.NULL;
            }

            @Override
            public boolean args() {
                return true;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {

            }

            @Override
            public String name() {
                return "fns";
            }

            @Override
            public Value ret() {

                StringBuilder sb = new StringBuilder();
                sb.append("[").append("\n");
                Environment.global.natives.forEach((k, v) -> {
                    sb.append("\t").append(k).append(' ');
                    sb.append("(").append(v.args()).append(")").append("\n");
                });
                sb.append("]");

                return new Value(sb.toString());
            }

            @Override
            public String parent() {
                return "std";
            }

            @Override
            public void exec(List<Value> list) {

            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return false;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {

            }

            @Override
            public String name() {
                return "getQCode";
            }

            @Override
            public Value ret() {
                return new Value(Math.qcode);
            }

            @Override
            public String parent() {
                return "Math";
            }

            @Override
            public void exec(List<Value> list) {

            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return false;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {

            }

            @Override
            public String name() {
                return "parse";
            }

            @Override
            public Value ret() {
                return null;
            }

            @Override
            public String parent() {
                return "lang";
            }

            @Override
            public void exec(List<Value> list) {
                String method = list.get(0).toString();

                if (method.equals("parseString")) {
                    String str = list.get(1).toString();
                    Parser.execBlock(str);
                } else if (method.equals("parseFile")) {
                    String file = list.get(1).toString();

                    try {
                        String fcontents = CharStreams.fromFileName(file).toString();
                        Parser parser = new Parser().fromText(fcontents);
                        parser.parse(false);
                    } catch (IOException e) {
                        throw new Problem(e.getMessage());
                    }
                } else if (method.equals("parseStringWith")) {
                    String str = list.get(1).toString();
                    Parser.execBlock(str);

                    String with = list.get(2).toString();
                    Parser.execBlock(with);
                } else if (method.equals("parseFileWith")) {
                    String file = list.get(1).toString();

                    try {
                        String fcontents = CharStreams.fromFileName(file).toString();
                        Parser parser = new Parser().fromText(fcontents);
                        parser.parse(false);
                    } catch (IOException e) {
                        throw new Problem(e.getMessage());
                    }

                    String with = list.get(2).toString();
                    Parser.execBlock(with);
                }
            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return true;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {

            }

            @Override
            public String name() {
                return "libraries";
            }

            @Override
            public Value ret() {
                return new Value(Environment.global.allLibs.toString());
            }

            @Override
            public String parent() {
                return "std";
            }

            @Override
            public void exec(List<Value> list) {

            }

            @Override
            public Value ret(List<Value> list) {
                if (list.get(0).asBoolean()) {
                    return new Value(Environment.global.allLibs.toString());
                } else {
                    return new Value(Environment.global.allLibs.toString().replaceAll("\\[", "").replaceAll("]", ""));
                }
            }

            @Override
            public boolean args() {
                return true;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {

            }

            @Override
            public String name() {
                return "parsed";
            }

            @Override
            public Value ret() {
                return new Value(Environment.global.parsed.toString());
            }

            @Override
            public String parent() {
                return "std";
            }

            @Override
            public void exec(List<Value> list) {

            }

            @Override
            public Value ret(List<Value> list) {
                return null;
            }

            @Override
            public boolean args() {
                return false;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {

            }

            @Override
            public String name() {
                return "toInt";
            }

            @Override
            public Value ret() {
                return null;
            }

            @Override
            public String parent() {
                return "Math";
            }

            @Override
            public void exec(List<Value> list) {

            }

            @Override
            public Value ret(List<Value> list) {
                int x = Integer.parseInt(list.get(0).toString());
                return new Value(x);
            }

            @Override
            public boolean args() {
                return true;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {
            @Override
            public void exec() {

            }

            @Override
            public String name() {
                return "split";
            }

            @Override
            public Value ret() {
                return null;
            }

            @Override
            public String parent() {
                return "std";
            }

            @Override
            public void exec(List<Value> list) {

            }

            @Override
            public Value ret(List<Value> list) {
                String s = list.get(0).toString();
                String delim = list.get(1).toString();

                String[] in = s.split(delim);

                return new Value(new ArrayList<>(Arrays.asList(in)));
            }

            @Override
            public boolean args() {
                return true;
            }
        });

        Environment.global.defineNativeFunction(new Function.INativeFunction() {

            @Override
            public void exec() {

            }

            @Override
            public String name() {
                return "toString";
            }

            @Override
            public Value ret() {
                return null;
            }

            @Override
            public String parent() {
                return "String";
            }

            @Override
            public void exec(List<Value> list) {

            }

            @Override
            public Value ret(List<Value> list) {
                return new Value(list.get(0).toString());
            }

            @Override
            public boolean args() {
                return true;
            }
        });

    }

    public static class FileUtil {
        static BufferedReader reader = null;

        public FileUtil(String filePath) throws FileNotFoundException {
            File file = new File(filePath);
            FileInputStream fileStream = new FileInputStream(file);
            InputStreamReader input = new InputStreamReader(fileStream);
            reader = new BufferedReader(input);
        }

        public long getCharCount() throws IOException {
            long charCount = 0;
            String data;
            while ((data = reader.readLine()) != null) {
                charCount += data.length();
            }
            return charCount;
        }
    }
}
