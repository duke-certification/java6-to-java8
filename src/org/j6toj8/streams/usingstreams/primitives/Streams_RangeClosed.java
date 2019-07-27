package org.j6toj8.streams.usingstreams.primitives;

import java.util.stream.IntStream;

public class Streams_RangeClosed {

  public static void main(String[] args) {
    // tag::code[]
    IntStream.range(1, 4).forEach(System.out::print);
    System.out.println();
    IntStream.rangeClosed(1, 4).forEach(System.out::print);
    // end::code[]
  }
}
