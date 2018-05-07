package com.pattern.template;

public class Door {
  public DoorStatus doorStatus;

  public Door(){
    this.doorStatus = DoorStatus.CLOSED;
  }

  public DoorStatus getDoorStatus(){
    return doorStatus;
  }

  public void close(){
    this.doorStatus = DoorStatus.CLOSED;
  }

  public void open(){
    this.doorStatus = DoorStatus.OPENED;
  }
}
