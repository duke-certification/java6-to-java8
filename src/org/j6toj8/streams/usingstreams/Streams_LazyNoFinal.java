package org.j6toj8.streams.usingstreams;

import java.util.stream.IntStream;

public class Streams_LazyNoFinal {

  public static void main(String[] args) {
    // tag::code[]
    IntStream.range(0, 4)
      .filter(e -> e % 2 == 0)
      .limit(3)
      .map(e -> e * 2)
      .peek(System.out::println); 
    // end::code[]
  }
}
