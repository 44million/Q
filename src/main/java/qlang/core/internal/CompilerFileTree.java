package qlang.core.internal;

import java.io.File;
import java.nio.file.Path;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*

    Built in library to view the filetree of the compiler in Q itself. not my code

 */

public class CompilerFileTree {

    public static String HRBC(long size) {
        if (-1000 < size && size < 1000) {
            return size + " B";
        }
        CharacterIterator ci = new StringCharacterIterator("kMGTPE");
        while (size <= -999_950 || size >= 999_950) {
            size /= 1000;
            ci.next();
        }
        return String.format("%.1f %cB", size / 1000.0, ci.current());
    }

    public Optional<String> tree(Path path) {
        File file = new File(String.valueOf(path));
        if (!file.exists()) return Optional.empty();
        if (file.isFile()) {
            return Optional.of(nameOf(file) + " " + HRBC(file.length()));
        }
        if (file.isDirectory()) {

            return Optional.of(directoryTree(file, new ArrayList<>()));
        }
        return Optional.empty();
    }

    private String directoryTree(File folder, List<Boolean> lastFolders) {
        StringBuilder directory = new StringBuilder();
        if (lastFolders.size() != 0)
            directory.append(!(lastFolders.get(lastFolders.size() - 1)) ? "├─ " : "└─ ");
        directory.append("/").append(folder.getName()).append("::Folder ").append(folderSize(folder));

        File[] files = folder.listFiles();
        assert files != null;
        int count = files.length;
        files = sortFiles(files);
        for (int i = 0; i < count; i++) {
            directory.append("\n");
            for (Boolean lastFolder : lastFolders) {
                if (lastFolder) {
                    directory.append("   ");
                } else {
                    directory.append("│  ");
                }
            }
            if (files[i].isFile()) {
                directory.append(i + 1 == count ? "└" : "├").append("─ ").append(nameOf(files[i])).append(" ").append(HRBC(files[i].length()));
            } else {
                ArrayList<Boolean> list = new ArrayList<>(lastFolders);
                list.add(i + 1 == count);
                directory.append(directoryTree(files[i], list));
            }
        }
        return directory.toString();
    }

    private String nameOf(File file) {
        if (file.getName().endsWith(".g4")) {
            return (file.getName().substring(0, file.getName().length() - 3)) + "::LexFile";
        } else if (file.getName().endsWith(".java")) {
            return (file.getName().substring(0, file.getName().length() - 5)) + "::JavaFile";
        } else if (file.getName().endsWith(".tokens")) {
            return (file.getName().substring(0, file.getName().length() - 7)) + "::TokenInputFile";
        } else if (file.getName().endsWith(".interp")) {
            return (file.getName().substring(0, file.getName().length() - 7)) + "::InterpreterFile";
        }
        return file.getName();
    }

    private long getFolderSize(File folder) {
        long size = 0;
        File[] files = folder.listFiles();

        assert files != null;

        for (File file : files) {
            if (file.isFile()) {
                size += file.length();
            } else {
                size += getFolderSize(file);
            }
        }
        return size;
    }

    private String folderSize(File folder) {
        return HRBC(getFolderSize(folder));
    }

    private File[] sortFiles(File[] folder) {

        Arrays.sort(folder);
        List<File> sorted = new ArrayList<>();

        for (File file : folder) {
            if (file.isDirectory()) sorted.add(file);
        }

        for (File file : folder) {
            if (file.isFile()) sorted.add(file);
        }
        return sorted.toArray(new File[0]);
    }
}