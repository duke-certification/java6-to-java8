package org.j6toj8.concurrency.executetasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tasks_RunnableCallable {

  public static void main(String[] args) {
    // tag::code[]
    ExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadExecutor();

      // tarefa sem retorno, instância de Runnable
      executor.submit(() -> System.out.println("Runnable"));

      // tarefa com retorno, instância de Callable
      executor.submit(() -> "Callable");
      
      // tarefa que lança uma Exception deve ser Callable, logo deve ter retorno
      executor.submit(() -> {Thread.sleep(1); return "Callable";});

      // tarefa que lança uma Exception, mas não declara retorno
      // NÃO COMPILA pois é interpretada como Runnable
      executor.submit(() -> Thread.sleep(1));
      
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    // end::code[]
  }

}
