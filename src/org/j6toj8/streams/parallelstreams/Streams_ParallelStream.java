package org.j6toj8.streams.parallelstreams;

import java.util.Arrays;
import java.util.List;

public class Streams_ParallelStream {

  public static void main(String[] args) {
    // tag::code[]
    List<String> list = Arrays.asList("A", "B", "C");
    list.parallelStream() // cria um Stream paralelo diretamente
      .forEach(System.out::println); 
    // end::code[]
  }
}
