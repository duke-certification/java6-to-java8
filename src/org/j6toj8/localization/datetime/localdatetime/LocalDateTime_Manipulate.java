package org.j6toj8.localization.datetime.localdatetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTime_Manipulate {

  public static void main(String[] args) {
    // tag::code[]
    LocalDateTime localDateTime = LocalDateTime.of(2019, 5, 20, 9, 20, 12);
    System.out.println(localDateTime);
    System.out.println("+2 horas: " + localDateTime.plusHours(2));
    System.out.println("+2 minutos: " + localDateTime.plusMinutes(2));
    System.out.println("+2 segundos: " + localDateTime.plusSeconds(2));
    System.out.println("+2 nanosegundos: " + localDateTime.plusNanos(2));
    System.out.println("+2 microssegundos: " + localDateTime.plus(2, ChronoUnit.MICROS));
    System.out.println("+2 milissegundos: " + localDateTime.plus(2, ChronoUnit.MILLIS));
    System.out.println("-2 horas: " + localDateTime.minusHours(2));
    System.out.println("-2 minutos: " + localDateTime.minusMinutes(2));
    System.out.println("-2 segundos: " + localDateTime.minusSeconds(2));
    System.out.println("-2 nanosegundos: " + localDateTime.minusNanos(2));
    System.out.println("-2 microssegundos: " + localDateTime.minus(2, ChronoUnit.MICROS));
    System.out.println("-2 milissegundos: " + localDateTime.minus(2, ChronoUnit.MILLIS));
    System.out.println("+2 dias: " + localDateTime.plusDays(2));
    System.out.println("+2 semanas: " + localDateTime.plusWeeks(2));
    System.out.println("+2 meses: " + localDateTime.plusMonths(2));
    System.out.println("+2 anos: " + localDateTime.plusYears(2));
    System.out.println("+2 anos: " + localDateTime.plusYears(2));
    System.out.println("+2 décadas: " + localDateTime.plus(2, ChronoUnit.DECADES));
    System.out.println("-2 dias: " + localDateTime.minusDays(2));
    System.out.println("-2 semanas: " + localDateTime.minusWeeks(2));
    System.out.println("-2 meses: " + localDateTime.minusMonths(2));
    System.out.println("-2 anos: " + localDateTime.minusYears(2));
    System.out.println("-2 décadas: " + localDateTime.minus(2, ChronoUnit.DECADES));    
    // end::code[]
  }
}
