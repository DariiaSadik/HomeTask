package com.sourceit.hometask.collections;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils{

    void isNull(Collection<Integer> integers, Collection<Integer> integers2) throws NullPointerException{
        if (integers.isEmpty() || integers2.isEmpty() ) throw new NullPointerException();
    }
    @Override
    public Collection<Integer> union(Collection<Integer> integers, Collection<Integer> integers2) {
        //if (integers.isEmpty() || integers2.isEmpty() ) throw new NullPointerException();
        isNull(integers, integers2);
        Collection<Integer> unionList = new ArrayList<>();
        unionList.addAll(integers);
        unionList.addAll(integers2);
        return unionList;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> integers, Collection<Integer> integers2) {
        isNull(integers, integers2);
        Collection<Integer> intersectionList = new ArrayList<>();
        intersectionList.addAll(integers);
        intersectionList.retainAll(integers2); // Retains only the elements in this list
        return intersectionList;
    }

    @Override
    public Set<Integer> unionWithoutDuplicates(Collection<Integer> integers, Collection<Integer> integers2) {
        isNull(integers, integers2);
        Set<Integer> unionSet = new HashSet<>();
        unionSet.addAll(integers);
        unionSet.addAll(integers2);
        return unionSet;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicates(Collection<Integer> integers, Collection<Integer> integers2) {
        isNull(integers, integers2);
        Set<Integer> unionSet = new HashSet<>();
        unionSet.addAll(integers);
        unionSet.retainAll(integers2);
        return unionSet;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> integers, Collection<Integer> integers2) {
//        isNull(integers, integers2);
//        Collection<Integer> differenceList = new ArrayList<>();
//        differenceList.addAll(integers);
//        differenceList.removeAll(integers2); //Removes from this list all of its elements
//        return differenceList;

       // (A union B) intersection B
        isNull(integers, integers2);
        Collection<Integer> differenceList = new ArrayList<>();
        Collection<Integer> mult = new ArrayList<>();
        Collection<Integer> mult2 = new ArrayList<>();
        mult.addAll(integers);
        mult.removeAll(integers2); //Removes from this list all of its elements
        mult2.addAll(integers2);
        mult2.removeAll(integers);
        differenceList.addAll(mult);
        differenceList.addAll(mult2);
        return differenceList;
    }
}
