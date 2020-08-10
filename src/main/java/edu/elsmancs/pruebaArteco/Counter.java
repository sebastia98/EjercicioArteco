package edu.elsmancs.pruebaArteco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * Esta clase se encarga de contar los elementos demandados. Palabras, frases, párrafos, 
 * palíndromas, palabras repetidas y combinaciones de palabras repetidas.
 * @author sebas
 */
public class Counter {
	/*
	 * Inyección de dependencias
	 */
	private Converser conversor = new Converser();
	private Identifier identificador = new Identifier();
	/**
	 * Constructor de la clase. Recibe por parámetro el String y establece dos estructuras de datos.
	 * Un array de carácteres y un arrayList de Strings.
	 * @param loren
	 */
	public Counter(String loren) {
		conversor.setArrayChar(loren);
		conversor.setArrayPalabras(loren);
	}
	@Override
	public String toString() {
		return "Este texto tiene " + this.contarPalabras() + " palabras.\n"
			 + "Este texto tiene " + this.contarFrases() + " frases.\n"
		   	 + "Este texto tiene " + this.contarParrafos() + " párrafos.\n"
		   	 + "Este texto tiene " + this.contarPalindromos() + " palíndromas.\n"
		   	 + "Estas son las palabras más usadas " + this.contarPalabrasRepetidas() + "\n"
		   	 + "Estas son las combinaciones de palabras más usadas " + this.contarCombinacionesRepetidas();
	}
	
	public int contarPalabras() {
		return conversor.getArrayPalabras().size();
	}
	
	public int contarFrases() {
		int contador = 0;
		for (int i = 0; i < conversor.getArrayChar().length; i ++) {
			if (conversor.getArrayChar()[i] == '.') {
				contador ++;
			}
		}
		return contador;
	}

	public int contarParrafos() {
		int contador = 1;
		
		for (int i = 0; i < conversor.getArrayChar().length; i ++) {
			if (conversor.getArrayChar()[i] == '\n' && conversor.getArrayChar()[i + 1] == '\n') {
				contador ++;
			}
		}
		
		return contador;
	}

	
	public int contarPalindromos() {
		int contador = 0;
		
		for(String word : conversor.getArrayPalabras()) { 
			
			if (identificador.identificarPalindromos(word)) {
				contador ++;
			}
		}
		
		return contador;
	}
	
	public Map<String, Integer> contarPalabrasRepetidas() {
		Map<String, Integer> tablaPalabras = new HashMap<String, Integer>();
		ArrayList<ArrayList<String>> listasPalabras = identificador.identificarStringsRepetidas(conversor.getArrayPalabras());
		listasPalabras = identificador.ordenarListas(listasPalabras);
		
		for(int i = 0; i <= 4; i ++) {
			tablaPalabras.put(listasPalabras.get(i).get(0).toLowerCase(), listasPalabras.get(i).size());		
		}
		return tablaPalabras;
	}
	
	public Map<String, Integer> contarCombinacionesRepetidas(){
		
		ArrayList<String> listaCombinaciones = new ArrayList<String>();
		listaCombinaciones = identificador.crearCombinacionesPalabras(conversor.getArrayPalabras());
		
		ArrayList<ArrayList<String>> listaListasStrings = new ArrayList<ArrayList<String>>();
		listaListasStrings = identificador.identificarStringsRepetidas(listaCombinaciones);
		listaListasStrings = identificador.ordenarListas(listaListasStrings);
		
		Map<String, Integer> tablaCombinaciones = new HashMap<String, Integer>();
		
		for(int i = 0; i <= 4; i ++) {
			
			tablaCombinaciones.put(listaListasStrings.get(i).get(0).toLowerCase(), listaListasStrings.get(i).size());
			
		}
		return tablaCombinaciones;
	}

}
