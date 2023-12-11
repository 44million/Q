package qlang.core.internal;

import org.antlr.v4.runtime.CharStreams;
import qlang.core.lang.Environment;
import qlang.core.lang.Function;
import qlang.core.lang.Q.QCompilerFileTree;
import qlang.runtime.STDLibs.etc.QMath;
import qlang.runtime.STDLibs.etc.QTime;
import qlang.runtime.core.Parser;
import qlang.runtime.core.Utilities;
import qlang.runtime.errors.Problem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*

    Native functions loader, is full of built in functions written in Java,
    and ported over via a recognition system to Q.

 */

public class NativeFunctionLoader {

    public NativeFunctionLoader() {

    }

    /**
     * This method essentially parses all the Native methods that Q offers, so they can be used without the user writing them.
     */
    public NativeFunctionLoader registerNatives() {
        // register libraries, the text is the name of the library, and then boolean is whether it's formatted
        // unformatted libraries look like `.q.std` as opposed to formatted, which is just `std` or `q.std`.
        Utilities.register("std", true);
        Utilities.register("lang", true);
        Utilities.register("String", true);

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
                return new QTime().cur();
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
                return new QTime().date();
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
                return new QTime().instant();
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

                String tp = list.get(0).toString();

                char[] chars = tp.toCharArray();

                for (int i = 0; i < chars.length; i++) {
                    char c = chars[i];
                    if (c == '\\') {
                        if (chars[i++] == 'n') {
                            System.out.println();
                        }
                    }
                    System.out.print(c);
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
                return "rndInt";
            }

            @Override
            public Value ret() {
                return new Value(new Random().nextInt());
            }

            @Override
            public String parent() {
                return "Random";
            }

            @Override
            public void exec(List<Value> list) {

            }

            @Override
            public Value ret(List<Value> list) {
                int min = Integer.parseInt(list.get(0).asString());
                int max = Integer.parseInt(list.get(1).asString());

                Random r = new Random();
                int result = r.nextInt(max - min) + min;
                return new Value(result);
            }

            @Override
            public boolean args() {
                return false;
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
                return "here";
            }

            @Override
            public Value ret() {
                return new Value(System.getProperty("user.dir"));
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
                return new Value(new QCompilerFileTree().tree(new File("src/main/java/qlang").toPath()).get());
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

                if (list.get(2).asBoolean().equals(true)) {
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        throw new Problem(e);
                    }
                }

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
                    Utilities.FileUtil n = new Utilities.FileUtil(list.get(0).toString());
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
                return new Value(QMath.qcode);
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

                switch (method) {
                    case "parseString" -> {
                        String str = list.get(1).toString();
                        Parser.execBlock(str);
                    }
                    case "parseFile" -> {
                        String file = list.get(1).toString();

                        try {
                            String fcontents = CharStreams.fromFileName(file).toString();
                            Parser parser = new Parser().fromText(fcontents);
                            parser.parse(false);
                        } catch (IOException e) {
                            throw new Problem(e.getMessage());
                        }
                    }
                    case "parseStringWith" -> {
                        String str = list.get(1).toString();
                        Parser.execBlock(str);

                        String with = list.get(2).toString();
                        Parser.execBlock(with);
                    }
                    case "parseFileWith" -> {
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
                return "replaceInStr";
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

                String s = list.get(0).asString();

                String sAfterS = s.replace(list.get(1).asString(), list.get(2).asString());

                System.out.println(sAfterS);

                return new Value(sAfterS);

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

        return this;
    }
}
