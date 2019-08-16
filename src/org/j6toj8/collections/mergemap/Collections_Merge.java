package org.j6toj8.collections.mergemap;

import java.util.HashMap;

public class Collections_Merge {

  public static void main(String[] args) {
    // tag::code[]
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    map.put(1, "String1-");
    map.put(2, "String2-");
    
    System.out.println("Map antes do merge: " + map);
    map.merge(1, "StringA", (v1, v2) -> v1.concat(v2));
    map.merge(2, "StringB", (v1, v2) -> v1.concat(v2));
    map.merge(3, "StringC", (v1, v2) -> v1.concat(v2));
    map.merge(4, "StringD", (v1, v2) -> v1.concat(v2));
    System.out.println("Map depois do merge: " + map);
    // end::code[]
  }
 }
