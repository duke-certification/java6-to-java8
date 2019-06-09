package org.j6toj8.localization.datetime.period;

import java.time.Period;

public class Period_Of {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(Period.ofDays(2)); // período de 2 dias
    System.out.println(Period.ofMonths(2)); // período de 2 meses
    System.out.println(Period.ofWeeks(2)); // período de 2 semanas
    System.out.println(Period.ofYears(2)); // período de 2 anos
    System.out.println(Period.of(2, 1, 3)); // 2 anos, 1 mês e 3 dias
    // end::code[]
  }
}
