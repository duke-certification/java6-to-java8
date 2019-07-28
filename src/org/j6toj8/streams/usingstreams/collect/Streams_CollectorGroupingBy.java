package org.j6toj8.streams.usingstreams.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorGroupingBy {

  public static void main(String[] args) {
    // tag::code[]
    // Armazena o resultado do Stream em um Mapa
    // A Chave é o tamanho do nome
    // O Valor é uma lista com os nomes que tem aquele tamanho
    Map<Object, List<String>> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
      .collect(Collectors.groupingBy(s -> s.length()));
    
    System.out.println(collect);
    // end::code[]
  }
}
