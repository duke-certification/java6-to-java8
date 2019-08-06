package org.j6toj8.streams.parallelstreams;

import java.util.stream.IntStream;

public class Streams_ParallelPerformance {

  public static void main(String[] args) {
    // tag::code[]
    long inicio = System.currentTimeMillis();
    IntStream.range(0, Integer.MAX_VALUE) // stream sequencial
      .mapToDouble(n -> Math.pow(n, 2))
      .average()
      .ifPresent(n -> System.out.println("Tempo stream sequencial: " + (System.currentTimeMillis() - inicio)));
    
    long inicio2 = System.currentTimeMillis();
    IntStream.range(0, Integer.MAX_VALUE)
      .parallel() // stream paralelo
      .mapToDouble(n -> Math.pow(n, 2))
      .average()
      .ifPresent(n -> System.out.println("Tempo stream paralelo: " + (System.currentTimeMillis() - inicio2)));
    // end::code[]
  }
}
