package org.j6toj8.localization.datetime.localdate;

import java.time.LocalDate;

public class LocalDate_04_Constructor {

  public static void main(String[] args) {
    // tag::code[]
    LocalDate localDate = new LocalDate(); // NÃO COMPILA! - o construtor é privado, não é possível invocá-lo
    System.out.println(localDate);
    // end::code[]
  }
}
