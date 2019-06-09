package org.j6toj8.localization.datetime.period;

import java.time.Period;

public class Period_BiggerValues {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(Period.of(0, 60, 2)); // 60 meses e 2 dias
    System.out.println(Period.of(0, 30, 50)); // 30 meses e 50 dias
    System.out.println(Period.of(5, 200, 1000)); // 5 anos, 200 meses e 1000 dias 
    // end::code[]
  }
}
