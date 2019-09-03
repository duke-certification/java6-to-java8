package org.j6toj8.collections.improvements;

import java.util.HashMap;

public class Collections_ComputeIfPresent {

  public static void main(String[] args) {
    // tag::code[]
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    map.put("A", "A".hashCode());
    map.put("B", "B".hashCode());
    
    System.out.println("Map antes do computeIfPresent: " + map);
    // k = chave; v = valor
    map.computeIfPresent("A", (k, v) -> k.hashCode() * v);
    map.computeIfPresent("B", (k, v) -> k.hashCode() * v);
    map.computeIfPresent("C", (k, v) -> k.hashCode() * v);
    System.out.println("Map depois do computeIfPresent: " + map);
    // end::code[]
  }
 }
