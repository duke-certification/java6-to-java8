package org.j6toj8.streams.parallelstreams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_ParallelGroupingByConcurrent {

  public static void main(String[] args) {
    // tag::code[]
    Map<Object, List<String>> collect1 = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
        .parallel()
        .collect(Collectors.groupingBy(s -> s.length()));
    System.out.println(collect1);
    
    Map<Object, List<String>> collect2 = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
        .parallel()
        .collect(Collectors.groupingByConcurrent(s -> s.length()));
      System.out.println(collect2);
    // end::code[]
  }
}
