package com.sourceit.hometask.io;

import java.io.*;
import java.nio.channels.FileChannel;

public class CopyFileStrategyChannel implements CopyFileStrategy{
    @Override
    public void copyFile(String s, String s2) throws FileAlreadyPresentsException, FileCopyFailedException {
        copyFile(new File(s), new File(s2));
    }

    @Override
    public void copyFile(File file, File file2) throws FileAlreadyPresentsException, FileCopyFailedException {
        try(FileChannel inChannel = new FileInputStream(file).getChannel();
            FileChannel outChannel = new FileOutputStream(file2).getChannel()) {
            long startTime = System.nanoTime();
            inChannel.transferTo(0, inChannel.size(), outChannel);
            new CopyFileFactoryImpl().time(startTime);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
