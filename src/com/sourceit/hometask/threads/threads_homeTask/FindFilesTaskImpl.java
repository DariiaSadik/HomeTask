package com.sourceit.hometask.threads.threads_homeTask;

import com.sourceit.hometask.threads.FindFilesTask;
import com.sourceit.hometask.threads.TaskExecutionFailedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FindFilesTaskImpl implements FindFilesTask {
    private String directory;
    private String fileName;
    private PrintStream printStream;
    private int tryCount;

    @Override
    public void setDirectory(String s) throws NullPointerException, FileNotFoundException {
        directory = s;
    }

    @Override
    public void setFileNameSearchString(String s) throws IllegalArgumentException {
        fileName = s;
    }

    @Override
    public void setPrintStream(PrintStream printStream) {
        this.printStream = printStream;
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
        File file = new File(directory);
        for (File search : file.listFiles()) {
            if(fileName.equals(search.getName())) {
                printStream.println(search.getName());
            }
        }
    }
}
