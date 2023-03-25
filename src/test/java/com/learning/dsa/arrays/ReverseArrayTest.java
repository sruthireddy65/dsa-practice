package com.learning.dsa.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseArrayTest {

    ReverseArray reverseArray = new ReverseArray();

    @Test
    public void reverseArray() {
        Assertions.assertArrayEquals(new int[]{4,3,2,1}, reverseArray.reverseArray(new int[]{1,2,3,4}));
    }

}