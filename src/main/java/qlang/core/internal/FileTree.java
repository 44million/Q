package qlang.core.internal;

import java.nio.file.Path;
import java.util.Optional;

/*
    Simple, required for CompilerFileTree.java
 */

public interface FileTree {
    Optional<String> tree(Path path);
}