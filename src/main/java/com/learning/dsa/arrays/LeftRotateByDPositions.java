package com.learning.dsa.arrays;

public class LeftRotateByDPositions {

    public int[] leftRotate(int[] input, int d) {

        if(d > input.length) {
            d = d % input.length;
        }
        reverse(input, 0, d-1);
        reverse(input, d, input.length - 1);
        reverse(input, 0, input.length - 1);

        return input;
    }

    private void reverse(int[] input, int low, int high) {
        while (low < high) {
            int temp = input[low];
            input[low] = input[high];
            input[high] = temp;
            low++;high--;
        }
    }
}
