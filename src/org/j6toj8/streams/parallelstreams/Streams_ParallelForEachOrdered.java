package org.j6toj8.streams.parallelstreams;

import java.util.Arrays;
import java.util.List;

public class Streams_ParallelForEachOrdered {

  public static void main(String[] args) {
    // tag::code[]
    List<String> list = Arrays.asList("A", "B", "C");

    System.out.println("Sequencial: ");
    list.stream() // cria um Stream sequencial
        .forEachOrdered(System.out::println);

    System.out.println("Paralelo: ");
    list.parallelStream() // cria um Stream paralelo
        .forEachOrdered(System.out::println);
    // end::code[]
  }
}
