package edu.elsmancs.pruebaArteco;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	String texto = "Hola amigos. Esto es una prueba en toda regla, añado "
			+ "palabras.\n"
			+ "\n"
			+ "Y además añado dos saltos de linea.\n"
			+ "\n"
			+ "Sigo testeando. Añado mas texto.";
	
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
    	assertTrue(contador.countWords() == 23);
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
    	assertTrue(contador.countPhrases() == 5);
    }
}
