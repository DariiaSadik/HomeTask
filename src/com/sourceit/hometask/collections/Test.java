package com.sourceit.hometask.collections;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // Collections
        Collection<Integer> integers = new ArrayList<>();
        integers.add(new Integer(1));
        integers.add(new Integer(4));
        integers.add(new Integer(2));
        integers.add(new Integer(7));
        integers.add(new Integer(3));
        integers.add(new Integer(0));

        Collection<Integer> integers2 = new ArrayList<>();
        integers2.add(new Integer(0));
        integers2.add(new Integer(1));
        integers2.add(new Integer(4));
        integers2.add(new Integer(7));
        integers2.add(new Integer(2));
        integers2.add(new Integer(0));

        // CollectionUtils union
        System.out.println("\n --- Collections --- ");
        try{
            System.out.println("input: ");
            System.out.println(integers + " and " + integers2);
            CollectionUtilsImpl collectionUtils = new CollectionUtilsImpl();
            System.out.println("output: ");
            // CollectionUtils union
            System.out.println("union: " + collectionUtils.union(integers, integers2)
                    + " size: " + collectionUtils.union(integers, integers2).size());
            // CollectionUtils unionWithoutDuplicates
            System.out.println("union Without Duplicates: "
                    + collectionUtils.unionWithoutDuplicates(integers, integers2)
                    + " size: " + collectionUtils.unionWithoutDuplicates(integers, integers2).size());
            // CollectionUtils intersection
            System.out.println("intersection: "
                    + collectionUtils.intersection(integers, integers2)
                    + " size: " + collectionUtils.intersection(integers, integers2).size());
            // CollectionUtils intersectionWithoutDuplicates
            System.out.println("intersection Without Duplicates: "
                    + collectionUtils.intersectionWithoutDuplicates(integers, integers2)
                    + " size: " + collectionUtils.intersectionWithoutDuplicates(integers, integers2).size());
            // CollectionUtils difference
            System.out.println("difference: "
                    + collectionUtils.difference(integers, integers2)
                    + " size: " + collectionUtils.difference(integers, integers2).size());
        } catch(NullPointerException nullPointExc){
            System.out.println ("Collection 1 and Collection 2 are null");
            nullPointExc.printStackTrace();
        }

        // List
        System.out.println("\n --- List ---");
        ListUtilsImpl listUtils = new ListUtilsImpl();
        String[] array = new String[2];
//        {"Sunday", "Monday", "Tuesday", "Wednesday",
//                "Thursday", "Friday", "Saturday"};
        System.out.println("input: ");
        System.out.println(listUtils.asList(array));
        System.out.println("output: ");
        System.out.println(listUtils.sortedList(listUtils.asList(array)));

        // Set
        System.out.println("\n --- Set ---");
        SetUtilsImpl setUtils = new SetUtilsImpl();

        Set<String> str = new HashSet<>();
        str.add("Sunday");
        str.add("Monday");
        str.add("Tuesday");

        Collection<Integer> intCollect = new ArrayList<>();
        intCollect.add(new Integer(2));
        intCollect.add(new Integer(1));
        intCollect.add(new Integer(0));
        System.out.println("output: ");
        System.out.println(setUtils.orderedSet(intCollect, str));

        // Map
        System.out.println("\n --- Map ---");
        Map<Integer, String> test = new HashMap<>();
        test.put(1, "One");
        test.put(2, "two");
        test.put(3, "three");

        System.out.println(test.keySet());
        test.remove(2);
        System.out.println(test.toString());
        System.out.println(test.get(1));
        System.out.println(test.isEmpty());
        System.out.println(test.containsValue("One"));
        System.out.println(test.values());
    }
}
