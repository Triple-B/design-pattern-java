package com.pattern.adaptor;

public class Main {

  public static void main(String[] args) {
    MallardDuck duck = new MallardDuck();

    WildTurkey turkey = new WildTurkey();
    Duck turkeyAdaptor = new TurkeyAdapter(turkey);

    System.out.println("The Turkey says....");
    turkey.gobble();
    turkey.fly();

    System.out.println("The Duck says....");
    duck.quack();
    duck.fly();

    System.out.println("The turkeyAdaptor says....");
    turkeyAdaptor.quack();
    turkeyAdaptor.fly();

  }
}
