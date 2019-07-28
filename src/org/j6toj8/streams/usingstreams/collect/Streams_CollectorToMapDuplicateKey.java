package org.j6toj8.streams.usingstreams.collect;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorToMapDuplicateKey {

  public static void main(String[] args) {
    // tag::code[]
    // Armazena o resultado do Stream em um Mapa
    // A Chave é o tamanho do nome
    // O Valor são os nomes com aquele tamanho
    Map<Object, Object> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
      .collect(Collectors.toMap(s -> s.length(), s -> s, (s1, s2) -> s1 + "," + s2));
    
    System.out.println(collect);
    // end::code[]
  }
}
