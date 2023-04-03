package com.learning.dsa.recursion;

public class Palindrome {

    public boolean isPalindrome(String input) {
        int low = 0;
        int high = input.length() - 1;
        if(input.length() == 1) {
            return true;
        }
        return input.charAt(low) == input.charAt(high) && isPalindrome(input.substring(low+1, high));
    }
}
