package com.sourceit.hometask.io;

import java.io.*;

// copy byte by byte

public class CopyFileStrategyByBytes implements CopyFileStrategy {
    long startTime;
    long elapsedTime;
    FileInputStream input = null;
    FileOutputStream output = null;

    @Override
    // input1 -> output1
    public void copyFile(String s, String s2) throws FileAlreadyPresentsException, FileCopyFailedException {
        try {
            input = new FileInputStream(s);
            output = new FileOutputStream(s2);
            int byteRead;
            startTime = System.nanoTime();
            while ((byteRead = input.read()) != -1) {
                output.write(byteRead);
            }
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("CopyFileStrategyByBytes,  " +
                    "method copyFile(String s, String s2) "
                    + elapsedTime/1000000.0);
        }catch (IOException exc) {
            exc.printStackTrace();
        }finally {
            try {
                if (input != null) input.close();
                if (output != null) output.close();
            } catch (IOException exc) {
                exc.printStackTrace();
            }
        }
    }

    @Override
    //input1 -> output2
    public void copyFile(File file, File file2) throws FileAlreadyPresentsException, FileCopyFailedException {
        try {
            input = new FileInputStream(file);
            output = new FileOutputStream(file2);
            int byteRead;
            startTime = System.nanoTime();
            while ((byteRead = input.read()) != -1) {
                output.write(byteRead);
            }
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("CopyFileStrategyByBytes,  " +
                    "method copyFile(String s, String s2) "
                    + elapsedTime/1000000.0);
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            try {
                if (input != null) input.close();
                if (output != null) output.close();
            } catch (IOException exc) {
                exc.printStackTrace();
            }
        }
    }
}