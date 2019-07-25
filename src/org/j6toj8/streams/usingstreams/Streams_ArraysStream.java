package org.j6toj8.streams.usingstreams;

import java.util.Arrays;

public class Streams_ArraysStream {

  public static void main(String[] args) {
    // tag::code[]
    // Criação de um array comum de Strings
    String[] array = new String[] { "A", "B", "C" };
    // Criação de um Stream a partir do array e, para
    // cada elemento, o método println é chamado.
    Arrays.stream(array).forEach(System.out::println); 
    // end::code[]
  }
}
