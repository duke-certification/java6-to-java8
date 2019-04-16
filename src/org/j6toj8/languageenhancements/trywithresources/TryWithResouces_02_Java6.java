package org.j6toj8.languageenhancements.trywithresources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryWithResouces_02_Java6 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("arquivo.txt");
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(file);
            writer.println("Olá Mundo!");
        } finally {
            if (writer != null) {
                writer.close(); // fechando o writer manualmente
            }
        }
        
    }
    
}
