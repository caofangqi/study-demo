package com.caofangqi.study.stack;
/*
 * 栈
 * */
public class StackDemo {

  public static void main(String[] args) {
    MyStack myStack = new MyStack();

    for (int i = 0; i < 10; i++) {
      //
      myStack.push("第" + i);
    }
    try {
      myStack.push("栈上溢");
    } catch (Exception e) {
      // 捕获栈上溢
      e.printStackTrace();
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(myStack.pop());
    }
    try {
      myStack.pop();
    } catch (Exception e) {
      // 捕获栈下溢
      e.printStackTrace();
    }
  }
}
