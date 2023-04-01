package com.learning.dsa.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeadersInAnArrayTest {

    private LeadersInAnArray leadersInAnArray = new LeadersInAnArray();

    @Test
    void leaders() {
        Assertions.assertArrayEquals(new int[]{50, 30}, leadersInAnArray.leaders(new int[]{10,50,20,30}));
        Assertions.assertArrayEquals(new int[]{30}, leadersInAnArray.leaders(new int[]{10,20,30}));
        Assertions.assertArrayEquals(new int[]{30}, leadersInAnArray.leaders(new int[]{30}));
    }
}