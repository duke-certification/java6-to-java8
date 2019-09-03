package org.j6toj8.collections.datasearch;

import java.util.Arrays;
import java.util.List;

public class DataSearch_Match {

  public static void main(String[] args) {
    // tag::code[]
    List<Integer> list = Arrays.asList(1, 6, 2, 9, 54, 13, 87, 23, 97, 34, 17, 34);
    
    boolean anyMatch = list.stream().anyMatch(n -> n > 50);
    System.out.println("anyMatch: " + anyMatch);

    boolean allMatch = list.stream().allMatch(n -> n > 50);
    System.out.println("allMatch: " + allMatch);

    boolean noneMatch = list.stream().noneMatch(n -> n > 50);
    System.out.println("noneMatch: " + noneMatch);
    // end::code[]
  }
}
