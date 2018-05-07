package com.pattern.factory;

public class ElevatorController {
  private int id;
  private int curFloor;

  public ElevatorController(int id){
    this.id = id;
    this.curFloor = 1;
  }

  public void gotoFloor(int destination){
    System.out.println("Elevator [" + this.id + "] Floor :" + this.curFloor);
    this.curFloor = destination;
    System.out.println("==>" + this.curFloor);
  }
}
