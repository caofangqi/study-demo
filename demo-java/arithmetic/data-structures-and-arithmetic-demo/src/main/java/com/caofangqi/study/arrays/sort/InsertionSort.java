package com.caofangqi.study.arrays.sort;

/** 插入排序 */
public class InsertionSort implements Sort {

  @Override
  public void sort(Comparable[] arr) {
    int length = arr.length;
    for (int i = 1; i < length; i++) {
      for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--) {
        exch(arr, j, j - 1);
      }
    }
  }

  @Override
  public String toString() {
    return "插入排序";
  }
}
