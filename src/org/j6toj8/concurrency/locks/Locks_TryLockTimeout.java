package org.j6toj8.concurrency.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_TryLockTimeout {

  public static void main(String[] args) {
    // tag::code[]
    Lock lock = new ReentrantLock();
    
    boolean temLock = false;
    try {
      // tenta obter o lock por no máximo 1 segundo
      temLock = lock.tryLock(1, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      System.out.println("Não obteve o Lock");
    }
    
    if (temLock) {
      try {
        System.out.println("ABC");
      } finally {
        lock.unlock(); // desfaz o lock
      }
    } else {
      System.out.println("DEF");
    }
    // end::code[]
  }
  
}
