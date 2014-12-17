package com.sourceit.hometask.threads.threads_homeTask;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileCopyFailedException;
import com.sourceit.hometask.threads.CopyFileTask;
import com.sourceit.hometask.threads.TaskExecutionFailedException;

import java.io.File;

public class CopyFileTaskImpl implements CopyFileTask {
    private CopyFileStrategy copyFileStrategy;
    private File source;
    private File destiny;
    private int tryCount;

    @Override
    public void setFileCopyUtils(CopyFileStrategy copyFileStrategy) {
        this.copyFileStrategy = copyFileStrategy;
    }

    @Override
    public void setSourceFilePath(String s) {
        this.source = new File(s);
    }

    @Override
    public void setDestinyFilePath(String s) {
        this.destiny = new File(s);
    }

    @Override
    public int getTryCount() {
        return tryCount;
    }

    @Override
    public void incTryCount() {
        tryCount++;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try{
            copyFileStrategy.copyFile(source, destiny);
        } catch(FileCopyFailedException exc) {
            throw new TaskExecutionFailedException(exc);
        }
    }
}
