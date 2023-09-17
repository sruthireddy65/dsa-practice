package com.learning.dsa.trees;

import java.util.List;

public class PreorderTraversal {

    public List<Integer> preorder(Node node, List<Integer> result) {

        if(node != null) {
            result.add(node.getValue());
            preorder(node.getLeft(), result);
            preorder(node.getRight(), result);
        }
        return result;
    }
}
