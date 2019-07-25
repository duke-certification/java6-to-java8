package org.j6toj8.streams.usingstreams;

import java.util.Arrays;
import java.util.List;

public class Streams_ListStream {

  public static void main(String[] args) {
    // tag::code[]
    List<String> list = Arrays.asList("A", "B", "C");
    list.stream().forEach(System.out::println); 
    // end::code[]
  }
}
