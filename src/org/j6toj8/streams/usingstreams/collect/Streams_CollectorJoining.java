package org.j6toj8.streams.usingstreams.collect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorJoining {

  public static void main(String[] args) {
    // tag::code[]
    String collect = Stream.of("A", "B", "C")
      .collect(Collectors.joining());
    
    System.out.println(collect);
    // end::code[]
  }
}
