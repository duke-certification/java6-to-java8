package org.j6toj8.streams.usingstreams;

import java.util.stream.IntStream;

public class Streams_Pipeline {

  public static void main(String[] args) {
    // tag::code[]
    IntStream.range(0, 10) // Stream de 0 a 9
        .filter(e -> e % 2 == 0) // mantém apenas números pares
        .skip(2) // ignora os dois primeiros
        .limit(2) // limita a 3 elementos
        .map(e -> e * 2) // multipla cada elemento por 2
        .forEach(System.out::println); // imprime cada elemento
    // end::code[]
  }
}
