package org.j6toj8.collections.calculations;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Collections_MaxMinCount {

  public static void main(String[] args) {
    // tag::code[]
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
    
    OptionalInt max = list.stream()
      .mapToInt(Integer::intValue) // transforma para int
      .max();
    System.out.println("Max: " + max.getAsInt());

    OptionalInt min = list.stream()
        .mapToInt(Integer::intValue) // transforma para int
        .min();
      System.out.println("Min: " + min.getAsInt());

    long count = list.stream()
        .mapToInt(Integer::intValue) // transforma para int
        .count();
      System.out.println("Count: " + count);
    // end::code[]
  }
 }
