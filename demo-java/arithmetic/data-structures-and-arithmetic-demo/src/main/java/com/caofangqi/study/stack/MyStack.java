package com.caofangqi.study.stack;

/*
 * 我的栈
 * */
public class MyStack {

  // 栈 默认大小
  private final int defaultStackCapacity = 10;
  // 栈存储数组
  private Object[] stack;
  // 栈顶
  private int top;
  // 栈大小;
  private int stackCapacity = defaultStackCapacity;

  public MyStack(int stackSize) {
    this.stackCapacity = stackSize;
    stack = new Object[stackSize];
  }

  public MyStack() {
    stack = new Object[stackCapacity];
  }

  // 压栈
  public void push(Object o) {
    if (top + 1 > stackCapacity) {
      throw new RuntimeException("栈上溢。。。");
    }
    this.stack[top++] = o;
  }

  // 弹栈
  public Object pop() {
    if (top == 0) {
      throw new RuntimeException("栈下溢。。。。");
    }
    return stack[top-- - 1];
  }

  public Object peek() {
    if (top == 0) {
      throw new RuntimeException("栈为空");
    }
    return stack[top - 1];
  }

  public int getSize() {
    return top;
  }
}
