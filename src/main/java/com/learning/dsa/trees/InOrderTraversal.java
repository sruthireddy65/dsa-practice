package com.learning.dsa.trees;

import java.util.List;

public class InOrderTraversal {

    public List<Integer> inorder(Node root, List<Integer> result) {

        if(root != null) {
            inorder(root.getLeft(), result);
            result.add(root.getValue());
            inorder(root.getRight(), result);
        }
        return result;
    }
}
