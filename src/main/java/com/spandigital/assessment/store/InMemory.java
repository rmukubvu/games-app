package com.spandigital.assessment.store;

import com.spandigital.assessment.contract.Database;

import java.util.*;

public class InMemory<V> implements Database<V> {
    private Hashtable<String,V> database = new Hashtable<>();

    @Override
    public void save(String key, V value) {
        Objects.requireNonNull(key);
        database.put(key,value);
    }

    @Override
    public V get(String key) {
        return database.get(key);
    }

    @Override
    public Iterable<V> getAll() {
        List<V> result = new ArrayList<>();
        for (V entry : database.values()
             ) {
            result.add(entry);
        }
        return result;
    }

    @Override
    public int count() {
        return database.size();
    }
}
