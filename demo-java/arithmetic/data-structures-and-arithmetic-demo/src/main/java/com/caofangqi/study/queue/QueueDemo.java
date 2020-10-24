package com.caofangqi.study.queue;
/*
 * 队列
 * */
public class QueueDemo {

  public static void main(String[] args) {
    MyQueue<String> queue = new MyQueue<>();

    for (int i = 0; i < 10; i++) {
      queue.enqueue("第" + (i + 1) + "个元素");
      System.out.println("入队第" + (i + 1) + " 个元素 " + "队列内元素:" + queue.getSize() + " 个");
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(queue.dequeue() + " 出队");
      System.out.println("队列内元素:" + queue.getSize() + " 个");
    }
  }
}
