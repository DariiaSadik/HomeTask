package com.sourceit.hometask.io;

import java.io.*;

public class CopyFileStrategyByBytes implements CopyFileStrategy {

    @Override
    public void copyFile(String s, String s2) throws FileAlreadyPresentsException, FileCopyFailedException {
        copyFile(new File(s), new File(s2));
    }

    @Override
    public void copyFile(File file, File file2) throws FileAlreadyPresentsException, FileCopyFailedException {
        try (FileInputStream input = new FileInputStream(file);
             FileOutputStream output = new FileOutputStream(file2)) {
            int byteRead;
            final long startTime = System.nanoTime();
            while ((byteRead = input.read()) != -1) {
                output.write(byteRead);
            }
            new CopyFileFactoryImpl().time(startTime);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}