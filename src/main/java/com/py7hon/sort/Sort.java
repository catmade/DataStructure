package com.py7hon.sort;

/**
 * 排序接口
 *
 * @author Seven
 * @version 1.0
 * @date 2020/9/2 20:16
 */
public interface Sort {
    /**
     * 从小到大排序
     *
     * @param array 数组
     */
    void sort(int[] array);

    /**
     * 从小到大排序
     *
     * @param array 数组
     */
    <T extends Comparable<T>> void sort(T[] array);

    /**
     * 交换数组的两个元素的位置
     *
     * @param array 数组
     * @param i     下标1
     * @param j     下标2
     * @param <T>   数据
     */
    default <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * 交换数组的两个元素的位置
     *
     * @param array 数组
     * @param i     下标1
     * @param j     下标2
     */
    default void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
