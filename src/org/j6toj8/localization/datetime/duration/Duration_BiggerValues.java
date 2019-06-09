package org.j6toj8.localization.datetime.duration;

import java.time.Duration;

public class Duration_BiggerValues {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(Duration.ofMinutes(120)); // 120 minutos
    System.out.println(Duration.ofMinutes(121)); // 2 horas e 1 minuto
    System.out.println(Duration.ofMinutes(119)); // 1 hora e 59 minutos
    System.out.println(Duration.ofSeconds(10000)); // 2 horas, 46 minutos e 40 segundos
    // end::code[]
  }
}
