package com.pattern.facade;

public class HomeTheaterFacade {
  Amplifier amp;
  Tuner tuner;
  DvdPlayer dvd;
  CdPlayer cd;
  Projector projector;
  Screen screen;
  PopcornPopper popper;

  public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, Screen screen, PopcornPopper popper){
    this.amp = amp;
    this.tuner = tuner;
    this.dvd = dvd;
    this.cd = cd;
    this.projector = projector;
    this.screen = screen;
    this.popper = popper;
  }

  public void watchMovie(String movie){
    /**
     *
     */
  }

  public void endMovie(){
    /**
     *
     */
  }

}
