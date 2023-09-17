package com.learning.dsa.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PreorderTraversalTest {

    private PreorderTraversal preorderTraversal = new PreorderTraversal();

    @Test
    void tstPreorder() {

        Node root = new Node(10);
        root.setLeft(new Node(20));
        root.setRight(new Node(30));
        root.getRight().setLeft(new Node(40));
        root.getRight().setRight(new Node(50));
        Assertions.assertEquals(Arrays.asList(10,20,30,40,50), preorderTraversal.preorder(root, new ArrayList<>()));
        Assertions.assertEquals(new ArrayList<>(), preorderTraversal.preorder(null, new ArrayList<>()));
    }
}