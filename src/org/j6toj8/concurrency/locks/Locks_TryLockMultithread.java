package org.j6toj8.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks_TryLockMultithread {

  // tag::code[]
  static class Acao implements Runnable {

    private Lock lock;

    public Acao(Lock reentrantLock) {
      this.lock = reentrantLock;
    }

    @Override
    public void run() {
      if (lock.tryLock()) {
        try {
          System.out.println(Thread.currentThread().getName() + ": Conseguiu o Lock");
        } finally {
          lock.unlock();
        }
      }
    }
  }  
  
  public static void main(String[] args) {
    Lock lock = new ReentrantLock();
    
    // Criação das threads
    Thread thread1 = new Thread(new Acao(lock));
    Thread thread2 = new Thread(new Acao(lock));
    Thread thread3 = new Thread(new Acao(lock));
    
    // Execução das threads
    thread1.start();
    thread2.start();
    thread3.start();    
  }
  // end::code[]
  
}
