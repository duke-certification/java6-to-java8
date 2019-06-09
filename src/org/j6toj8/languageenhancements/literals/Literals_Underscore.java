package org.j6toj8.languageenhancements.literals;

public class Literals_Underscore {

  public static void main(String[] args) {

    // tag::code[]
    int i1 = 1_000_000; // int com underscore - é o mesmo que escrever 1000000
    int i2 = 10_00_00_0; // o underscore pode estar em qualquer posição entre 2 números
    int i3 = _1000; // NÃO COMPILA - o underscore não pode estar no início
    int i4 = 1000_; // NÃO COMPILA - o underscore não pode estar no final
    int i5 = 1___000; // COMPILA - vários underscore é permitido, desde que estejam entre 2 números
    int i6 = 0x_100; // NÃO COMPILA - entre marcador de base não é permitido
    int i7 = 0xF_F; // COMPILA - apesar de serem letras, representam valores numéricos dessa base
    
    long l1 = 12_345_6_7890_123456_789L; // long com underscore
    long l2 = 12_345_6_789_L; // NÃO COMPILA - não pode ficar ao lado de um marcador de tipo
    
    double d1 = 100_000.01; // double com underscore
    double d2 = 10_.01; // NÃO COMPILA - o underscore deve estar entre números
    double d3 = 10._01; // NÃO COMPILA - o underscore deve estar entre números
    // end::code[]
  }
}
