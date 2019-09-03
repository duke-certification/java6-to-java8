package org.j6toj8.concurrency.concurrentpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrency_CollectionsSyncronized {

  public static void main(String[] args) {
    // tag::code[]
    // Concurrent Map, garante o acesso de múltiplas threads
    Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();

    // Map Comum, NÃO garante o acesso de múltiplas threads
    Map<String, String> map = new HashMap<>();
        
    // Syncronized Map, garante o acesso de múltiplas threads
    Map<String, String> synchronizedMap = Collections.synchronizedMap(map);
    // end::code[]
  }
  
}
