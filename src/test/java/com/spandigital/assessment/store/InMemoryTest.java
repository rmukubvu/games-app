package com.spandigital.assessment.store;

import com.spandigital.assessment.contract.Database;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InMemoryTest {

    private Database<Integer> inMemory;

    @Before
    public void init(){
        inMemory = new InMemory<>();
    }

    @Test
    public void saveResult_should_save_any_type_count_be_greater_than_zero() {
        String key = "Manchester United";
        int value = 1;
        inMemory.save(key,value);
        assertTrue("value has been saved",inMemory.count() > 0);
    }

    @Test
    public void get_must_return_value_if_key_present(){
        String key = "Manchester United";
        int expected = 1;
        inMemory.save(key,expected);
        int actual = inMemory.get(key);
        String errorMessage = String.format("expected [%d] got [%d]", expected, actual);
        assertEquals(errorMessage, actual, expected);
    }

    @Test
    public void must_update_value_if_key_already_present(){
        String key = "Manchester United";
        int value = 1;
        inMemory.save(key,value);
        int expected = 5;
        inMemory.save(key,expected);
        int actual = inMemory.get(key);
        String errorMessage = String.format("expected [%d] got [%d]", expected, actual);
        assertEquals(errorMessage, actual, expected);
    }

    @Test
    public void must_fail_and_show_null_if_key_is_not_present(){
        String key = "ab36egdh5769jdfkj";
        assertNull("expected null",inMemory.get(key));
    }

    @Test
    public void getValues_should_get_saved_values() {
        assertNotNull(inMemory.getAll());
    }

    @Test
    public void saveResult_should_save_any() {
        assertNotNull(inMemory.getAll());
    }
}
