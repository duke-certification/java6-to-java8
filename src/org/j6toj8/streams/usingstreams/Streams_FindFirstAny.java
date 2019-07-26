package org.j6toj8.streams.usingstreams;

import java.util.Optional;
import java.util.stream.Stream;

public class Streams_FindFirstAny {

  public static void main(String[] args) {
    // tag::code[]
    Optional<Integer> findFirst = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream de vários Integer
        .findFirst(); // pega o primeiro número do Stream
    System.out.println("First: " + findFirst.get());

    Optional<Integer> findAny = Stream.of(7, 2, 1, 8, 4, 9, 2, 8) // stream de vários Integer
        .findAny(); // pega qualquer número do Stream
    System.out.println("Any: " + findAny.get());
    // end::code[]
  }
}
