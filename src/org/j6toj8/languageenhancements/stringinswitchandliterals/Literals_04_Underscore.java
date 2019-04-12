package org.j6toj8.languageenhancements.stringinswitchandliterals;

public class Literals_04_Underscore {

    public static void main(String[] args) {

        int i1 = 1_000_000; // int com underscore - é o mesmo que escrever 1000000
        int i2 = 10_00_00_0; // o underscore pode estar em qualquer posição entre 2 números
        int i3 = _1000; // NÃO COMPILA - o underscore não pode estar no início
        int i4 = 1000_; // NÃO COMPILA - o underscore não pode estar no final
        
        long l3 = 12_345_6_7890_123456_789L; // long com underscore
        
        double d2 = 100_000.01; // double com underscore
        double d2 = 10_.01; // NÃO COMPILA - o underscore deve estar entre números
        double d2 = 10._01; // NÃO COMPILA - o underscore deve estar entre números
        
    }
    
}
