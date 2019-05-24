package org.j6toj8.localization.datetime.localdatetime;

import java.time.LocalDate;

public class LocalDateTime_04_Constructor {

  public static void main(String[] args) {
    // tag::code[]
    LocalDateTime localDateTime = new LocalDateTime(); // NÃO COMPILA! - o construtor é privado, não é possível invocá-lo
    System.out.println(localDateTime);
    // end::code[]
  }
}
