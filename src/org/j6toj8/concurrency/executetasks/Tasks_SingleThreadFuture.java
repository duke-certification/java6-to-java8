package org.j6toj8.concurrency.executetasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tasks_SingleThreadFuture {

  public static void main(String[] args) {
    // tag::code[]
    ExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadExecutor();
      Future<?> tarefa = executor.submit(() -> System.out.println("Tarefa executando"));

      // verifica se a tarefa está finalizada
      System.out.println("Tarefa já finalizada? " + tarefa.isDone());
      
      // tenta cancelar a tarefa
      System.out.println("Tentando cancelar a tarefa. Conseguiu? " + tarefa.cancel(true));
      
      // verifica se a tarefa foi cancelada
      System.out.println("Tarefa foi cancelada? " + tarefa.isCancelled());
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    // end::code[]
  }
  
}
