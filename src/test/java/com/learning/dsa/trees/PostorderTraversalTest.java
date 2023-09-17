package com.learning.dsa.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PostorderTraversalTest {

    private PostorderTraversal postorderTraversal = new PostorderTraversal();

    @Test
    void testPostOrder() {
        Node node = new Node(10);
        node.setLeft(new Node(20));
        node.setRight(new Node(30));
        node.getRight().setLeft(new Node(40));
        node.getRight().setRight(new Node(50));

        Assertions.assertEquals(Arrays.asList(20,40,50,30,10), postorderTraversal.postOrder(node, new ArrayList<>()));
        Assertions.assertEquals(new ArrayList<>(), postorderTraversal.postOrder(null, new ArrayList<>()));
    }
}