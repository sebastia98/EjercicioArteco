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
    	assertTrue(contador.contarPalabras() == 57);
    }
    
    @Test
    public void contarFrasesTest() {
    	Counter contador = new Counter(texto);
    	assertTrue(contador.contarFrases() == 6);
    }
    
    @Test
    public void contarParagraphsTest() {
    	Counter contador = new Counter(texto);
    	assertTrue(contador.contarParrafos() == 3);
    }
    
    @Test
    public void contarPalindromsTest() {
    	Counter contador = new Counter(texto);
    	assertTrue(contador.contarPalindromos() == 10);
    }
    
    @Test
    public void contarRepeatedTest() {
    	String prueba = "Uno uno uno uno uno ... dos dos dos dos dos ... tres tres tres tres ..."
    			      + " cuatro cuatro cuatro cuatro cuatro ... cinco cinco cinco";
    	Counter contador = new Counter(prueba);
    	Map<String, Integer> tablaPalabras = new HashMap<String, Integer>();
    	tablaPalabras = contador.contarPalabrasRepetidas();
    	assertTrue(tablaPalabras.containsKey("uno"));
    	assertTrue(tablaPalabras.containsKey("dos"));
    	assertTrue(tablaPalabras.containsKey("tres"));
    	assertTrue(tablaPalabras.containsKey("cuatro"));
    	assertTrue(tablaPalabras.containsKey("cinco"));
    }
    
    @Test
    public void contarTuplasTest() {
    	String prueba = "Combinación uno fej combinación uno iuc ie3ufn combinación uno iufb "
    			      + "combinación dos ring combinación dos ieng combinación dos onrf combinación dos fdsf "
    			      + "combinación tres ojrnf combinación tres gee combinación tres efbv"
    			      + "combinación cuatro odk combinación cuatro dine combinación cuatro revg combinación cuatro wf "
    			      + "combinación cinco oiwfn combinación cinco of combinación cinco ofcne ";
    	Counter contador = new Counter(prueba);
    	Map<String, Integer> tablaCombinaciones = new HashMap<String, Integer>();
    	tablaCombinaciones = contador.contarCombinacionesRepetidas();
    	assertTrue(tablaCombinaciones.containsKey("combinación uno"));
    	assertTrue(tablaCombinaciones.containsKey("combinación dos"));
    	assertTrue(tablaCombinaciones.containsKey("combinación tres"));
    	assertTrue(tablaCombinaciones.containsKey("combinación cuatro"));
    	assertTrue(tablaCombinaciones.containsKey("combinación cinco"));
    }
}
