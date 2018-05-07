package com.pattern.facade;

public class Main {

  public static void main(String[] args) {
    HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(), new Tuner(), new DvdPlayer(), new CdPlayer(), new Projector(), new Screen(), new PopcornPopper());
    homeTheaterFacade.watchMovie("movie");
    homeTheaterFacade.endMovie();
  }
}
