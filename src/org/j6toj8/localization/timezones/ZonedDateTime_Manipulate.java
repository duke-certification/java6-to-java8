package org.j6toj8.localization.timezones;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ZonedDateTime_Manipulate {

  public static void main(String[] args) {
    // tag::code[]
    ZonedDateTime zonedDateTime = ZonedDateTime.of(2019, 5, 20, 9, 20, 12, 1000, ZoneId.of("America/Sao_Paulo"));
    System.out.println(zonedDateTime);
    System.out.println("+2 horas: " + zonedDateTime.plusHours(2));
    System.out.println("+2 minutos: " + zonedDateTime.plusMinutes(2));
    System.out.println("+2 segundos: " + zonedDateTime.plusSeconds(2));
    System.out.println("+2 nanosegundos: " + zonedDateTime.plusNanos(2));
    System.out.println("+2 microssegundos: " + zonedDateTime.plus(2, ChronoUnit.MICROS));
    System.out.println("+2 milissegundos: " + zonedDateTime.plus(2, ChronoUnit.MILLIS));
    System.out.println("-2 horas: " + zonedDateTime.minusHours(2));
    System.out.println("-2 minutos: " + zonedDateTime.minusMinutes(2));
    System.out.println("-2 segundos: " + zonedDateTime.minusSeconds(2));
    System.out.println("-2 nanosegundos: " + zonedDateTime.minusNanos(2));
    System.out.println("-2 microssegundos: " + zonedDateTime.minus(2, ChronoUnit.MICROS));
    System.out.println("-2 milissegundos: " + zonedDateTime.minus(2, ChronoUnit.MILLIS));
    System.out.println("+2 dias: " + zonedDateTime.plusDays(2));
    System.out.println("+2 semanas: " + zonedDateTime.plusWeeks(2));
    System.out.println("+2 meses: " + zonedDateTime.plusMonths(2));
    System.out.println("+2 anos: " + zonedDateTime.plusYears(2));
    System.out.println("+2 anos: " + zonedDateTime.plusYears(2));
    System.out.println("+2 décadas: " + zonedDateTime.plus(2, ChronoUnit.DECADES));
    System.out.println("-2 dias: " + zonedDateTime.minusDays(2));
    System.out.println("-2 semanas: " + zonedDateTime.minusWeeks(2));
    System.out.println("-2 meses: " + zonedDateTime.minusMonths(2));
    System.out.println("-2 anos: " + zonedDateTime.minusYears(2));
    System.out.println("-2 décadas: " + zonedDateTime.minus(2, ChronoUnit.DECADES));    
    // end::code[]
  }
}
