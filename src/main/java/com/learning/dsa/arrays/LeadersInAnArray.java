package com.learning.dsa.arrays;

import java.util.Arrays;

public class LeadersInAnArray {
    public int[] leaders(int[] input) {
        int pos = input.length - 1;
        for(int i=input.length - 2; i>=0; i--) {
            if (input[i] > input[pos]) {
                input[--pos] = input[i];
            }
        }
        return Arrays.copyOfRange(input, pos, input.length);
    }
}
