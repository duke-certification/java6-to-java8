package org.j6toj8.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_ReentrantLock {

  public static void main(String[] args) {
    // tag::code[]
    Lock lock = new ReentrantLock();
    try {
      lock.lock(); // apenas uma thread obtém o lock por vez
      System.out.println("ABC");
    } finally {
      lock.unlock(); // desfaz o lock
    }
    // end::code[]
  }
  
}
