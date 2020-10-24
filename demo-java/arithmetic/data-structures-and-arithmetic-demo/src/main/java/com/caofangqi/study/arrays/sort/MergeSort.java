package com.caofangqi.study.arrays.sort;

import java.util.Arrays;

/** 归并排序 */
public class MergeSort implements Sort {

  @Override
  public void sort(Comparable[] arr) {}

  public Comparable[] sortWithReturn(Comparable[] arr) {
    return mergeSoft(arr);
  }

  public Comparable[] mergeSoft(Comparable[] arr) {
    if (arr.length < 2) return arr;
    int mid = arr.length / 2;
    Comparable[] left = Arrays.copyOfRange(arr, 0, mid);
    Comparable[] right = Arrays.copyOfRange(arr, mid, arr.length);
    return merge(mergeSoft(left), mergeSoft(right));
  }

  public Comparable[] merge(Comparable[] left, Comparable[] right) {
    Comparable[] result = new Comparable[left.length + right.length];
    for (int i = 0, L = 0, r = 0; i < result.length; i++) {
      if (L >= left.length) {
        result[i] = right[r++];
      } else if (r >= right.length) {
        result[i] = left[L++];
      } else if (less(left[L], right[r])) {
        result[i] = left[L++];
      } else {
        result[i] = right[r++];
      }
    }
    return result;
  }

  @Override
  public String toString() {
    return "归并排序";
  }
}
