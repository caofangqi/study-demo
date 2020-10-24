package com.caofangqi.study;

/**
 * 策略模式
 * 定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
 */
public class App {


    public static void main(String[] args) {
        People people = new People(new Bicycle());
        people.goingOut();
        people.changeVehicle(new MotorBike());
        people.goingOut();

        //java 1.8 以后 lambda 表达式
        people=new People(()->{
            System.out.println("开着老爷车就出门了........");
        });
        people.goingOut();
        people.changeVehicle(()->{
            System.out.println("开着拖拉机出门了...............");
        });
        people.goingOut();
    }

}
