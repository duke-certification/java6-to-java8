package org.j6toj8.localization.datetime.period;

import java.time.LocalDate;
import java.time.Period;

public class Period_Between {

  public static void main(String[] args) {
    // tag::code[]
    LocalDate nascimento = LocalDate.of(1990, 8, 6);
    LocalDate hoje = LocalDate.now();
    Period idade = Period.between(nascimento, hoje);
    System.out.println(idade);
    // end::code[]
  }
}
