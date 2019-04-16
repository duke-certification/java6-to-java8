package org.j6toj8.languageenhancements.trywithresources;

public class TryWithResouces_07_NoAutoCloseable {
    
    static class Prateleira {}
    
    public static void main(String[] args) {
        try (Prateleira prateleira = new Prateleira()) { // NÃO COMPILA - Prateleira não implementa AutoClosable
            System.out.println("Olá");
        }
    }
    
}