package com.sourceit.hometask.threads.threads_homeTask;

import com.sourceit.hometask.io.CopyFileFactoryImpl;
import com.sourceit.hometask.threads.CopyFileTask;
import com.sourceit.hometask.threads.FindFilesTask;
import com.sourceit.hometask.threads.TaskExecutor;
import com.sourceit.hometask.threads.TasksStorage;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        TasksStorage tasksStorage = new TasksStorageImpl();
        //
        CopyFileTask copyFileTask = new CopyFileTaskImpl();
        copyFileTask.setFileCopyUtils(new CopyFileFactoryImpl().createBufferedCopyFileStrategy());
        copyFileTask.setSourceFilePath("src/resources/test.jpg");
        copyFileTask.setDestinyFilePath("src/resources/test1.jpg");
        //
        tasksStorage.add(copyFileTask);
        //
        copyFileTask.setFileCopyUtils(new CopyFileFactoryImpl().createFilesCopyFileStrategy());
        copyFileTask.setSourceFilePath("src/resources/test.jpg");
        copyFileTask.setDestinyFilePath("src/resources/test2.jpg");
        //
        tasksStorage.add(copyFileTask);
        //
        copyFileTask.setFileCopyUtils(new CopyFileFactoryImpl().createChannelsCopyFileStrategy());
        copyFileTask.setSourceFilePath("src/resources/test.jpg");
        copyFileTask.setDestinyFilePath("src/resources/test3.jpg");
        //
        tasksStorage.add(copyFileTask);
        //
        FindFilesTask findFilesTask = new FindFilesTaskImpl();
        findFilesTask.setDirectory("src/resources/");
        findFilesTask.setFileNameSearchString("test.jpg");
        findFilesTask.setPrintStream(System.out);
        //
        System.out.println("First thread was started ");
        TaskExecutor taskExecutorFirst = new TaskExecutorImpl();
        taskExecutorFirst.setStorage(tasksStorage);
        taskExecutorFirst.start();
        System.out.println("Second thread was started");
        TaskExecutor taskExecutorSecond = new TaskExecutorImpl();
        taskExecutorSecond.setStorage(tasksStorage);
        taskExecutorSecond.start();
        System.out.println("Third thread was started");
        TaskExecutor taskExecutorThird = new TaskExecutorImpl();
        taskExecutorThird.setStorage(tasksStorage);
        taskExecutorThird.start();
        //
        try {
            System.out.println("SLEEP = 2000");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Third thread was stopped");
        taskExecutorFirst.stop();
        System.out.println("Third thread was stopped");
        taskExecutorThird.stop();
        System.out.println("Third thread was stopped");
        taskExecutorSecond.stop();
    }
}
