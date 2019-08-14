package org.j6toj8.fileio.files;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Random;

public class Files_Owner {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    System.out.println("User home: " + userHome);

    // Utilizando um nome aleatório de arquivo,
    // apenas para o exemplo executar inúmeras vezes sem problemas
    String nomeAleatorio = "arquivo" + new Random().nextInt() + ".txt";
    
    Path path = Paths.get(userHome, nomeAleatorio);
    System.out.println("Path: " + path);

    try {
      Files.createFile(path);
      System.out.println(Files.getOwner(path)); // imprime o owner atual
      
      // Pega o serviço do sistema para buscar um usuário
      UserPrincipalLookupService service = FileSystems.getDefault().getUserPrincipalLookupService();
      // Busca pelo usuário com nome 'rinaldo'
      UserPrincipal userPrincipal = service.lookupPrincipalByName("rinaldo");
      
      Files.setOwner(path, userPrincipal); // altera o owner
      System.out.println(Files.getOwner(path));
    } catch (IOException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
