package com.sourceit.hometask.io;

public class Test {
    public static void main(String[] args) {
        CopyFileFactoryImpl copy = new CopyFileFactoryImpl();
        String src = "src/resources/test.jpg";
        try {
            copy.createSimpleCopyFileStrategy().copyFile(src,
                    "src/resources/SimpleCopyFile.jpg");
            copy.createBufferedCopyFileStrategy().copyFile(src,
                    "src/resources/BufferedCopyFile.jpg");
            copy.createChannelsCopyFileStrategy().copyFile(src,
                    "src/resources/ChannelsCopyFile.jpg");
            copy.createFilesCopyFileStrategy().copyFile(src,
                    "src/resources/FilesCopyFile.jpg");
        } catch (FileCopyFailedException copyFailed){
            copyFailed.printStackTrace();
        }
    }
}
