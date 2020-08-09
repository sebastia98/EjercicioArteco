package edu.elsmancs.pruebaArteco;


import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	String texto = "Hola amigos amigos amigos amigos. Esto es es es es es es es una prueba en toda regla, hola añado "
			+ "palabras.\n"
			+ "\n"
			+ "Y además añado cinco cinco cinco cinco cinco dos dos dos saltos de de linea. "
			+ "Palíndomas ana, sis sis sis sis sis sis sis, tut.\n"
			+ "\n"
			+ "Sigo sigo sigo testeando. Añado mas mas mas mas hola texto.";
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void contarPalabrasTest() {
    	Counter contador = new Counter(texto);
    	assertTrue(contador.countWords() == 57);
    }
    /*
    @Test
    public void textoVacioTest() {
    	Counter contador = new Counter("");
    	assertTrue(contador.countWords() == 0);
    }
    */
    // Contar frases
    
    @Test
    public void contarFrasesTest() {
    	Counter contador = new Counter(texto);
    	assertTrue(contador.countPhrases() == 6);
    }
    
    @Test
    public void contarParagraphsTest() {
    	Counter contador = new Counter(texto);
    	assertTrue(contador.countParagraphs() == 3);
    }
    
    @Test
    public void contarPalindromsTest() {
    	Counter contador = new Counter(texto);
    	assertTrue(contador.countPalindroms() == 10);
    }
    
    @Test
    public void contarRepeatedTest() {
    	Counter contador = new Counter(texto);
    	Map<String, Integer> tablaPalabras = new HashMap<String, Integer>();
    	tablaPalabras = contador.countRepeated();
    	assertTrue(tablaPalabras.containsKey("cinco"));
    	assertTrue(tablaPalabras.containsKey("amigos"));
    	assertTrue(tablaPalabras.containsKey("Sigo"));
    	assertTrue(tablaPalabras.containsKey("sis"));
    	assertTrue(tablaPalabras.containsKey("es"));
    	assertTrue(tablaPalabras.containsKey("mas"));
    }
}
