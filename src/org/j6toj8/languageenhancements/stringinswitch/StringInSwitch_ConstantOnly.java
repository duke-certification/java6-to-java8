package org.j6toj8.languageenhancements.stringinswitch;

public class StringInSwitch_ConstantOnly {

  // tag::code[]
  private static final String FEV = "fev";
  private static String jan = "jan";
  
  public static void getNomeMes(final String mai) {
    
    String mes = "jan";
    
    final String mar = "mar";
    String abr = "abr";
    
    switch (mes) {
    case jan: // NÃO COMPILA - jan é um atributo comum, pode mudar em tempo de execução
      System.out.println("Janeiro");
      break;
    case FEV: // COMPILA - FEV é uma constante em tempo de compilação, seu valor nunca muda
      System.out.println("Fevereiro");
      break;
    case mar: // COMPILA - mar é uma constante em tempo de compilação, seu valor nunca muda
      System.out.println("Março");
      break;
    case abr: // NÃO COMPILA - abr é uma variável comum, pode mudar em tempo de execução
      System.out.println("Março");
      break;
    case mai: // NÃO COMPILA - mai é final, mas não é constante, pode mudar em tempo de execução
      System.out.println("Março");
      break;
     }
  }
  // end::code[]
}
