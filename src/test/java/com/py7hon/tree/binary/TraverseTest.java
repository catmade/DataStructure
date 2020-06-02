package com.py7hon.tree.binary;


import lombok.var;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TraverseTest {

    public static BinaryTreeNode<Character> node1;
    public static String preOrder1 = "A B D G H C E I F";
    public static String middleOrder1 = "G D H B A E I C F";
    public static String postOrder1 = "G H D B I E F C A";

    /**
     * **********A
     * ******B      C
     * ****D      E   F
     * **G  H      I
     */
    @BeforeAll
    public static void init() {
        // 第四层
        var g = new BinaryTreeNode<>('G');
        var h = new BinaryTreeNode<>('H');
        var i = new BinaryTreeNode<>('I');

        // 第三层
        var d = new BinaryTreeNode<>('D');
        d.setLeftAndRight(g, h);
        var e = new BinaryTreeNode<>('E');
        e.setRight(i);
        var f = new BinaryTreeNode<>('F');

        // 第二层
        var b = new BinaryTreeNode<>('B');
        b.setLeft(d);
        var c = new BinaryTreeNode<>('C');
        c.setLeftAndRight(e, f);

        // 第一层次
        node1 = new BinaryTreeNode<>('A');
        node1.setLeftAndRight(b, c);
    }

    @Test
    public void all() {
        ArrayList<BinaryTreeNode<Character>> actuallyPreOrder = Traverse.preOrder(node1);
        assertEquals(preOrder1, getString(actuallyPreOrder));

        ArrayList<BinaryTreeNode<Character>> actuallyMiddleOrder = Traverse.middleOrder(node1);
        assertEquals(middleOrder1, getString(actuallyMiddleOrder));

        ArrayList<BinaryTreeNode<Character>> actuallyPostOrder = Traverse.postOrder(node1);
        assertEquals(postOrder1, getString(actuallyPostOrder));
    }

    private <T> String getString(ArrayList<BinaryTreeNode<T>> list) {
        StringBuilder builder = new StringBuilder();
        for (BinaryTreeNode<T> n : list) {
            builder.append(n.getData()).append(" ");
        }
        String str = builder.toString();
        return str.substring(0, str.length() - 1);
    }
}