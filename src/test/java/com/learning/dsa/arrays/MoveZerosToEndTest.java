package com.learning.dsa.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosToEndTest {

    private MoveZerosToEnd moveZerosToEnd = new MoveZerosToEnd();

    @Test
    void moveZeros() {
//        Assertions.assertArrayEquals(new int[]{8,5,10,20,0,0}, moveZerosToEnd.moveZeros(new int[] {8,5,0,10,0,20}));
        Assertions.assertArrayEquals(new int[]{10,0,0,0,0,0}, moveZerosToEnd.moveZeros(new int[] {0,0,0,10,0,0}));
    }

}