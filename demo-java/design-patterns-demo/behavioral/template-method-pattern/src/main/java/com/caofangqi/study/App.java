package com.caofangqi.study;

/**
 * 模板方法模式 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 */
public class App {


  public static void main(String[] args) {
  Thief thief=new Thief(new RobMethod());
   thief.steal();
   thief.changeMethod(new SubtleMethod());
   thief.steal();
  }

}
