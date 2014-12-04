package com.sourceit.hometask.collections;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils{

    void isNull(Collection<Integer> integers, Collection<Integer> integers2) throws NullPointerException{
        if (integers.isEmpty() || integers2.isEmpty() ) throw new NullPointerException();
    }
    @Override
    public Collection<Integer> union(Collection<Integer> integers, Collection<Integer> integers2) {
        isNull(integers, integers2);
        Collection<Integer> unionList = new ArrayList<>(integers);
        unionList.addAll(integers2);
        return unionList;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> integers, Collection<Integer> integers2) {
        isNull(integers, integers2);
        Collection<Integer> intersectionList = new ArrayList<>(integers);
        intersectionList.retainAll(integers2); // Retains only the elements in this list
        return intersectionList;
    }

    @Override
    public Set<Integer> unionWithoutDuplicates(Collection<Integer> integers, Collection<Integer> integers2) {
        isNull(integers, integers2);
        Set<Integer> unionSet = new HashSet<>(integers);
        unionSet.addAll(integers2);
        return unionSet;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicates(Collection<Integer> integers, Collection<Integer> integers2) {
        isNull(integers, integers2);
        Set<Integer> unionSet = new HashSet<>(integers);
        unionSet.addAll(integers);
        unionSet.retainAll(integers2);
        return unionSet;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> integers, Collection<Integer> integers2) {
        isNull(integers, integers2);
        Collection<Integer> differenceList = new ArrayList<>(integers);
        Collection<Integer> mult = new ArrayList<>(integers2);
        differenceList.removeAll(integers2);
        mult.removeAll(integers); //Removes from this list all of its elements
        differenceList.addAll(mult);
        return differenceList;
    }
}
