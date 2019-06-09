package org.j6toj8.localization.datetime.duration;

import java.time.Duration;
import java.time.LocalDate;

public class Duration_LocalDate {

  public static void main(String[] args) {
    // tag::code[]
    Duration duration = Duration.ofHours(2);
    System.out.println("Duration: " + duration);
    
    LocalDate localDate = LocalDate.of(1990, 8, 6);
    System.out.println("LocalTime: " + localDate);
    System.out.println("LocalTime + Period: " + localDate.plus(duration));
    // end::code[]
  }
}
