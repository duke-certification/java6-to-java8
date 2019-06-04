package org.j6toj8.localization.datetime.period;

import java.time.Instant;
import java.time.Period;

public class Period_Curiosities {

  public static void main(String[] args) {

    // tag::code1[]
    System.out.println(Period.of(0, 60, 2)); // P60M2D
    System.out.println(Period.of(0, 60, 2).normalized()); // P5Y2D

    System.out.println(Period.of(0, 30, 50)); // P30M50D
    System.out.println(Period.of(0, 30, 50).normalized()); // P2Y6M50D
    // end::code1[]

    // tag::code2[]
    System.out.println(Period.of(1, -25, 0)); // P1Y-25M
    System.out.println(Period.of(1, -25, 0).normalized()); // P-1Y-1M
    // end::code2[]
  }
}
