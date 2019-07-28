package org.j6toj8.streams.usingstreams.reduce;

import java.util.stream.Stream;

public class Streams_ReduceCombiner {

  public static void main(String[] args) {
    // tag::code[]
    Integer reduce = Stream.of(7, 2, 3, 8)
      .reduce(1, (e1, e2) ->  e1 * e2, (e1, e2) ->  e1 * e2);
    
    System.out.println(reduce);
    // end::code[]
  }
}
