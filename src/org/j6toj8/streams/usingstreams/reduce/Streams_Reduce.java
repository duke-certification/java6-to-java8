package org.j6toj8.streams.usingstreams.reduce;

import java.util.Optional;
import java.util.stream.Stream;

public class Streams_Reduce {

  public static void main(String[] args) {
    // tag::code[]
    Optional<Integer> reduce = Stream.of(7, 2, 3, 8)
      .reduce((e1, e2) ->  e1 * e2); // reduce que multiplica todos os números
    
    System.out.println(reduce.get());
    // end::code[]
  }
}
