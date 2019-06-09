package org.j6toj8.localization.datetime.period;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Period_Compatibility {

  public static void main(String[] args) {
    // tag::code[]
    Period period = Period.ofDays(10);
    System.out.println("Period: " + period);
    
    Instant instant = Instant.ofEpochSecond(1558962061L);
    System.out.println("\nInstant: " + instant);
    System.out.println("Instant + Period: " + instant.plus(period));
    
    LocalDate localDate = LocalDate.of(2018, 5, 27);
    System.out.println("\nLocalDate: " + localDate);
    System.out.println("LocalDate + Period: " + localDate.plus(period));
    
    LocalDateTime localDateTime = LocalDateTime.of(2018, 05, 27, 13, 1, 1);
    System.out.println("\nLocalDateTime: " +localDateTime);
    System.out.println("LocalDateTime + Period: " + localDateTime.plus(period));
    // end::code[]
  }
}
