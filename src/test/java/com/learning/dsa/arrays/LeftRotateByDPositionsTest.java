package com.learning.dsa.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LeftRotateByDPositionsTest {

    private LeftRotateByDPositions leftRotateByDPositions = new LeftRotateByDPositions();

    @Test
    void testLeftRotate() {
        Assertions.assertArrayEquals(new int[]{3,4,5,1,2}, leftRotateByDPositions.leftRotate(new int[] {1,2,3,4,5}, 2));
        Assertions.assertArrayEquals(new int[]{3,4,5,1,2}, leftRotateByDPositions.leftRotate(new int[] {1,2,3,4,5}, 12));
        Assertions.assertArrayEquals(new int[]{4,5,6,1,2,3}, leftRotateByDPositions.leftRotate(new int[] {1,2,3,4,5,6}, 3));
    }

}