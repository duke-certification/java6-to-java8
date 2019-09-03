package org.j6toj8.collections.calculations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collections_AveragingDouble {

  public static void main(String[] args) {
    // tag::code[]
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
    
    Double media = list.stream()
      .collect(Collectors.averagingDouble(n -> n.doubleValue()));
    
    System.out.println("Média: " + media);
    // end::code[]
  }
 }
