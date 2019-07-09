package org.j6toj8.lambda.builtininterfaces;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BuiltInInterfaces_ConsumerExample {

  // tag::code[]
  public static void main(String[] args) {
    Consumer<Object> impressor = x -> System.out.println(x);
    impressor.accept(LocalDate.now()); // imprimirá a data atual
    
    BiConsumer<Object, Object> impressor2 = (x, y) -> { System.out.println(x); System.out.println(y); };
    impressor2.accept(LocalDate.now(), LocalTime.now()); // imprimirá a data atual e depois a hora atual
  }
  // end::code[]
  
}
