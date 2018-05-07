package com.pattern.factory;

import apple.laf.JRSUIConstants.Direction;
import java.util.Objects;

public class ResponseTimeScheduler implements ElevatorScheduler{
  public static ResponseTimeScheduler instance;
  public static ResponseTimeScheduler getInstance(){
    if(Objects.isNull(instance)){
      instance = new ResponseTimeScheduler();
    }
    return instance;
  }
  private ResponseTimeScheduler(){}
  public int selectElevator(ElevatorMnager manager, int destination, Direction direction){
    return 0;
  }
}
