package org.j6toj8.streams.parallelstreams;

import java.util.Arrays;

public class Streams_Parallel {

  public static void main(String[] args) {
    // tag::code[]
    String[] array = new String[] { "A", "B", "C" };
    Arrays.stream(array)
      .parallel() // stream transformado em paralelo
      .forEach(System.out::println); 
    // end::code[]
  }
}
