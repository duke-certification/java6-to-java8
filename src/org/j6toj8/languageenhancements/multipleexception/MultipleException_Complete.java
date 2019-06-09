package org.j6toj8.languageenhancements.multipleexception;

public class MultipleException_Complete {

  // tag::code[]
  public static void main(String[] args) {
    
    try {
        throw new NullPointerException();
    } catch (NullPointerException | IllegalArgumentException | IllegalStateException e) {
        System.out.println("Exceção capturada: " + e);
    } catch (Exception e) {
        System.out.println("Exceção capturada: " + e);
    }
  }
  // end::code[]
}
