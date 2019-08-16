package org.j6toj8.collections.calculations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collections_GroupingBy {

  public static void main(String[] args) {
    // tag::code[]
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
    
    Map<Integer, List<Integer>> mapaDivisaoPor3 = list.stream()
      .collect(Collectors.groupingBy(n -> n % 3));
    
    System.out.println("Mapa de resto da divisão por 3: " + mapaDivisaoPor3);
    // end::code[]
  }
 }
