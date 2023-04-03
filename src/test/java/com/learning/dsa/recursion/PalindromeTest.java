package com.learning.dsa.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private Palindrome palindrome = new Palindrome();

    @Test
    void isPalindrome() {
        assertTrue(palindrome.isPalindrome("madam"));
        assertTrue(palindrome.isPalindrome("level"));
        assertTrue(palindrome.isPalindrome("12321"));
    }
}