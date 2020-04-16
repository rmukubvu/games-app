package com.spandigital.assessment.helper;

import com.spandigital.assessment.model.Team;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class RankSortingTest {

    private List<Team> unsortedList = new ArrayList<>();
    @Before
    public void setup(){
        unsortedList.add(new Team("A",0,5));
        unsortedList.add(new Team("D",0,6));
        unsortedList.add(new Team("C",0,3));
        unsortedList.add(new Team("E",0,5));
        unsortedList.add(new Team("B",0,9));
        //then apply sorting
        RankSorting.sort(unsortedList);
        //when sorted should be
        //1.top team is B on index -> 0
        //2.D on index -> 1
        //3.A on index -> 2
        //4.E on index -> 3
        //5.last team is C
    }

    @Test
    public void sort_list_must_be_ordered_top_must_be_A() {
        String actual = unsortedList.get(0).getName();
        String errorMessage = String.format("expected B got [%s]", actual);
        Assert.assertTrue(errorMessage,actual.equalsIgnoreCase("B"));
    }

    @Test
    public void sort_list_must_be_ordered_top_must_be_C() {
        int lastIndex = unsortedList.size() - 1;
        String actual = unsortedList.get(lastIndex).getName();
        String errorMessage = String.format("expected C got [%s]", actual);
        Assert.assertTrue(errorMessage,actual.equalsIgnoreCase("C"));
    }

    @Test
    public void sort_list_must_be_ordered_A_must_be_thirdC() {
        String actual = unsortedList.get(2).getName();
        String errorMessage = String.format("expected A got [%s]", actual);
        Assert.assertTrue(errorMessage,actual.equalsIgnoreCase("A"));
    }
}
