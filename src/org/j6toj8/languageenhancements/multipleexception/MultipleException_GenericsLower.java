package org.j6toj8.languageenhancements.multipleexception;

public class MultipleException_GenericsLower {

  // tag::code[]
  public static void main(String[] args) {
    
    try {
        throw new NullPointerException();
    } catch (Exception e) {
        System.out.println("Exceção capturada: " + e);
    } catch (NullPointerException | IllegalArgumentException e) { // NÃO COMPILA - NullPointerException é mais específico que Exception, logo deveria ser capturada antes de Exception 
        System.out.println("Exceção capturada: " + e);
    } 
  }
  // end::code[]
  
}
