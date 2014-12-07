package com.sourceit.hometask.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFileStrategyPath implements CopyFileStrategy{
    @Override
    public void copyFile(String s, String s2) throws FileAlreadyPresentsException, FileCopyFailedException {
        copyFile(new File(s), new File(s2));
    }

    @Override
    public void copyFile(File file, File file2) throws FileAlreadyPresentsException, FileCopyFailedException {
        Path input = Paths.get(String.valueOf(file));
        Path output = Paths.get(String.valueOf(file2));
        try{
            long startTime = System.nanoTime();
            Files.copy(input, output);
            new CopyFileFactoryImpl().time(startTime);
        } catch (IOException exc){
            exc.printStackTrace();
        }
    }
}
