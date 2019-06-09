package org.j6toj8.localization.datetime.period;

import java.time.Instant;
import java.time.Period;

public class Period_Instant {

  public static void main(String[] args) {
    // tag::code[]
    Period period = Period.ofMonths(1);
    System.out.println("Period: " + period);
    
    Instant instant = Instant.ofEpochSecond(1558962061L);
    System.out.println("Instant: " + instant);
    System.out.println("Instant + Period: " + instant.plus(period));
    // end::code[]
  }
}
