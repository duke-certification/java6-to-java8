package org.j6toj8.localization.datetime.duration;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Duration_Compatibility {

  public static void main(String[] args) {
    // tag::code[]
    Duration period = Duration.ofHours(2);
    System.out.println("Duration: " + period);
    
    Instant instant = Instant.ofEpochSecond(1558962061L);
    System.out.println("\nInstant: " + instant);
    System.out.println("Instant + Duration: " + instant.plus(period));
    
    LocalTime localTime = LocalTime.of(12, 5, 2);
    System.out.println("\nLocalTime: " + localTime);
    System.out.println("LocalTime + Duration: " + localTime.plus(period));
    
    LocalDateTime localDateTime = LocalDateTime.of(2018, 05, 27, 13, 1, 1);
    System.out.println("\nLocalDateTime: " +localDateTime);
    System.out.println("LocalDateTime + Duration: " + localDateTime.plus(period));
    // end::code[]
  }
}
