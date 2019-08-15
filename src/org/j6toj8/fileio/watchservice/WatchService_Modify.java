package org.j6toj8.fileio.watchservice;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

public class WatchService_Modify {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "arquivos");
    System.out.println("Path: " + path);

    // criação do WatchService - ainda sem monitorar nada
    try (WatchService service = FileSystems.getDefault().newWatchService();) {
      
      // registro do WatchService no Path para monitorar o evento de MODIFY
      path.register(service, StandardWatchEventKinds.ENTRY_MODIFY);
      
      while (true) { // loop infinito
        // take() irá retornar sempre que houverem eventos
        // caso contrário a chamada fica parada esperando eventos ocorrerem
        WatchKey key = service.take();
        List<WatchEvent<?>> pollEvents = key.pollEvents(); // recupera os eventos ocorridos
        System.out.println("Eventos capturados. Quantidade: " + pollEvents.size());
        for (WatchEvent<?> event : pollEvents) { // iteração sobre todos os eventos recuperados
          System.out.println("Evento ocorrido. Tipo : " + event.kind() + ". Contexto: " + event.context());
        }
        key.reset(); // reseta o WatchKey para que possa ser utilizado novamente
      }
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
