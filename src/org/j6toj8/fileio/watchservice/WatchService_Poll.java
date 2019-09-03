package org.j6toj8.fileio.watchservice;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class WatchService_Poll {

  public static void main(String[] args) {
    // tag::code[]
    String userHome = System.getProperty("user.home");
    Path path = Paths.get(userHome, "arquivos");
    System.out.println("Path: " + path);

    try (WatchService service = FileSystems.getDefault().newWatchService();) {
      path.register(service, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE);

      System.out.println("Horário antes do poll sem timeout: " + LocalTime.now());
      WatchKey key1 = service.poll(); // retorna imediatamente, mesmo que não haja evento
      System.out.println("WatchKey do poll: " + key1);
      System.out.println("Horário depois do poll sem timeout: " + LocalTime.now());

      System.out.println("Horário antes do poll com timeout: " + LocalTime.now());
      WatchKey key2 = service.poll(5, TimeUnit.SECONDS); // retorna após 5 segundos, mesmo que não haja evento
      System.out.println("WatchKey do poll com timeout: " + key2);
      System.out.println("Horário depois do poll com timeout: " + LocalTime.now());
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
    // end::code[]
  }

}
