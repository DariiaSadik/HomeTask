package com.sourceit.hometask.io;

import java.io.*;

public class CopyFileStrategyBuffer implements CopyFileStrategy{

    @Override
    public void copyFile(String s, String s2) throws FileAlreadyPresentsException, FileCopyFailedException {
        copyFile(new File(s), new File(s2));
    }

    @Override
    public void copyFile(File file, File file2) throws FileAlreadyPresentsException, FileCopyFailedException {
        try(BufferedInputStream bufferedInput = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream bufferedOutput = new BufferedOutputStream(new FileOutputStream(file2))) {
            int byteRead;
            final long startTime = System.nanoTime();
            while ((byteRead = bufferedInput.read()) != -1) {
                bufferedOutput.write(byteRead);
            }
            new CopyFileFactoryImpl().time(startTime);
        }catch(IOException exc) {
            exc.printStackTrace();
        }
    }
}
