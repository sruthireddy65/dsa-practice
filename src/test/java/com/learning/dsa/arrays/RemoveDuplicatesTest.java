package com.learning.dsa.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    public void testRemoveDuplicatesFromSortedArray() {

        int[] input = new int[] {10,20,20,30,30,40,40,40};
        int position = removeDuplicates.removeDuplicates(input);
        assertArrayEquals(new int[] {10,20,30,40}, Arrays.copyOf(input, position+1));
    }
}