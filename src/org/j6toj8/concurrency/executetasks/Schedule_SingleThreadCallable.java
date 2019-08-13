package org.j6toj8.concurrency.executetasks;

import java.time.LocalTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Schedule_SingleThreadCallable {

  public static void main(String[] args) {
    // tag::code[]
    ScheduledExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadScheduledExecutor(); // executor de agendamento com uma única thread
      System.out.println("Antes do agendamento: " + LocalTime.now());
      ScheduledFuture<String> retorno = executor.schedule(() -> "Execução: " + LocalTime.now(), 3, TimeUnit.SECONDS);
      System.out.println("Depois do agendamento: " + LocalTime.now());
      
      System.out.println(retorno.get()); // fica parado aqui esperando o retorno
      System.out.println("Depois da execução: " + LocalTime.now());
    } catch (InterruptedException | ExecutionException e) {
      System.out.println("Erro ao fazer .get()");
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    // end::code[]
  }
  
}
