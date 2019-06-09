package org.j6toj8.localization.datetime.localdatetime;

import java.time.LocalDate;

public class LocalDateTime_Constructor {

  public static void main(String[] args) {
    // tag::code[]
    LocalDateTime localDateTime = new LocalDateTime(); // NÃO COMPILA! - não possui construtor padrão
    System.out.println(localDateTime);
    // end::code[]
  }
}
