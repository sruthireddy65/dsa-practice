package com.learning.dsa.arrays;

public class ReverseArray {

    public int[] reverseArray(int[] input) {
        for(int i=0, j=input.length - 1; i < j; i++, j--) {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
        return input;
    }
}
