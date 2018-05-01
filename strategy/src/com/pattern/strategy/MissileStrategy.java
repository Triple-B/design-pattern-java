package com.pattern.strategy;

public class MissileStrategy implements AttackStrategy {

  @Override
  public void attack() {
    System.out.println("attack misile");
  }
}
