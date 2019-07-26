package org.j6toj8.streams.usingstreams;

import java.util.stream.Stream;

public class Streams_ReuseStream {

  public static void main(String[] args) {
    // tag::code[]
    Stream<Integer> stream = Stream.of(7, 2, 1);
    stream.forEach(System.out::println); // imprime elementos do Stream
    stream.forEach(System.out::println); // LANÇA EXCEÇÃO - o Stream já estava fechado
    // end::code[]
  }
}
