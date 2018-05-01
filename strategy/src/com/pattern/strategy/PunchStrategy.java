package com.pattern.strategy;

public class PunchStrategy implements AttackStrategy {

  @Override
  public void attack() {
    System.out.println("attack punch");
  }
}
