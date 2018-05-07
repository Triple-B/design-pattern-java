package com.pattern.composite;

public class Main {

  public static void main(String[] args) {
    Computer computer = new Computer();
    computer.addComponent(new Body(10, 10));
    computer.addComponent(new Keyboard(10, 10));
    computer.addComponent(new Monitor(10, 10));

    System.out.println(computer.getPrice());
    System.out.println(computer.getPower());
  }
}
