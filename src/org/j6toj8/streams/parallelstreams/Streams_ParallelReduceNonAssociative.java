package org.j6toj8.streams.parallelstreams;

import java.util.stream.Stream;

public class Streams_ParallelReduceNonAssociative {

  public static void main(String[] args) {
    // tag::code[]
    Stream.of(7, 2, 3, 8, 2, 1, 4, 5)
      .reduce((e1, e2) ->  e1 - e2)
      .ifPresent(System.out::println);
    
    Stream.of(7, 2, 3, 8, 2, 1, 4, 5)
      .parallel()
      .reduce((e1, e2) ->  e1 - e2)
      .ifPresent(System.out::println);
    // end::code[]
  }
}
