package com.sourceit.hometask.collections;

import java.util.*;

public class SetUtilsImpl implements SetUtils {

    @Override
    public SortedSet<String> orderedSet(Collection<Integer> integers, Set<String> strings) throws NullPointerException {
        if(integers == null || strings == null) throw new NullPointerException();
        Integer[] intArray = integers.toArray(new Integer[integers.size()]);
        String[] strArray = strings.toArray(new String[strings.size()]);
        SortedSet<String> sortedSet = new TreeSet();
        for (int i = intArray.length - 1; i >= 0; i--){
            for (int j = 0; j < i; j++){
                if(intArray[j] > intArray[j + 1]){
                    Integer tempInt = intArray[i];
                    String tempStr = strArray[i];
                    intArray[i] = intArray[j];
                    strArray[i] = strArray[j];
                    intArray[j] = tempInt;
                    strArray[j] = tempStr;
                }
            }
        }
        for (int i = 0; i < strArray.length; i++){
            sortedSet.add(strArray[i]);
        }
        return sortedSet;
    }

    @Override
    public Set<Integer> customOrderSet(Integer... integers) throws NullPointerException {
        if (integers.length == 0) throw new NullPointerException();
        Set<Integer> customOrderSet = new HashSet<>();
        for (int i = 0; i < integers.length; i++){
            customOrderSet.add(integers[i]);
        }
        return customOrderSet;
    }
}
