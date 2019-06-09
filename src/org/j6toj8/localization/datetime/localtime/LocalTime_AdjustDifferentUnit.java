package org.j6toj8.localization.datetime.localtime;

import java.time.LocalTime;

public class LocalTime_AdjustDifferentUnit {

  public static void main(String[] args) {
    // tag::code[]
    LocalTime localTime = LocalTime.of(9, 59, 59);
    System.out.println(localTime);
    System.out.println(localTime.plusSeconds(2)); // + 2 segundos, vira o minuto
    System.out.println(localTime.plusSeconds(62)); // + 62 segundos, vira a hora
    System.out.println(localTime.plusMinutes(2)); // + 2 minutos, vira a hora
    System.out.println(localTime.minusNanos(1000000000)); // - 1 segundo (em nanos), vira o minuto
    // end::code[]
  }
}
