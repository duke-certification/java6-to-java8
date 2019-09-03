package org.j6toj8.concurrency.executetasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TasksMulti_CachedThreadPool {

  public static void main(String[] args) {
    // tag::code[]
    ExecutorService executor = null;
    try {
      executor = Executors.newCachedThreadPool(); // executor com cache de threads
      executor.execute(() -> System.out.println("Tarefa 1 - Thread do Executor: " + Thread.currentThread().getName()));
      executor.execute(() -> System.out.println("Tarefa 2 - Thread do Executor: " + Thread.currentThread().getName()));
      executor.execute(() -> System.out.println("Tarefa 3 - Thread do Executor: " + Thread.currentThread().getName()));
      executor.execute(() -> System.out.println("Tarefa 4 - Thread do Executor: " + Thread.currentThread().getName()));
      executor.execute(() -> System.out.println("Tarefa 5 - Thread do Executor: " + Thread.currentThread().getName()));
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    // end::code[]
  }
  
}
