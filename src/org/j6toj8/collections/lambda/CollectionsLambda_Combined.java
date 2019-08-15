package org.j6toj8.collections.lambda;

import java.util.Arrays;
import java.util.List;

public class CollectionsLambda_Combined {

  public static void main(String[] args) {
    // tag::code[]
    List<Integer> list = Arrays.asList(1, 6, 7, 2, 9, 54, 13, 87, 23, 97, 34, 17, 34, 89, 35, 26);
    list.stream()
      .sorted()
      .filter(n -> n > 10)
      .filter(n -> n % 2 == 0)
      .forEach(System.out::println);
    // end::code[]
  }
}
