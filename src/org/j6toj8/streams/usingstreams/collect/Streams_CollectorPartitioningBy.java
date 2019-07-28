package org.j6toj8.streams.usingstreams.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_CollectorPartitioningBy {

  public static void main(String[] args) {
    // tag::code[]
    // Armazena o resultado do Stream em um Mapa
    // As Chaves são true ou false
    // O Valor é uma lista dos valores que atendem ou não a regra de particionamento
    Map<Boolean, List<String>> collect = Stream.of("Rinaldo", "Rodrigo", "Luiz", "Amélia", "Roseany")
      .collect(Collectors.partitioningBy(s -> s.startsWith("R")));
    
    System.out.println(collect);
    // end::code[]
  }
}
