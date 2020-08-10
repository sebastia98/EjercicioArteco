package edu.elsmancs.pruebaArteco;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;

import org.junit.Test;

public class ConverserTest {

	@Test
	public void setArrayPalabras() {
		String texto = "Este,es un.texto\nsencillo.";
		Converser converser = new Converser();
		ArrayList<String> arrayTest = new ArrayList<String>();
		arrayTest.add("este");
		arrayTest.add("es");
		arrayTest.add("un");
		arrayTest.add("texto");
		arrayTest.add("sencillo");
		converser.setArrayPalabras(texto);
		assertArrayEquals(arrayTest.toArray(), converser.getArrayPalabras().toArray());	
	}
	@Test
	public void setArrayCaracteres() {
		String texto = "Hola. Caracter";
		Converser converser = new Converser();
		char [] charTest = {'h', 'o','l','a','.', ' ', 'c', 'a', 'r', 'a', 'c', 't', 'e', 'r'}; 
		converser.setArrayChar(texto);
		assertArrayEquals(converser.getArrayChar(), charTest);	
	}
}
