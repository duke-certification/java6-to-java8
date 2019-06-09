package org.j6toj8.localization.datetime.localtime;

import java.time.LocalTime;

public class LocalTime_Of {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(LocalTime.of(9, 20, 1, 135000000));
    System.out.println(LocalTime.of(9, 20, 1, 135));
    System.out.println(LocalTime.of(9, 20, 1));
    System.out.println(LocalTime.of(9, 20));
    // end::code[]
  }
}
