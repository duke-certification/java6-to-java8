package org.j6toj8.concurrency.executetasks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tasks_SingleThreadInvokeAll {

  public static void main(String[] args) {
    // tag::code[]
    List<Callable<String>> tarefas = new ArrayList<Callable<String>>();
    tarefas.add(() -> "Tarefa 1 executada na thread " + Thread.currentThread().getName());
    tarefas.add(() -> "Tarefa 2 executada na thread " + Thread.currentThread().getName());
    tarefas.add(() -> "Tarefa 3 executada na thread " + Thread.currentThread().getName());
    
    ExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadExecutor();

      // invokeAll devolve todos os retornos das tarefas executadas em uma lista
      List<Future<String>> retornos = executor.invokeAll(tarefas);
      
      for (Future<String> retorno : retornos) {
        System.out.println("Retorno da tarefa: " + retorno.get());
      }
    } catch (InterruptedException | ExecutionException e) {
      System.out.println("Execução interrompida.");
    } finally {
      if (executor != null) {
        executor.shutdown();
      }
    }
    // end::code[]
  }

}
