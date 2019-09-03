package org.j6toj8.collections.datasearch;

import java.util.Arrays;
import java.util.List;

public class DataSearch_FindFirstAny {

  public static void main(String[] args) {
    // tag::code[]
    List<Integer> list = Arrays.asList(1, 6, 2, 9, 54, 13, 87, 23, 97, 34, 17, 34);
    
    list.parallelStream()
      .findFirst()
      .ifPresent(n -> System.out.println("First: " + n));

    list.parallelStream()
      .findAny()
      .ifPresent(n -> System.out.println("Any: " + n));
    // end::code[]
  }
}
