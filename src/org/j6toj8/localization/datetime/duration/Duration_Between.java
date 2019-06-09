package org.j6toj8.localization.datetime.duration;

import java.time.Duration;
import java.time.LocalTime;

public class Duration_Between {

  public static void main(String[] args) {
    // tag::code[]
    LocalTime meiaNoite = LocalTime.of(0, 0, 0);
    LocalTime meioDia = LocalTime.of (12, 0, 0);

    System.out.println(Duration.between(meiaNoite, meioDia));
    
    System.out.println(Duration.between(meioDia, meiaNoite));
    
    System.out.println(Duration.between(meioDia, meioDia));
    // end::code[]
  }
}
