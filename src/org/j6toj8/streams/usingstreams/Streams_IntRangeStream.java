package org.j6toj8.streams.usingstreams;

import java.util.stream.IntStream;

public class Streams_IntRangeStream {

  public static void main(String[] args) {
    // tag::code[]
    IntStream.range(0, 4).forEach(System.out::println); 
    // end::code[]
  }
}
