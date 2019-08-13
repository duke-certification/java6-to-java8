package org.j6toj8.concurrency.executetasks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tasks_SingleThreadInvokeAny {

  public static void main(String[] args) {
    // tag::code[]
    List<Callable<String>> tarefas = new ArrayList<Callable<String>>();
    tarefas.add(() -> "Tarefa 1 executada na thread " + Thread.currentThread().getName());
    tarefas.add(() -> "Tarefa 2 executada na thread " + Thread.currentThread().getName());
    tarefas.add(() -> "Tarefa 3 executada na thread " + Thread.currentThread().getName());
    
    ExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadExecutor();

      // invokeAny devolve apenas uma das tarefas que finalizou e interrompe as outras
      String retorno = executor.invokeAny(tarefas);
      System.out.println("Retorno da tarefa: " + retorno);
      
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
