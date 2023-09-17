package com.learning.dsa.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class InOrderTraversalTest {

    private InOrderTraversal inOrderTraversal = new InOrderTraversal();

    @Test
    void testInorder() {

        Node root = new Node(10);
        root.setLeft(new Node(20));
        root.setRight(new Node(30));
        root.getRight().setLeft(new Node(40));
        root.getRight().setRight(new Node(50));
        Assertions.assertEquals(Arrays.asList(20,10,40,30,50), inOrderTraversal.inorder(root, new ArrayList<>()));
        Assertions.assertEquals(Arrays.asList(), inOrderTraversal.inorder(null, new ArrayList<>()));
    }
}