package com.sourceit.hometask.collections;

import java.util.*;

public class MultiValueMapImpl<K, V> implements MultiValueMap<K, V>{
    private Map<K, List<V>> mapArr = new HashMap<>();

    @Override
    public int getCountValues(K k) {
        int count = 0;
        if(mapArr.containsValue(k)){
            count  = mapArr.get(k).size();
        }
        return count;
    }

    @Override
    public int size() {
        return mapArr.size();
    }

    @Override
    public boolean isEmpty() {
        return mapArr.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        if (mapArr.containsKey(key)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (K key : mapArr.keySet()) {
            List<V> values = mapArr.get(key);
            if (values.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Object o) {
        V var = null;
        if(mapArr.containsValue(o)){
            List<V> value = mapArr.get(o);
            var = value.get(value.size() - 1);
        }
        return var;
    }

    @Override
    public V put(K key, V value) {
        if(mapArr.containsKey(key)){
            List<V> values = mapArr.get(key);
            values.add(value);
        } else {
            List<V> val = new ArrayList<>();
            val.add(value);
            mapArr.put(key, val);
        }
        return value;
    }

    @Override
    public Iterator<V> getIterator(K k) {
        List<V> value = mapArr.get(k);
        if(value != null) {
            return value.iterator();
        }
        return null;
    }

    @Override
    public V remove(Object o) {
        V value = get(o);
        mapArr.remove(o);
        return value;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for(K key : m.keySet()){
            put(key, m.get(key));
        }
    }

    @Override
    public void clear() {
        mapArr.clear();
    }

    @Override
    public Set<K> keySet() {
        return mapArr.keySet();
    }

    @Override
    public Collection<V> values() {
        Collection<V> values = new ArrayList<>();
        for (K key : mapArr.keySet()) {
            values.addAll(mapArr.get(key));
        }
        return values;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> entries = new LinkedHashSet<>();
//        for(K key : mapArr.entrySet()){
//            List<V> value = mapArr.get(key);
//
//            entries.add(key, value.get(value.size() - 1));
//        }
         // V -> значение последнее элемента в List
        return entries;
    }

    @Override
    public String toString() {
        return "MultiValueMapImpl{" +
                "mapArr=" + mapArr +
                '}';
    }

    public static void main(String[] args) {
        MultiValueMapImpl<Integer, String> valueMap = new MultiValueMapImpl<>();
        valueMap.put(1, "one");
        valueMap.put(2, "two");
        valueMap.put(3, "tree");
        valueMap.put(4, "four");
        System.out.println(valueMap);
    }
}
