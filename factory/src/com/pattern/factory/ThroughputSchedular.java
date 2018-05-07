package com.pattern.factory;

import apple.laf.JRSUIConstants.Direction;
import java.util.Objects;

public class ThroughputSchedular implements ElevatorScheduler{
  public static ThroughputSchedular instance;
  public static ThroughputSchedular getInstance(){
    if(Objects.isNull(instance)){
      instance = new ThroughputSchedular();
    }
    return instance;
  }
  private ThroughputSchedular(){}
  public int selectElevator(ElevatorMnager manager, int destination, Direction direction){
     return 0;
  }
}
