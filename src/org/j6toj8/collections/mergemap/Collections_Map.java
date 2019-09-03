package org.j6toj8.collections.mergemap;

import java.util.Arrays;
import java.util.List;

public class Collections_Map {

  public static void main(String[] args) {
    // tag::code[]
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
    
    list.stream()
      .map(e -> e * 2)
      .forEach(System.out::println);
    // end::code[]
  }
}
