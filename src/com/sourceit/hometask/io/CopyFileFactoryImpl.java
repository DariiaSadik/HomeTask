package com.sourceit.hometask.io;

public class CopyFileFactoryImpl implements CopyFileFactory {

    public void time(long time){
        System.out.println("Time is "
                + (System.nanoTime() - time)/1000000.0);
    }

    @Override
    public CopyFileStrategy createSimpleCopyFileStrategy() {
        return new CopyFileStrategyByBytes();
    }

    @Override
    public CopyFileStrategy createBufferedCopyFileStrategy() {
        return new CopyFileStrategyBuffer();
    }

    @Override
    public CopyFileStrategy createChannelsCopyFileStrategy() {
        return new CopyFileStrategyChannel();
    }

    @Override
    public CopyFileStrategy createFilesCopyFileStrategy() {
        return new CopyFileStrategyPath();
    }
}
