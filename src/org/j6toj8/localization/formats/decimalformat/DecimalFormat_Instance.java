package org.j6toj8.localization.formats.decimalformat;

import java.text.DecimalFormat;

public class DecimalFormat_Instance {

  public static void main(String[] args) {
    // tag::code[]
    double d = 12345.67;

    // omite todas as posições vazias, utiliza separador a cada 3 casas
    DecimalFormat instance1 = new DecimalFormat("###,###.###");
    System.out.println("###,###.###: " + instance1.format(d));

    // omite as posições vazias na parte decimal, utiliza separador a cada 3 casas
    DecimalFormat instance2 = new DecimalFormat("000,000.###");
    System.out.println("000,000.###: " + instance2.format(d));

    // omite as posições vazias na parte inteira, utiliza separador a cada 3 casas
    DecimalFormat instance3 = new DecimalFormat("###,###.000");
    System.out.println("###,###.000: " + instance3.format(d));

    // apresenta todas as posições, utiliza separador a cada 3 casas
    DecimalFormat instance4 = new DecimalFormat("000,000.000");
    System.out.println("000,000.000: " + instance4.format(d));

    // omite todas as posições vazias, não utiliza separador
    DecimalFormat instance5 = new DecimalFormat("###.##");
    System.out.println("###.##: " + instance5.format(d));

    // apresenta todas as posições, não utiliza separador
    DecimalFormat instance6 = new DecimalFormat("000000.000");
    System.out.println("000000.000: " + instance6.format(d));

    // omite todas as posições vazias, não utiliza separador e não apresenta casas decimais
    DecimalFormat instance7 = new DecimalFormat("###");
    System.out.println("###: " + instance7.format(d));
    // end::code[]
  }
}
