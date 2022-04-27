package qlang.core.internal;

import java.nio.file.Path;
import java.util.Optional;

public interface FileTree {
    Optional<String> tree(Path path);
}