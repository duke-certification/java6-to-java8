package org.j6toj8.streams.usingstreams.collect;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorToMap {

  public static void main(String[] args) {
    // tag::code[]
    // Armazena o resultado do Stream em um Mapa
    // A Chave é o próprio nome (s -> s)
    // O Valor é o tamanho do nome
    Map<String, Integer> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
      .collect(Collectors.toMap(s -> s, s -> s.length()));
    
    System.out.println(collect);
    // end::code[]
  }
}
