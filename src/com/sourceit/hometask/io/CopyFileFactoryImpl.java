package com.sourceit.hometask.io;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFileFactoryImpl implements CopyFileFactory {

    public void time(long time){
        System.out.println("Time is "
                + (System.nanoTime() - time)/1000000.0);
    }

    @Override
    public CopyFileStrategy createSimpleCopyFileStrategy() {
        return new CopyFileStrategy(){

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
                    time(startTime);
                } catch (IOException exc) {
                    exc.printStackTrace();
                }
            }
        };
    }

    @Override
    public CopyFileStrategy createBufferedCopyFileStrategy() {
        return new CopyFileStrategy(){

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
                    time(startTime);
                }catch(IOException exc) {
                    exc.printStackTrace();
                }
            }
        };
    }

    @Override
    public CopyFileStrategy createChannelsCopyFileStrategy() {
        return new CopyFileStrategy(){

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
                    time(startTime);
                } catch (IOException exc) {
                    exc.printStackTrace();
                }
            }
        };
    }

    @Override
    public CopyFileStrategy createFilesCopyFileStrategy() {
        return new CopyFileStrategy(){

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
                    time(startTime);
                } catch (IOException exc){
                    exc.printStackTrace();
                }
            }
        };
    }
}
