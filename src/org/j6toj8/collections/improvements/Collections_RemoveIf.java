package org.j6toj8.collections.improvements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections_RemoveIf {

  public static void main(String[] args) {
    // tag::code[]
    List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    
    System.out.println("Lista antes do removeIf: " + list);
    list.removeIf(n -> n % 2 == 0); // remove números pares
    System.out.println("Lista depois do removeIf: " + list);
    // end::code[]
  }
 }
