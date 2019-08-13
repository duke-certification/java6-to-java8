package org.j6toj8.concurrency.executetasks;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule_SingleThread {

  public static void main(String[] args) {
    // tag::code[]
    ScheduledExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadScheduledExecutor(); // executor de agendamento com uma única thread
      System.out.println("Agora: " + LocalTime.now()); // imprime a hora atual
      
      executor.schedule(() -> System.out.println("Execução: " + LocalTime.now()), 3, TimeUnit.SECONDS);
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    // end::code[]
  }
  
}
