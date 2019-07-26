package org.j6toj8.streams.usingstreams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams_MaxMinCount {

  public static void main(String[] args) {
    // tag::code[]
    Optional<Integer> max = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream de vários Integer
        .max(Comparator.naturalOrder()); // pega o maior número do Stream
    System.out.println("Max: " + max.get());

    Optional<Integer> min = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream de vários Integer
        .min(Comparator.naturalOrder()); // pega o menor número do Stream
    System.out.println("Min: " + min.get());

    long count = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream de vários Integer
        .count(); // pega a quantidade de elementos do Stream
    System.out.println("Count: " + count);
    // end::code[]
  }
}
