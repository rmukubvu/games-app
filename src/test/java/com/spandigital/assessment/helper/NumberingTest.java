package com.spandigital.assessment.helper;

import com.spandigital.assessment.model.Team;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

public class NumberingTest {

    private List<Team> teamList = new ArrayList<>();

    @Before
    public void setup(){
        teamList.add(new Team("A",0,5));
        teamList.add(new Team("D",0,6));
        teamList.add(new Team("C",0,3));
        teamList.add(new Team("E",0,5));
        teamList.add(new Team("B",0,9));
    }

    @Test
    public void show_has_data() {
        Assert.assertTrue("show failed to create display output",Numbering.format(teamList).length() > 0);
    }

}
