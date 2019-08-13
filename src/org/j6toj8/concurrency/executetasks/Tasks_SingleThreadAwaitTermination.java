package org.j6toj8.concurrency.executetasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import sun.print.resources.serviceui;

public class Tasks_SingleThreadAwaitTermination {

  public static void main(String[] args) {
    // tag::code[]
    ExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadExecutor();
      
      executor.execute(() -> System.out.println("Tarefa 1 - Thread do Executor: " + Thread.currentThread().getName()));
      executor.execute(() -> System.out.println("Tarefa 2 - Thread do Executor: " + Thread.currentThread().getName()));
      executor.execute(() -> System.out.println("Tarefa 3 - Thread do Executor: " + Thread.currentThread().getName()));      
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    
    if (executor != null) {
      try {
        System.out.println("Tarefas finalizadas? " + executor.isTerminated());
        executor.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("Tarefas finalizadas? " + executor.isTerminated());
      } catch (InterruptedException e) {
        System.out.println("Erro de interrupção.");
      }
    }
    // end::code[]
  }
  
}
