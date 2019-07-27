package org.j6toj8.streams.usingstreams.primitives;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Streams_Generate {

  public static void main(String[] args) {
    // tag::code[]
    // Cria Stream infinito de números aleatórios
    System.out.println(" IntStream infinito de números aleatórios");
    IntStream.generate(() -> new Random().nextInt())
      .limit(3)
      .forEach(System.out::println);
    
    System.out.println("\n DoubleStream infinito de números aleatórios");
    DoubleStream.generate(Math::random)
      .limit(3)
      .forEach(System.out::println);
    // end::code[]
  }
}
