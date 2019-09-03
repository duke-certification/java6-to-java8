package org.j6toj8.collections.diamond;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections_Diamond {

  public static void main(String[] args) {
    // tag::code[]
    List<String> l1 = new ArrayList<String>(); // sem diamond
    List<String> l2 = new ArrayList<>(); // com diamond
    List<> l3 = new ArrayList<String>(); // NÃO COMPILA - diamond só pode ser utilizado do lado direito 
    
    Map<String, String> m1 = new HashMap<String, String>(); // sem diamond
    Map<String, String> m2 = new HashMap<>(); // com diamond
    Map<> m3 = new HashMap<String, String>(); // NÃO COMPILA - diamond só do lado direito

    Map<List<String>, List<String>> m4 = new HashMap<List<String>, List<String>>(); // sem diamond
    Map<List<String>, List<String>> m5 = new HashMap<>(); // com diamond
    Map<List<String>, List<String>> m6 = new HashMap<<>,<>>(); // NÃO COMPILA - a única sintaxe válida é <>
    Map<List<String>, List<String>> m7 = new HashMap<List<String>, <>>(); // NÃO COMPILA - a única sintaxe válida é <>
    
    Map<Map<List<String>, List<String>>, Map<List<String>, List<String>>> m8 = new HashMap<>(); // com diamond
    
    Map<> m9 = new HashMap<>(); // NÃO COMPILA - é necessário informar o tipo do lado esquerdo
    // end::code[]
  }
  
}
