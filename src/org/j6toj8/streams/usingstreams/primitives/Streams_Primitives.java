package org.j6toj8.streams.usingstreams.primitives;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Streams_Primitives {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(" DoubleStream");
    DoubleStream.of(1.1, 2.2, 3.3).forEach(System.out::print);

    System.out.println("\n IntStream");
    IntStream.of(1, 2, 3).forEach(System.out::print);
    System.out.println();
    IntStream.range(1, 4).forEach(System.out::print);
    
    System.out.println("\n LongStream");
    LongStream.of(1, 2, 3).forEach(System.out::print);
    System.out.println();
    LongStream.range(1, 4).forEach(System.out::print);
    // end::code[]
  }
}
