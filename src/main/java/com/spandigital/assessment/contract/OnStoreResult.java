package com.spandigital.assessment.contract;

public interface OnStoreResult<V> {
    void saveResult(String key,V value);
    Iterable<V> getValues();
    int count();
}
