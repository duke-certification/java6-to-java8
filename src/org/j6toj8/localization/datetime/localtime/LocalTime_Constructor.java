package org.j6toj8.localization.datetime.localtime;

import java.time.LocalDate;

public class LocalTime_Constructor {

  public static void main(String[] args) {
    // tag::code[]
    LocalTime localTime = new LocalTime(); // NÃO COMPILA! - não possui construtor padrão
    System.out.println(localTime);
    // end::code[]
  }
}
