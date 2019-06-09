package org.j6toj8.localization.datetime.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate_AdjustDifferentUnit {

  public static void main(String[] args) {
    // tag::code[]
    LocalDate localDate = LocalDate.of(2019, Month.NOVEMBER, 30);
    System.out.println(localDate);
    System.out.println(localDate.plusDays(1)); // + 1 dia, vira o mês
    System.out.println(localDate.plusDays(32)); // + 32 dias, vira o ano
    System.out.println(localDate.plusMonths(2)); // + 2 meses, vira o ano
    // end::code[]
  }
}
