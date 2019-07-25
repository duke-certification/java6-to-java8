package org.j6toj8.streams.usingstreams;

import java.util.stream.Stream;

public class Streams_Of {

  public static void main(String[] args) {
    // tag::code[]
    Stream.of("A", 'B', 1, 2L, 3.0F, 4.0D).forEach(System.out::println);
    // end::code[]
  }
}
