package org.j6toj8.streams.usingstreams.primitives;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Streams_Statistics {

  public static void main(String[] args) {
    // tag::code[]
    IntSummaryStatistics summaryStatistics = IntStream.range(0, 10).summaryStatistics();
    System.out.println("Quantidade: " + summaryStatistics.getCount());
    System.out.println("Maior: " + summaryStatistics.getMax());
    System.out.println("Menor: " + summaryStatistics.getMin());
    System.out.println("Soma: " + summaryStatistics.getSum());
    System.out.println("Média: " + summaryStatistics.getAverage());
    // end::code[]
  }
}
