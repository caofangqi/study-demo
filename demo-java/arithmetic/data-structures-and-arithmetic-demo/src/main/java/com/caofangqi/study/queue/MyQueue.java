package com.caofangqi.study.queue;
/*
 * 队列简单实现
 * */
public class MyQueue<E> {

  public int defaultCapacity = 10;
  // 队首
  private Node head;

  // 队尾
  private Node tail;

  private int capacity = defaultCapacity;
  private int size;

  public MyQueue() {}

  public MyQueue(int capacity) {
    this.capacity = capacity;
  }

  public int getSize() {
    return size;
  }

  /*
   * 入队
   * */
  public void enqueue(E e) {
    if (size >= capacity) {
      throw new RuntimeException("队列溢出");
    }
    Node node = new Node(tail, e);
    if (tail != null) {
      tail.next = node;
    }
    if (head == null) {
      head = node;
    }
    tail = node;
    size++;
  }

  /*
   * 出队
   * */
  public Object dequeue() {
    if (size == 0) {
      throw new RuntimeException("队列为空");
    }
    Node node = head;
    head = head.next;
    size--;
    return node.item;
  }

  class Node {
    private Node pre;
    private Node next;
    private E item;

    public Node() {}

    public Node(Node pre, E item) {
      this.pre = pre;
      this.item = item;
    }

    public Node getPre() {
      return pre;
    }

    public void setPre(Node pre) {
      this.pre = pre;
    }

    public Node getNext() {
      return next;
    }

    public void setNext(Node next) {
      this.next = next;
    }

    public E getItem() {
      return item;
    }

    public void setItem(E item) {
      this.item = item;
    }
  }
}
