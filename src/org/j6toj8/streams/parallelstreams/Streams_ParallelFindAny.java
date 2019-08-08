package org.j6toj8.streams.parallelstreams;

import java.util.Optional;
import java.util.stream.Stream;

public class Streams_ParallelFindAny {

  public static void main(String[] args) {
    // tag::code[]
    Optional<Integer> findAny1 = Stream.of(7, 2, 1, 8, 4, 9, 2, 8)
        .findFirst();
    System.out.println("findAny Sequencial: " + findAny1.get());

    Optional<Integer> findAny2 = Stream.of(7, 2, 1, 8, 4, 9, 2, 8)
        .parallel()
        .findAny();
    System.out.println("findAny Paralelo: " + findAny2.get());
    // end::code[]
  }
}
