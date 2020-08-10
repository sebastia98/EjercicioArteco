package edu.elsmancs.pruebaArteco;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class IdentifierTest {

	@Test
	public void identificarPalindromosTest() {
		Identifier identifier = new Identifier();
		assertTrue(identifier.identificarPalindromos("ana"));
		assertTrue(identifier.identificarPalindromos("AaaANNnnaAAa"));
		assertFalse(identifier.identificarPalindromos("aiub"));
		assertFalse(identifier.identificarPalindromos("palabra"));
	}
	@Test
	public void identificarStringsRepetidasTest() {
		Identifier identifier = new Identifier();
		ArrayList<String> listaPrueba = new ArrayList<String>();
		listaPrueba.add("tres");
		listaPrueba.add("dos");
		listaPrueba.add("dos");
		listaPrueba.add("uno");
		listaPrueba.add("uno");
		listaPrueba.add("uno");
		/*
		 * Simulamos la supuesta salida. Creamos tres listas de Strings.
		 * Primero tres, después dos y después uno. 
		 */
		ArrayList<ArrayList<String>> ejemplo = new ArrayList<ArrayList<String>>();
		ArrayList<String> listaUno = new ArrayList<String>();
		listaUno.add("uno");
		listaUno.add("uno");
		listaUno.add("uno");
		
		ArrayList<String> listaDos = new ArrayList<String>();
		listaDos.add("dos");
		listaDos.add("dos");
		
		ArrayList<String> listaTres = new ArrayList<String>();
		listaTres.add("tres");
		
		ejemplo.add(listaTres);
		ejemplo.add(listaDos);
		ejemplo.add(listaUno);
		
		assertArrayEquals(identifier.identificarStringsRepetidas(listaPrueba).toArray(), ejemplo.toArray());
	}
	
	@Test
	public void crearCombinacionesTest() {
		Identifier identifier = new Identifier();
		ArrayList<String> listaPrueba = new ArrayList<String>();
		listaPrueba.add("tres");
		listaPrueba.add("dos");
		listaPrueba.add("uno");
		
		ArrayList<String> listaTest = new ArrayList<String>();
		listaTest.add("tres dos");
		listaTest.add("tres dos uno");
		listaTest.add("dos uno");
		
		assertArrayEquals(identifier.crearCombinacionesPalabras(listaPrueba).toArray(), listaTest.toArray());
	}

}
