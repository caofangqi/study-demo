package com.caofangqi.study;

/*
* 人
* */
public class People {

 private Vehicle vehicle;

  public People(Vehicle vehicle){
      this.vehicle=vehicle;
  }
  public void changeVehicle(Vehicle vehicle){
      this.vehicle=vehicle;
  }
  public void goingOut(){
      vehicle.goingOut();
  }

}
