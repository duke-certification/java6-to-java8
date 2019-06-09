package org.j6toj8.localization.datetime.duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Duration_Of {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(Duration.ofNanos(2)); // 2 nanossegundos
    System.out.println(Duration.ofMillis(2)); // 2 milissegundos
    System.out.println(Duration.ofSeconds(2)); // 2 segundos
    System.out.println(Duration.ofMinutes(2)); // 2 minutos
    System.out.println(Duration.ofHours(2)); // 2 horas
    System.out.println(Duration.ofDays(2)); // 2 dias (48 horas)
    System.out.println(Duration.ofSeconds(2, 200)); // 2,0000002 segundos (2 segundos e 200 nanossegundos)
    System.out.println(Duration.of(2, ChronoUnit.MICROS)); // 2 microssegundos
    // end::code[]
  }
}
