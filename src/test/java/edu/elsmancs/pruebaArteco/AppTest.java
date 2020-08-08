package edu.elsmancs.pruebaArteco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	String texto = "Hola amigos. Esto es una prueba en toda regla, hola añado "
			+ "palabras.\n"
			+ "\n"
			+ "Y además añado dos dos dos saltos de linea. Palíndomas ana, sis, tut.\n"
			+ "\n"
			+ "Sigo sigo sigo testeando. Añado mas mas mas hola texto.";
	
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
    	assertTrue(contador.countWords() == 27);
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
    	assertTrue(contador.countPalindroms() == 4);
    }
    
    @Test
    public void contarRepeatedTest() {
    	Counter contador = new Counter(texto);
    	Map<String, Integer> mapa = new HashMap<String, Integer>();
    	mapa.put("dos" , 3);
    	mapa.put("añado" , 3);
    	mapa.put("hola" , 3);
    	mapa.put("sigo" , 3);
    	mapa.put("mas" , 3);
    	assertEquals(contador.countRepeated().keySet(), mapa.keySet());
    	assertEquals(contador.countRepeated().values(), mapa.values());
    }
}
