package com.sourceit.hometask.io;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        CopyFileStrategyByBytes bytes = new CopyFileStrategyByBytes();
        CopyFileStrategyBuffer buffer = new CopyFileStrategyBuffer();

        String str = "src/resources/Sadik_diplom.rtf";

        File file = new File(str);
        File file2 = new File("src/resources/bytesFile.rtf");
        File file3 = new File("src/resources/bufferFile.rtf");

        try {
            bytes.copyFile(str, "src/resources/bytesString.rtf");
            bytes.copyFile(file, file2);
            buffer.copyFile(str, "src/resources/bufferString.rtf");
            buffer.copyFile(file, file3);
        }catch (FileAlreadyPresentsException filePres){
            filePres.printStackTrace();
        }
        catch (FileCopyFailedException copyFailed){
            copyFailed.printStackTrace();
        }
    }
}
