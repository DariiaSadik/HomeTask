package com.sourceit.hometask.collections;

import java.util.*;

public class MultiValueMapImpl<K, V> implements MultiValueMap{
    Map<K, V> mapArr = new HashMap<>();

    @Override
    public int getCountValues(Object key) {
        return mapArr.size();
    }

    @Override
    public int size() {
        if (mapArr == null) return 0;
        else return mapArr.size();
    }

    @Override
    public boolean isEmpty() {
        if(mapArr.isEmpty()) return true;
        else return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return mapArr.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return mapArr.containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return mapArr.get(key);
    }

    @Override
    public Object put(Object key, Object value) {
        if((key == null) || (value == null)) throw new IllegalArgumentException();
        return mapArr.put((K) key, (V) value);
    }

    @Override
    public Iterator getIterator(Object key) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        if(!containsKey(key)) return "";
        else return mapArr.remove(key);
    }

    @Override
    public void putAll(Map m) {
        if (!m.isEmpty()) mapArr.putAll(m);
    }

    @Override
    public void clear() {
        mapArr.clear();
    }

    @Override
    public Set keySet() {
        return mapArr.keySet();
    }

    @Override
    public Collection values() {
        List<V> valueList = new ArrayList<>();
        valueList.addAll(mapArr.values());
        return valueList;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
