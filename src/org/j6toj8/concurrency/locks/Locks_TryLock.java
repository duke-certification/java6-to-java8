package org.j6toj8.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_TryLock {

  public static void main(String[] args) {
    // tag::code[]
    Lock lock = new ReentrantLock();
    boolean temLock = lock.tryLock();
    
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
