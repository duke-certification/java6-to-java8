package org.j6toj8.localization.datetime.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate_Immutability {

  public static void main(String[] args) {
    // tag::code[]
    LocalDate localDate = LocalDate.of(2019, Month.MAY, 20);
    System.out.println(localDate);
    localDate.plusDays(1); // chamada perdida - a nova data não foi armazenada em uma variável
    System.out.println(localDate);
    localDate = localDate.plusDays(1); // chamada útil - data armazenada na variável
    System.out.println(localDate);
    // end::code[]
  }
}
