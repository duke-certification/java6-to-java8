package org.j6toj8.collections.calculations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collections_Joining {

  public static void main(String[] args) {
    // tag::code[]
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
    
    String juncao = list.stream()
      .map(n -> n.toString())
      .collect(Collectors.joining());
    
    System.out.println("Junção dos valores como String: " + juncao);
    // end::code[]
  }
 }
