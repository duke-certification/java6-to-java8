package org.j6toj8.collections.improvements;

import java.util.HashMap;

public class Collections_ComputeIfAbsent {

  public static void main(String[] args) {
    // tag::code[]
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    map.put("A", "A".hashCode());
    map.put("B", "B".hashCode());
    
    System.out.println("Map antes do computeIfAbsent: " + map);
    map.computeIfAbsent("A", k -> k.hashCode());
    map.computeIfAbsent("C", k -> k.hashCode());
    System.out.println("Map depois do computeIfAbsent: " + map);
    // end::code[]
  }
 }
