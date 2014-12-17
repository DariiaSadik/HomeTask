package com.sourceit.hometask.threads.threads_homeTask;

import com.sourceit.hometask.threads.Task;
import com.sourceit.hometask.threads.TasksStorage;
import java.util.*;

public class TasksStorageImpl implements TasksStorage {
    List<Task> taskList = new LinkedList();
    @Override
    public synchronized void add(Task task) throws NullPointerException {
        taskList.add(task);
    }

    @Override
    public synchronized Task get() {
        if(taskList.isEmpty()) {
            return null;
        } else {
            return taskList.get(0);
//            taskList.remove(0);
        }
    }

    @Override
    public synchronized int count() {
        return taskList.size();
    }
}
