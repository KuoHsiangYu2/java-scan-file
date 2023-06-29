package com.test1;

import static com.util.Output.println;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ScanFile {

    public static void main(String[] args) {
        Path targetPath = Paths.get("D:", "mydir");
        Stream<Path> fileStream = null;
        try {
            fileStream = Files.walk(targetPath);
            fileStream.forEach((Path path) -> println(path));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileStream != null) {
                fileStream.close();
                fileStream = null;
            }
        }
    }

}
