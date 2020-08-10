package edu.elsmancs.pruebaArteco;


import static org.junit.Assert.assertTrue;
import java.util.Map;
import org.junit.Test;

public class CounterTest 
{
    @Test
    public void contarPalabrasTest() {
    	String texto = "Hola amigos, esto es un texto de prueba.";
    	Counter contador = new Counter(texto);
    	assertTrue(contador.contarPalabras() == 8);
    }
    @Test
    public void contarFrasesTest() {
    	String texto = "Hola amigos. "
    			     + "Esto es otro test. "
    			     + "Con tres frases.";
    	Counter contador = new Counter(texto);
    	assertTrue(contador.contarFrases() == 3);
    }
    @Test
    public void contarParagraphsTest() {
    	String texto = "Hola amigos.\n\n"
			          + "Esto es otro test.\n\n"
			          + "Con tres párrafos.";
    	Counter contador = new Counter(texto);
    	assertTrue(contador.contarParrafos() == 3);
    }
    @Test
    public void contarPalindromsTest() {
    	String texto = "Ana sis palabra sis ana.";
    	Counter contador = new Counter(texto);
    	assertTrue(contador.contarPalindromos().size() == 4);
    }
    @Test
    public void contarRepeatedTest() {
    	String prueba = "Uno uno uno uno uno uno ... dos dos ... tres tres tres tres ..."
    			      + " cuatro cuatro cuatro cuatro cuatro ... cinco cinco cinco.";
    	Counter contador = new Counter(prueba);
    	Map<String, Integer> tablaPalabras = contador.contarPalabrasRepetidas();
    	assertTrue(tablaPalabras.get("uno") == 6);
    	assertTrue(tablaPalabras.get("dos") == 2);
    	assertTrue(tablaPalabras.get("tres") == 4);
    	assertTrue(tablaPalabras.get("cuatro") == 5);
    	assertTrue(tablaPalabras.get("cinco") == 3);
    } 
    @Test
    public void contarTuplasTest() {
    	String prueba = "Combinación uno fej combinación uno iuc ie3ufn combinación uno iufb "
    			      + "combinación dos ring combinación dos ieng combinación dos onrf combinación dos fdsf "
    			      + "combinación tres ojrnf combinación tres gee combinación tres efbv "
    			      + "combinación cuatro dine combinación cuatro uuyb "
    			      + "combinación cinco oiwfn combinación cinco of combinación cinco ofcne.";
    	Counter contador = new Counter(prueba);
    	Map<String, Integer> tablaCombinaciones = contador.contarCombinacionesRepetidas();
    	assertTrue(tablaCombinaciones.get("combinación uno") == 3);
    	assertTrue(tablaCombinaciones.get("combinación dos") == 4);
    	assertTrue(tablaCombinaciones.get("combinación tres") == 3);
    	assertTrue(tablaCombinaciones.get("combinación cuatro") == 2);
    	assertTrue(tablaCombinaciones.get("combinación cinco") == 3);
    }
}
