package org.j6toj8.localization.datetime.localtime;

import java.time.LocalDate;

public class LocalTime_04_Constructor {

  public static void main(String[] args) {
    // tag::code[]
    LocalTime localTime = new LocalTime(); // NÃO COMPILA! - o construtor é privado, não é possível invocá-lo
    System.out.println(localTime);
    // end::code[]
  }
}
