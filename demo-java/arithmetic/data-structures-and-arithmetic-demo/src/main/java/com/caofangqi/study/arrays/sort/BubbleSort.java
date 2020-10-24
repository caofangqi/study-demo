package com.caofangqi.study.arrays.sort;

/** 冒泡排序 */
public class BubbleSort implements Sort {

  /** 冒泡排序 将数组按升序排列 */
  @Override
  public void sort(Comparable[] arr) {
    int length = arr.length;
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length - 1 - i; j++) {
        if (!less(arr[j], arr[j + 1])) {
          exch(arr, j, j + 1);
        }
      }
    }
  }

  @Override
  public String toString() {
    return "冒泡排序";
  }
}
