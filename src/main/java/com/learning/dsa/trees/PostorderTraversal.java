package com.learning.dsa.trees;

import java.util.List;

public class PostorderTraversal {

    public List<Integer> postOrder(Node root, List<Integer> result) {

        if (root != null) {

            postOrder(root.getLeft(), result);
            postOrder(root.getRight(), result);
            result.add(root.getValue());
        }
        return result;
    }
}
