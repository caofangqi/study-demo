package com.caofangqi.study.arrays.sort;

/** 选择排序 */
public class SelectionSort implements Sort {

  /** 选择排序 将数组按升序排列 */
  @Override
  public void sort(Comparable[] arr) {
    int length = arr.length;
    for (int i = 0; i < length; i++) {

      for (int j = i + 1; j < length; j++) {
        if (less(arr[j], arr[i])) {
          exch(arr, i, j);
        }
      }
    }
  }

  @Override
  public String toString() {
    return "选择排序";
  }
}
