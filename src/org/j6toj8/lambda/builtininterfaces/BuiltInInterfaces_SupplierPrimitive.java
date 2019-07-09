package org.j6toj8.lambda.builtininterfaces;

import java.util.Random;
import java.util.function.IntSupplier;

public class BuiltInInterfaces_SupplierPrimitive {

  // tag::code[]
  public static void main(String[] args) {
    IntSupplier randomIntSupplier = () -> new Random().nextInt();
    System.out.println(randomIntSupplier.getAsInt()); // getAsInt retorna um int primitivo
  }
  // end::code[]
  
}
