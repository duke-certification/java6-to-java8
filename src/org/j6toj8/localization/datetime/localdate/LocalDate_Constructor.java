package org.j6toj8.localization.datetime.localdate;

import java.time.LocalDate;

public class LocalDate_Constructor {

  public static void main(String[] args) {
    // tag::code[]
    LocalDate localDate = new LocalDate(); // NÃO COMPILA! - não possui construtor padrão
    System.out.println(localDate);
    // end::code[]
  }
}
