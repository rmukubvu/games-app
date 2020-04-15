package com.spandigital.assessment.store;

import com.spandigital.assessment.contract.OnStoreResult;

import java.util.*;

public class InMemory<V> implements OnStoreResult<V> {
    private Hashtable<String,V> database = new Hashtable<>();

    @Override
    public void saveResult(String key,V value) {
        Objects.requireNonNull(key);
        database.put(key,value);
    }

    @Override
    public Iterable<V> getValues() {
        List<V> result = new ArrayList<>();
        for (Map.Entry<String,V> entry : database.entrySet()
             ) {
            result.add(entry.getValue());
        }
        return result;
    }

    @Override
    public int count() {
        return database.size();
    }
}
