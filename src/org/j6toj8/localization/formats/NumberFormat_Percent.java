package org.j6toj8.localization.formats;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormat_Percent {

	public static void main(String[] args) {
		// tag::code[]
		NumberFormat percentFormatPtBR = NumberFormat.getPercentInstance(new Locale("pt", "BR"));
		NumberFormat percentFormatEnUS = NumberFormat.getPercentInstance(new Locale("en", "US"));
		
		// Percentual para String
		double d = 0.9;
		
		System.out.println("pt_BR: " + percentFormatPtBR.format(d));
		System.out.println("en_US: " + percentFormatEnUS.format(d));
		
		// String para Percentual
		String  s = "80%";
		
		try {
			System.out.println("pt_BR: " + percentFormatPtBR.parse(s));
			System.out.println("en_US: " + percentFormatEnUS.parse(s));
		} catch (ParseException e) {
			// trate a exceção de parse
		}
		// end::code[]
	}
}
