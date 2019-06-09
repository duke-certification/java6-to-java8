package org.j6toj8.languageenhancements.literals;

public class Literals_Prefix {

  public static void main(String[] args) {

    // tag::code[]
    int i1 = 0567; // octadecimal - base 8 - começa com 0
    int i2 = 0xFA1; // hexadecimal - base 16 - começa com 0x
    int i3 = 0b0101; // binário - base 2 - começa com 0b
    
    long l1 = 0xABCL; // long também pode ser hexadecimal - começa com 0x e termina com L
    // end::code[]
  }
}
