package com.py7hon.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * 冒泡排序
 *
 * @author Seven
 * @version 1.0
 * @date 2020/9/3 10:54
 */
class BubbleSort implements Sort {
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array, j, i);
                }
            }
        }
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    swap(array, i, j);
                }
            }
        }
    }

    @Test
    public void test() {
        Sort sort = new BubbleSort();
        int[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int[] u1 = {28, 5, 6, 7, 8, 9, 17, 18, 14, 23, 24, 1, 29, 30, 15, 16, 19, 2, 3, 4, 25, 26, 27, 11, 12, 13, 20, 21, 22};
        int[] u2 = {28, 5, 20, 21, 22, 17, 18, 6, 7, 8, 9, 19, 2, 3, 4, 25, 1, 14, 26, 27, 11, 12, 13, 23, 24, 29, 30, 15, 16};
        int[] u3 = {25, 20, 21, 22, 17, 1, 28, 5, 9, 19, 2, 3, 4, 18, 6, 11, 12, 13, 27, 23, 24, 29, 30, 15, 7, 8, 14, 26, 16};
        sort.sort(u1);
        assertArrayEquals(sorted, u1);
        sort.sort(u2);
        assertArrayEquals(sorted, u2);
        sort.sort(u3);
        assertArrayEquals(sorted, u3);
    }

    @Test
    public void testGenerics() {
        Sort sort = new BubbleSort();
        Integer[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        Integer[] u1 = {28, 5, 6, 7, 8, 9, 17, 18, 14, 23, 24, 1, 29, 30, 15, 16, 19, 2, 3, 4, 25, 26, 27, 11, 12, 13, 20, 21, 22};
        Integer[] u2 = {28, 5, 20, 21, 22, 17, 18, 6, 7, 8, 9, 19, 2, 3, 4, 25, 1, 14, 26, 27, 11, 12, 13, 23, 24, 29, 30, 15, 16};
        Integer[] u3 = {25, 20, 21, 22, 17, 1, 28, 5, 9, 19, 2, 3, 4, 18, 6, 11, 12, 13, 27, 23, 24, 29, 30, 15, 7, 8, 14, 26, 16};
        sort.sort(u1);
        assertArrayEquals(sorted, u1);
        sort.sort(u2);
        assertArrayEquals(sorted, u2);
        sort.sort(u3);
        assertArrayEquals(sorted, u3);
    }
}
