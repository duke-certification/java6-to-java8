package org.j6toj8.languageenhancements.trywithresources;

public class TryWithResouces_CommonTry {
  
  // tag::code[]
  public static void main(String[] args) {
    try {
      System.out.println("try");
    } // NÃO COMPILA - try "comum" sem catch ou finally
    
    try {
      System.out.println("try");
    } catch (Exception e) {
    } // COMPILA - try "comum" só com catch
    
    try {
      System.out.println("try");
    } finally {
    } // COMPILA - try "comum" só com finally
    
    try {
      System.out.println("try");
    } catch (Exception e) {
    } finally {
    } // COMPILA - try "comum" com catch e finally
  }
  // end::code[]
}
