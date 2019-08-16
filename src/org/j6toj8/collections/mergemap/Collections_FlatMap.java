package org.j6toj8.collections.mergemap;

import java.util.Arrays;
import java.util.List;

public class Collections_FlatMap {

  public static void main(String[] args) {
    // tag::code[]
    List<String> list = Arrays.asList("Manoel");
    
    System.out.println("\n Com map: ");
    // com map - as letras da String viram 
    // um Stream dentro de outro Stream
    list.stream()
      .map(s -> Arrays.stream(s.split("")))
      .forEach(System.out::println);
    
    System.out.println("\n Com flatMap: ");
    // com flatMap - as letras da String viram dados
    // do próprio Stream
    list.stream()
      .flatMap(s -> Arrays.stream(s.split("")))
      .forEach(System.out::println);
    // end::code[]
  }
}
