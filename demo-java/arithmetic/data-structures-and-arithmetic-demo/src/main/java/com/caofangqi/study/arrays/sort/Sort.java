package com.caofangqi.study.arrays.sort;

/*
 * 排序顶层接口
 * */
public interface Sort {

  /*
   * 排序
   * */
  void sort(Comparable[] arr);

  /*
   *
   * 比较出小一点的 Comparable
   * @return true c1<c2  false c1 >= c2
   * */
  default boolean less(Comparable c1, Comparable c2) {
    return c1.compareTo(c2) < 0;
  }
  /*
   *
   * 互换
   * */
  default void exch(Comparable[] arr, int i, int j) {
    Comparable t;
    t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }
  /*
   * 单行打印
   * */
  default void show(Comparable[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "  ");
    }
    System.out.println();
  }
  /*
   * 检测是否升序
   */
  default boolean isSorted(Comparable[] arr) {
    for (int i = 1; i < arr.length; i++) {
      if (less(arr[i], arr[i - 1])) return false;
    }
    return true;
  }
}
