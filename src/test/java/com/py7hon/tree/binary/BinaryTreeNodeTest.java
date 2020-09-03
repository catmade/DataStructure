package com.py7hon.tree.binary;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeNodeTest {
    public static BinaryTreeNode<Character> a,
            b, c, d, e, f, g, h, i;

    /**
     * **********A
     * ******B      C
     * ****D      E   F
     * **G  H      I
     */
    @BeforeAll
    public static void init() {
        // 第四层
        g = new BinaryTreeNode<>('G');
        h = new BinaryTreeNode<>('H');
        i = new BinaryTreeNode<>('I');

        // 第三层
        d = new BinaryTreeNode<>('D');
        d.setLeftAndRight(g, h);
        e = new BinaryTreeNode<>('E');
        e.setRight(i);
        f = new BinaryTreeNode<>('F');

        // 第二层
        b = new BinaryTreeNode<>('B');
        b.setLeft(d);
        c = new BinaryTreeNode<>('C');
        c.setLeftAndRight(e, f);

        // 第一层次
        a = new BinaryTreeNode<>('A');
        a.setLeftAndRight(b, c);
    }


    /**
     * **********A
     * ******B      C
     * ****D      E   F
     * **G  H      I
     */
    @Test
    void deep() {
        assertEquals(4, a.deep());
        assertEquals(3, b.deep());
        assertEquals(3, c.deep());
        assertEquals(2, d.deep());
        assertEquals(2, e.deep());
        assertEquals(1, f.deep());
        assertEquals(1, g.deep());
        assertEquals(1, h.deep());
        assertEquals(1, i.deep());
    }
}