package org.j6toj8.concurrency.executetasks;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TasksMulti_ScheduledThreadPool {

  public static void main(String[] args) {
    // tag::code[]
    ScheduledExecutorService executor = null;
    try {
      executor = Executors.newScheduledThreadPool(2); // executor de agendamento com duas threads
      System.out.println("Agora: " + LocalTime.now()); // imprime a hora atual
      
      executor.schedule(() -> System.out.println("Execução 1: " + Thread.currentThread().getName() + " - " + LocalTime.now()), 3, TimeUnit.SECONDS);
      executor.schedule(() -> System.out.println("Execução 2: " + Thread.currentThread().getName() + " - " + LocalTime.now()), 3, TimeUnit.SECONDS);
      executor.schedule(() -> System.out.println("Execução 3: " + Thread.currentThread().getName() + " - " + LocalTime.now()), 3, TimeUnit.SECONDS);
      executor.schedule(() -> System.out.println("Execução 4: " + Thread.currentThread().getName() + " - " + LocalTime.now()), 3, TimeUnit.SECONDS);
      executor.schedule(() -> System.out.println("Execução 5: " + Thread.currentThread().getName() + " - " + LocalTime.now()), 3, TimeUnit.SECONDS);
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    // end::code[]
  }
  
}
