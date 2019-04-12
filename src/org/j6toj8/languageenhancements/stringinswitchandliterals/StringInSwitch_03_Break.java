package org.j6toj8.languageenhancements.stringinswitchandliterals;

public class StringInSwitch_03_Break {

    public static void main(String[] args) {
        
        String mes = "jan";
        
        switch (mes) {
        case "jan":
            System.out.println("Janeiro");
        default:
            System.out.println("Não é um mês");
        case "fev":
            System.out.println("Fevereiro");
            break;
        case "mar":
            System.out.println("Março");
            break;
        }
        
    }
    
}
