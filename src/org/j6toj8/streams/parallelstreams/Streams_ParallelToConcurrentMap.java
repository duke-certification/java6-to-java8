package org.j6toj8.streams.parallelstreams;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_ParallelToConcurrentMap {

  public static void main(String[] args) {
    // tag::code[]
    Map<String, Integer> collect1 = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
        .parallel()
        .collect(Collectors.toMap(s -> s, s -> s.length()));
    System.out.println("toMap: " + collect1);
    
    Map<String, Integer> collect2 = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
        .parallel()
        .collect(Collectors.toConcurrentMap(s -> s, s -> s.length()));
    System.out.println("toConcurrentMap: " + collect2);
    // end::code[]
  }
}
