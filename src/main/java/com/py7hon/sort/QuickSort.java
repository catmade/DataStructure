package com.py7hon.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * 快速排序
 *
 * @author Seven
 * @version 1.0
 * @date 2020/9/2 20:20
 */
public class QuickSort implements Sort {
    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    /**
     * 局部排序
     *
     * @param array 待排序数组
     * @param start 待排序的部分开始下标
     * @param end   待排序部分的结束下标
     */
    public void sort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int low = start, height = end, pivot = start;
        while (start != height) {
            // 如果当前值比选定的比较值小，则把这个值和选定值交换位置
            if (array[low] < array[pivot]) {
                swap(array, low, pivot);
                pivot = low;
                low++;
            } else if (array[height] > array[pivot]) {
                height--;
            } else {
                swap(array, height, low);
            }
        }
        // 左半部分和右半部分执行上诉相同操作
        sort(array, start, pivot - 1);
        sort(array, pivot + 1, end);
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] array) {
        sort(array, 0, array.length - 1);
    }

    private <T extends Comparable<T>> void sort(T[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int low = start, height = end, pivot = start;
        while (low < height) {
            if (array[low].compareTo(array[pivot]) < 0) {
                swap(array, low, pivot);
                pivot = low;
                low++;
            } else if (array[height].compareTo(array[pivot]) > 0) {
                height--;
            } else {
                swap(array, low, height);
            }
        }
        sort(array, start, pivot - 1);
        sort(array, pivot + 1, end);

    }

    @Test
    public void test() {
        Sort sort = new QuickSort();
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
        Sort sort = new QuickSort();
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
