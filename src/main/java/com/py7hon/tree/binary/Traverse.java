package com.py7hon.tree.binary;

import java.util.ArrayList;

/**
 * 遍历器
 * D=Degree
 * L=Left
 * R=Right
 *
 * @author Seven
 * @version 1.0
 * @date 2020/6/2 17:02
 */
public class Traverse {

    /**
     * 前序遍历
     *
     * @param node 节点
     * @return 遍历结果
     */
    public static <T> ArrayList<BinaryTreeNode<T>> preOrder(BinaryTreeNode<T> node) {
        ArrayList<BinaryTreeNode<T>> result = new ArrayList<>();
        if (node == null) {
            return result;
        }

        result.add(node);
        result.addAll(preOrder(node.getLeft()));
        result.addAll(preOrder(node.getRight()));

        return result;
    }

    /**
     * 中序遍历
     *
     * @param node 节点
     * @return 遍历结果
     */
    public static <T> ArrayList<BinaryTreeNode<T>> middleOrder(BinaryTreeNode<T> node) {
        ArrayList<BinaryTreeNode<T>> result = new ArrayList<>();
        if (node == null) {
            return result;
        }

        result.addAll(middleOrder(node.getLeft()));
        result.add(node);
        result.addAll(middleOrder(node.getRight()));

        return result;
    }

    /**
     * 后序遍历
     *
     * @param node 节点
     * @return 遍历结果
     */
    public static <T> ArrayList<BinaryTreeNode<T>> postOrder(BinaryTreeNode<T> node) {
        ArrayList<BinaryTreeNode<T>> result = new ArrayList<>();
        if (node == null) {
            return result;
        }

        result.addAll(postOrder(node.getLeft()));
        result.addAll(postOrder(node.getRight()));
        result.add(node);

        return result;
    }


}
