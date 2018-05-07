package com.pattern.factory;

import apple.laf.JRSUIConstants.Direction;

public interface ElevatorScheduler {
  int selectElevator(ElevatorMnager manager, int destination, Direction direction);
}
