package org.j6toj8.streams.usingstreams;

import java.util.stream.IntStream;

public class Streams_LazyMap {

  public static void main(String[] args) {
    // tag::code[]
    IntStream.range(0, 10)
      .peek(e -> System.out.println("Peek: " + e))
      .limit(3)
      .forEach(e -> System.out.println("ForEach: " + e)); 
    // end::code[]
  }
}
