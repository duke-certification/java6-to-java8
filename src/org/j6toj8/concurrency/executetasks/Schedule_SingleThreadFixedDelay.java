package org.j6toj8.concurrency.executetasks;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule_SingleThreadFixedDelay {

  // tag::code[]
  public static void main(String[] args) {
    ScheduledExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadScheduledExecutor(); // executor de agendamento com uma única thread
      System.out.println("Antes do agendamento: " + LocalTime.now()); // imprime a hora atual
      executor.scheduleWithFixedDelay(() -> System.out.println("Execução: " + LocalTime.now()), 3, 1, TimeUnit.SECONDS);
      System.out.println("Após do agendamento: " + LocalTime.now()); // imprime a hora atual
      sleep(); // aguarda um tempo para ser possível enxergar as execuções
      System.out.println("Após o sleep de 10 segundos: " + LocalTime.now()); // imprime a hora atual
    } finally {
      if (executor != null) {
        System.out.println("Invocando shutdown no executor.");
        executor.shutdown();
      }
    }
  }

  private static void sleep() {
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  // end::code[]
  
}
