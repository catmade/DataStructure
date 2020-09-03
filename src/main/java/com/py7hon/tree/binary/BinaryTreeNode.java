package com.py7hon.tree.binary;

import lombok.Getter;
import lombok.Setter;

/**
 * 二叉树节点
 *
 * @author Seven
 * @version 1.0
 * @date 2020/6/2 16:54
 */
@Getter
@Setter
public class BinaryTreeNode<T> {
    /**
     * 左孩子
     */
    private BinaryTreeNode<T> left;

    /**
     * 右孩子
     */
    private BinaryTreeNode<T> right;

    /**
     * 数据
     */
    private T data;

    public BinaryTreeNode(T data) {
        this.data = data;
    }

    /**
     * 设置左节点和右节点
     *
     * @param left  左节点
     * @param right 右节点
     */
    public void setLeftAndRight(BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 深度
     *
     * @return 深度
     */
    public int deep() {
        if (this.left == null && this.right == null) {
            return 1;
        }

        int leftDeep = this.left == null ? 0 : this.left.deep();
        int rightDeep = this.right == null ? 0 : this.right.deep();

        return 1 + Math.max(leftDeep, rightDeep);
    }

    @Override
    public String toString() {
        return data.toString();
    }
}


