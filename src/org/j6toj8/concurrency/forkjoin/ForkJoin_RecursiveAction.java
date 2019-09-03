package org.j6toj8.concurrency.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class ForkJoin_RecursiveAction {

  // tag::code[]
  // Classe que representa a tarefa que será executada
  static class ImpressaoDeStrings extends RecursiveAction {

    private String stringParaImprimir; // String que será impressa

    public ImpressaoDeStrings(String stringParaImprimir) {
      this.stringParaImprimir = stringParaImprimir;
    }

    @Override
    protected void compute() {
      if (stringParaImprimir.length() < 10) {
        // se a String tiver menos de 10 caracteres, será impressa
        System.out.println(Thread.currentThread().getName() + " - " + stringParaImprimir);
      } else {
        // caso contrário, são criadas duas novas tarefas, uma com a primeira metade da String
        // e outra com a segunda metade da String
        List<ImpressaoDeStrings> novasTarefas = divideEmDuasTarefas();
        
        // Invoca a execução das duas tarefas criadas
        ForkJoinTask.invokeAll(novasTarefas);
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
    forkJoinPool.invoke(tarefa);
  }
  // end::code[]
  
}
