package org.j6toj8.streams.usingstreams.primitives;

import java.util.Arrays;
import java.util.List;

public class Streams_MapTo {

  public static void main(String[] args) {
    // tag::code[]
    List<Integer> list = Arrays.asList(1, 2, 3, 4);
    
    System.out.println(" Stream para IntStream");
    list.stream() // cria Stream<Integer>
      .mapToInt(Integer::intValue) // transforma em IntStream
      .forEach(System.out::print);
    
    System.out.println("\n Stream para LongStream");
    list.stream() // cria Stream<Long>
      .mapToLong(Integer::longValue) // transforma em LongStream
      .forEach(System.out::print);
    
    System.out.println("\n Stream para DoubleStream");
    list.stream() // cria Stream<Double>
      .mapToDouble(Integer::doubleValue) // transforma em DoubleStream
      .forEach(System.out::print);
    // end::code[]
  }
}
