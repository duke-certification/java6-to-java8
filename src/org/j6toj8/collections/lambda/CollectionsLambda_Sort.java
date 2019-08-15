package org.j6toj8.collections.lambda;

import java.util.Arrays;
import java.util.List;

public class CollectionsLambda_Sort {

  public static void main(String[] args) {
    // tag::code[]
    List<Integer> list = Arrays.asList(1, 6, 7, 2, 9);
    list.stream()
      .sorted()
      .forEach(System.out::println);
    // end::code[]
  }
}
