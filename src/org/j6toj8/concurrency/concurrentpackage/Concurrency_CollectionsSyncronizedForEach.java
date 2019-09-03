package org.j6toj8.concurrency.concurrentpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Concurrency_CollectionsSyncronizedForEach {

  public static void main(String[] args) {
    // tag::code[]
    Map<Integer, String> map = new HashMap<Integer, String>();
    map.put(1, "A");
    map.put(2, "B");
    map.put(3, "C");
    Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);

    for (Entry<Integer, String> entry : synchronizedMap.entrySet()) {
      synchronizedMap.remove(1);
    }
    // end::code[]
  }
  
}
