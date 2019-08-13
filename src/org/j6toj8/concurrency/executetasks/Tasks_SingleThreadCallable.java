package org.j6toj8.concurrency.executetasks;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tasks_SingleThreadCallable {

  public static void main(String[] args) {
    // tag::code[]
    ExecutorService executor = null;
    try {
      executor = Executors.newSingleThreadExecutor();
      Future<?> retornoDaTarefa = executor.submit(() -> "String que será retornada");
      
      // O .get() abaixo irá esperar a tarefa finalizar para pegar seu retorno
      System.out.println("Retorno da tarefa: " + retornoDaTarefa.get());
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
