package org.j6toj8.localization.datetime.period;

import java.time.LocalTime;
import java.time.Period;

public class Period_LocalTime {

  public static void main(String[] args) {
    // tag::code[]
    Period period = Period.ofDays(13);
    System.out.println("Period: " + period);
    
    LocalTime localTime = LocalTime.of(13, 1, 1);
    System.out.println("LocalTime: " + localTime);
    System.out.println("LocalTime + Period: " + localTime.plus(period));
    // end::code[]
  }
}
