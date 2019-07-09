package org.j6toj8.lambda.builtininterfaces;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class BuiltInInterfaces_SupplierUseCase {

  // tag::code[]
  public static String valideIdade(int idade, Supplier<String> supplier) {
    if (idade < 18) {
      return "Menor de idade!";
    } else {
      return "Maior de idade! Validação realizada às " + supplier.get();
    }
  }
  
  public static void main(String[] args) {
    Supplier<String> supplier = () -> LocalDate.now().atTime(LocalTime.now()).format(DateTimeFormatter.ISO_DATE_TIME);
    System.out.println(valideIdade(17, supplier));
    System.out.println(valideIdade(18, supplier));
  }
  // end::code[]
  
}
