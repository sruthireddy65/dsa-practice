package com.learning.dsa.arrays;

public class MoveZerosToEnd {

    public int[] moveZeros(int[] input) {
        int pos = -1;
        for(int i=0; i < input.length; i++) {
            if(pos >= 0 && input[i] != 0) {
                input[pos] = input[i];
                input[i] = 0;
                pos = i;
            } else if (pos < 0 && input[i] == 0) {
                pos = i;
            }
        }
        return input;
    }
}
