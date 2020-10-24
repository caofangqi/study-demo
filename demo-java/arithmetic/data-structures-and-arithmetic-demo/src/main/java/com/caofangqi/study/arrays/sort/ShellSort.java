package com.caofangqi.study.arrays.sort;

/*
 *
 * 希尔排序
 * 希尔排序基于插入排序
 * 对于大规模乱序数组 插入排序很慢。因为它只会交换相邻的元素，因此元素只能一点一点的从数组一端移动到另一端，比如最小的元素在数组的尽头，那么它需要 n-1次移动
 * 希尔排序改进了插入排序，交换不相邻的元素以对数组的局部进行排序，并最终用插入排序将局部有序的数组排序
 *
 *
 * */
public class ShellSort implements Sort {

  @Override
  public void sort(Comparable[] arr) {

    int length = arr.length;

    int h = 1;
    while (h < length / 3) h = 3 * h + 1;
    while (h >= 1) {
      for (int i = h; i < length; i++) {
        for (int j = i; j >= h && less(arr[j], arr[j - h]); j -= h) {
          exch(arr, j, j - h);
        }
      }
      h = h / 3;
    }
  }

  @Override
  public String toString() {
    return "希尔排序";
  }
}
