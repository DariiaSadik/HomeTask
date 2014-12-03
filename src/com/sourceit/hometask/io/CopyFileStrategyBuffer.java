package com.sourceit.hometask.io;

import java.io.*;

public class CopyFileStrategyBuffer implements CopyFileStrategy{
    long startTime;
    long elapsedTime;

    @Override
    public void copyFile(String s, String s2) throws FileAlreadyPresentsException, FileCopyFailedException {
        try(BufferedInputStream bufferedInput = new BufferedInputStream(new FileInputStream(s));
            BufferedOutputStream bufferedOutput = new BufferedOutputStream(new FileOutputStream(s2))){
            int byteRead;
            startTime = System.nanoTime();
            while ((byteRead = bufferedInput.read()) != -1){
                bufferedOutput.write(byteRead);
            }
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("CopyFileStrategyByBytes,  " +
                    "method copyFile(String s, String s2) "
                    + elapsedTime/1000000.0);
        }catch(IOException exc){
            exc.printStackTrace();
        }
    }

    @Override
    public void copyFile(File file, File file2) throws FileAlreadyPresentsException, FileCopyFailedException {
        try(BufferedInputStream bufferedInput = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream bufferedOutput = new BufferedOutputStream(new FileOutputStream(file2))){
            int byteRead;
            startTime = System.nanoTime();
            while ((byteRead = bufferedInput.read()) != -1){
                bufferedOutput.write(byteRead);
            }
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("CopyFileStrategyByBytes,  " +
                    "method copyFile(String s, String s2) "
                    + elapsedTime/1000000.0);
        }catch(IOException exc){
            exc.printStackTrace();
        }
    }
}
