package com.pattern.strategy;

public class Main {
  public static void main(String[] args) {
    // write your code here
    Robot taekwonV = new TaekwonV("TaekwonV");
    taekwonV.setMovingStrategy(new WalkingStrategy());
    taekwonV.setAttackStrategy(new MissileStrategy());
    taekwonV.move();
    taekwonV.attack();

    Robot atom = new Atom("atom");
    atom.setMovingStrategy(new FlyingStrategy());
    atom.setAttackStrategy(new PunchStrategy());
    atom.move();
    atom.attack();
  }
}
