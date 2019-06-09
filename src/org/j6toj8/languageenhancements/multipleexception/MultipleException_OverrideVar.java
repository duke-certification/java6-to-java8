package org.j6toj8.languageenhancements.multipleexception;

public class MultipleException_OverrideVar {

  // tag::code[]
  public static void main(String[] args) {
    
    try {
        throw new NullPointerException();
    } catch (NullPointerException | IllegalArgumentException e) {
        e = new IllegalStateException(); // NÃO COMPILA - a variável não pode ser sobrescrita quando está em um multi-catch
    } catch (Exception e) {
        e = new IllegalStateException(); // COMPILA - ainda é possível sobrescrever a variável quando não é um multi-catch
    }
  }
  // end::code[]
  
}
