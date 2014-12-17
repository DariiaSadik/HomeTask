package com.sourceit.hometask.threads.threads_homeTask;

import com.sourceit.hometask.threads.*;

public class TaskExecutorImpl implements TaskExecutor {
    private static final int MAX_TRY = 5;
    private static final int TIME_SLEEP = 100;

    private TasksStorage tasksStorage;
    private boolean started = false;
    private boolean stoped = false;


    @Override
    public void setStorage(TasksStorage tasksStorage) throws NullPointerException {
        this.tasksStorage = tasksStorage;
    }

    @Override
    public TasksStorage getStorage() {
        return tasksStorage;
    }

    @Override
    public void start() throws NullPointerException, IllegalStateException {
        if(started) throw new IllegalStateException();
        started = true;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(!stoped) {
                    Task task = tasksStorage.get();
                    if(task != null) {
                        task.incTryCount();
                        try{
                            if(task.getTryCount() < MAX_TRY) {
                                tasksStorage.add(task);
                                System.out.println("executed " +
                                        Thread.currentThread().getName());
                            }
                        } catch(Exception exc) {
                            exc.printStackTrace();
                        }
                    }
                    try{
                        System.out.println("Sleep " +
                                Thread.currentThread().getName());
                        Thread.sleep(TIME_SLEEP);
                    } catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
    }

    @Override
    public void stop() throws IllegalStateException {
        if(!started) throw new IllegalStateException();
        stoped = true;
        started = false;
    }
}
