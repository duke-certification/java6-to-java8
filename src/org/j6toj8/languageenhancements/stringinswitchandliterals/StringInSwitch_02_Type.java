package org.j6toj8.languageenhancements.stringinswitchandliterals;

public class StringInSwitch_02_Type {

    public static void main(String[] args) {
        
        Long mes = 1L;
        
        switch (mes) { // NÃO COMPILA - Long não é um tipo suportado
        case 1L:
            System.out.println("Janeiro");
            break;
        case 2L:
            System.out.println("Fevereiro");
            break;
        default:
            break;
         }
        
    }
    
}
