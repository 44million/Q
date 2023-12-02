package qlang.core.internal;

import java.io.File;
import java.nio.file.Path;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Built-in library to view the filetree of the compiler in Q itself.
 * Note: This code was not written by the author of these comments.
 */
public class CompilerFileTree {

    /**
     * Formats a file size in a human-readable format.
     *
     * @param size The size of the file.
     * @return A human-readable string representation of the file size.
     */
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

    /**
     * Generates a tree representation of the file structure starting from the given path.
     *
     * @param path The path to the root directory.
     * @return An Optional containing the tree representation if the path exists, empty otherwise.
     */
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

    /**
     * Recursively generates a tree representation of the directory structure.
     *
     * @param folder      The current directory.
     * @param lastFolders A list indicating whether the previous directories were the last ones.
     * @return The tree representation of the directory structure.
     */
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

    /**
     * Determines the name of the file based on its type.
     *
     * @param file The file for which to determine the name.
     * @return The name of the file.
     */
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

    /**
     * Calculates the total size of a folder, including its subfolders and files.
     *
     * @param folder The folder for which to calculate the size.
     * @return The total size of the folder.
     */
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

    /**
     * Formats the size of a folder in a human-readable format.
     *
     * @param folder The folder for which to format the size.
     * @return A human-readable string representation of the folder size.
     */
    private String folderSize(File folder) {
        return HRBC(getFolderSize(folder));
    }

    /**
     * Sorts an array of files by separating directories and files.
     *
     * @param folder The array of files to be sorted.
     * @return The sorted array of files.
     */
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
