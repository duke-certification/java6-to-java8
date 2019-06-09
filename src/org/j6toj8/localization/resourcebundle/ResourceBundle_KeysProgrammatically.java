package org.j6toj8.localization.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class ResourceBundle_KeysProgrammatically {

  // tag::code[]
  public static void main(String[] args) {

    Locale.setDefault(new Locale("en", "US")); // Coloca o Locale en_US como padrão
    
    ResourceBundle bundle = ResourceBundle.getBundle("Text", new Locale("pt", "BR")); // Recupera o bundle 'Text' para o Locale pt_BR
    Set<String> keySet = bundle.keySet(); // Pega um Set com todas as chaves
    for (String key : keySet) {
      System.out.println(key + " - " + bundle.getString(key)); // Imprime "<chave> - <valor>" 
    }

  }
  // end::code[]
}
