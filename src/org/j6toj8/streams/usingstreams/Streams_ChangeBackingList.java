package org.j6toj8.streams.usingstreams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streams_ChangeBackingList {

  public static void main(String[] args) {
    // tag::code[]
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);

    Stream<Integer> stream = list.stream();
    
    list.add(4);
    
    stream.forEach(System.out::println);
    // end::code[]
  }
}
