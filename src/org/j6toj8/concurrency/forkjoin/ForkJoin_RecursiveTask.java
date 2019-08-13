package org.j6toj8.concurrency.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class ForkJoin_RecursiveTask {

  // tag::code[]
  // Classe que representa a tarefa que será executada
  static class ImpressaoDeStrings extends RecursiveTask<Integer> {

    private String stringParaImprimir; // String que será impressa

    public ImpressaoDeStrings(String stringParaImprimir) {
      this.stringParaImprimir = stringParaImprimir;
    }

    @Override
    protected Integer compute() {
      if (stringParaImprimir.length() < 10) {
        // se a String tiver menos de 10 caracteres, será impressa
        System.out.println(Thread.currentThread().getName() + " - " + stringParaImprimir);
        
        // retornamos a quantidade de caracteres impressos
        return stringParaImprimir.length();
      } else {
        // caso contrário, são criadas duas novas tarefas, uma com a primeira metade da String
        // e outra com a segunda metade da String
        List<ImpressaoDeStrings> novasTarefas = divideEmDuasTarefas();
        ImpressaoDeStrings tarefa1 = novasTarefas.get(0);
        ImpressaoDeStrings tarefa2 = novasTarefas.get(1);
        
        // 'fork' irá enviar a tarefa1 para ser executada em uma nova thread
        ForkJoinTask<Integer> primeiraTarefa = tarefa1.fork();
        
        // 'compute' irá executar a tarefa2 nessa mesma thread
        Integer resultadoDaTarefa2 = tarefa2.compute();

        // 'join' irá pegar o resultado da tafera1 que estava sendo executada em outra thread
        Integer resultadoDaTarefa1 = primeiraTarefa.join();
        
        // retornamos a soma dos resultados, pois é a quantidade de carateres impressos
        return resultadoDaTarefa2 + resultadoDaTarefa1;
      }
    }

    private List<ImpressaoDeStrings> divideEmDuasTarefas() {
      // esse método divide a String em duas partes e cria duas novas tarefas
      // cada uma das tarefas recebe uma parte da String
      
      int tamanhoDaString = stringParaImprimir.length();
      int meioDaString = tamanhoDaString / 2;
      
      String primeiraMetade = stringParaImprimir.substring(0, meioDaString);
      String segundaMetade = stringParaImprimir.substring(meioDaString);
      
      List<ImpressaoDeStrings> acoes = new ArrayList<ImpressaoDeStrings>();
      acoes.add(new ImpressaoDeStrings(primeiraMetade));
      acoes.add(new ImpressaoDeStrings(segundaMetade));
      return acoes;
    }
    
  }
  
  public static void main(String[] args) {
    // string que queremos imprimir
    String stringParaImprimir = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    // tarefa principal que será executada
    ImpressaoDeStrings tarefa = new ImpressaoDeStrings(stringParaImprimir);
    
    // criação do ForkJoinPool e execução da tarefa
    ForkJoinPool forkJoinPool = new ForkJoinPool();
    Integer resultado = forkJoinPool.invoke(tarefa);
    System.out.println("Resultado da execução: " + resultado);
  }
  // end::code[]
  
}
