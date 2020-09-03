package com.py7hon.tree.binary;

/**
 * 平衡二叉树
 *
 * @author Seven
 * @version 1.0
 * @date 2020/6/2 21:40
 */
public class AVLNode<T> extends BinaryTreeNode {
    /**
     * 父节点
     */
    private AVLNode<T> parent;

    public AVLNode(Object data) {
        super(data);
    }
}
