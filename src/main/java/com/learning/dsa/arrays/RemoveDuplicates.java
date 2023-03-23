package com.learning.dsa.arrays;


public class RemoveDuplicates {

    public int removeDuplicates(int[] input) {
        int position = 0, i=1;
        while(i <= input.length - 1) {
            if(input[position] == input[i]) {
                i++;
            } else {
                input[++position] = input[i];
            }
        }
        return position;
    }
}
