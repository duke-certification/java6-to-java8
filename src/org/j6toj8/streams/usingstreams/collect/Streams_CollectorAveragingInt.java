package org.j6toj8.streams.usingstreams.collect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorAveragingInt {

  public static void main(String[] args) {
    // tag::code[]
    // Calcula a média do tamanho de cada nome
    Double collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
      .collect(Collectors.averagingInt(s -> s.length()));
    
    System.out.println(collect);
    // end::code[]
  }
}
