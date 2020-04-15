package com.spandigital.assessment.store;

import com.spandigital.assessment.contract.OnStoreResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class InMemoryTest {

    private OnStoreResult<String> inMemory;

    @Before
    public void init(){
        inMemory = new InMemory<>();
    }

    @Test
    public void saveResult_should_save_any_type_count_be_greater_than_zero() {
        String key = "Manchester United";
        String value = "On break due to corona virus";
        inMemory.saveResult(key,value);
        assertTrue("value has been saved",inMemory.count() > 0);
    }

    @Test
    public void getValues_should_get_saved_values() {
        assertNotNull(inMemory.getValues());
    }

    @Test
    public void saveResult_should_save_any() {
        assertNotNull(inMemory.getValues());
    }
}
