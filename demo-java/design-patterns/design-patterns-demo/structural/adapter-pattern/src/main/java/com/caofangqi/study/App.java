package com.caofangqi.study;

/**
 * 适配器模式 应用主类
 */
public class App {


  public static void main(String[] args) {
   DoubleOrificePlug doubleOrificePlug =new DoubleOrificePlug(new TripiexReceptacleAdapter(new TripiexReceptacle()));

   doubleOrificePlug.powerOn();

  }

}
