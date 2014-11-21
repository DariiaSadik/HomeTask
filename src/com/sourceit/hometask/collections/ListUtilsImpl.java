package com.sourceit.hometask.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtilsImpl implements ListUtils{

    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < strings.length; i++){
            list.add(strings[i]);
        }
        return list;
    }

    @Override
    public <T extends Comparable<T>> List<T> sortedList(List<T> ts) throws IllegalArgumentException {
        List<T> list = new ArrayList<>();
        Collections.sort(ts);
        list.addAll(ts);
        return list;
    }
}
