package com.caofangqi.study;

/**
 * 观察者模式  observer
 * 又名 发布订阅模式 publish/subscribe
 *
 */
public class App {


    public static void main(String[] args) {
       Weather weather=new Weather();
       weather.addObserver(new Cat());
       weather.addObserver(new People());


       while (true){
         try {
           Thread.sleep(3000);
         } catch (InterruptedException e) {
           e.printStackTrace();
         }
         weather.timePasses();
       }

    }

}
