package com.spandigital.assessment.contract;

public interface Database<V> {
    void save(String key, V value);
    V get(String key);
    Iterable<V> getAll();
    int count();
}
