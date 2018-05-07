package com.pattern.factory;

import apple.laf.JRSUIConstants.Direction;
import java.util.ArrayList;
import java.util.List;

public abstract class ElevatorMnager {
  private List<ElevatorController> controllers;

  public ElevatorMnager(int controllerCount){
    this.controllers = new ArrayList<>(controllerCount);
    for(int i=0; i<controllerCount; i++){
      ElevatorController controller = new ElevatorController(1);
      controllers.add(controller);
    }
  }

  protected abstract ElevatorScheduler getScheduler();    // primitive or hook method

  public void requestElevator(int destination, Direction direction){
    ElevatorScheduler scheduler = getScheduler();
    System.out.println(scheduler);
    int selectedElevator = scheduler.selectElevator(this, destination, direction);
    controllers.get(selectedElevator).gotoFloor(destination);
  }
}
