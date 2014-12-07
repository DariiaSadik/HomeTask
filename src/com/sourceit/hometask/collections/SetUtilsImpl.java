package com.sourceit.hometask.collections;

import java.util.*;

public class SetUtilsImpl implements SetUtils {

    @Override
    public SortedSet<String> orderedSet(Collection<Integer> integers, Set<String> strings) throws NullPointerException {
        if(integers == null || strings == null) throw new NullPointerException();

        String[] strArray = strings.toArray(new String[strings.size()]);
        Integer[] intArray = integers.toArray(new Integer[integers.size()]);
        final Map<String, Integer> map = new HashMap<>();
        for (int i = 0 ; i < integers.size(); i++){
            map.put(strArray[i], intArray[i]);
        }
        SortedSet<String> sortedSet = new TreeSet(new Comparator<String>() {
            @Override
            public int compare(String str, String str2) {
                return map.get(str).compareTo(map.get(str2));
            }
        });
        sortedSet.addAll(strings);
        return sortedSet;
    }

    @Override
    public Set<Integer> customOrderSet(Integer... integers) throws NullPointerException {
        if (integers.equals(null)) throw new NullPointerException();
        Set<Integer> customOrderSet = new LinkedHashSet<>();
        for (int i = 0; i < integers.length; i++){
            customOrderSet.add(integers[i]);
        }
        return customOrderSet;
    }

    public static void main(String[] args) {
        SetUtilsImpl order = new SetUtilsImpl();

        Collection<Integer> value = new ArrayList<>();
        value.add(1);
        value.add(3);
        value.add(5);
        value.add(7);
        value.add(11);
        value.add(9);

        Set<String> key = new LinkedHashSet<>();
        key.add("a");
        key.add("y");
        key.add("u");
        key.add("q");
        key.add("i");
        key.add("p");
        System.out.println(order.orderedSet(value, key).toString());
    }
}
