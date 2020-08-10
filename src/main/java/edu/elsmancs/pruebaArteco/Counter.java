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
		/*
		 * Para contar las frases y párrafos resulta más óptimo contar con un array de carácteres
		 * para poder identificar los puntos y los saltos de linea.
		 * Para contar todo lo demás resulta más óptimo el ArrayList<String>.
		 */
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
	/**
	 * Cuenta todas las palabras del arrayList usando el método size().
	 * @return int
	 */
	public int contarPalabras() {
		return conversor.getArrayPalabras().size();
	}
	/**
	 * Cuenta las frases del String identificando los puntos.
	 * @return int
	 */
	public int contarFrases() {
		int contador = 0;
		
		for (int i = 0; i < conversor.getArrayChar().length; i ++) {
			if (conversor.getArrayChar()[i] == '.') {
				contador ++;
			}
		}
		return contador;
	}
	/**
	 * Los cambios de párrafo están marcados con dos saltos de linea. Identifica
	 * los dos saltos de linea y cuenta los párrafos.
	 * @return int
	 */
	public int contarParrafos() {
		int contador = 1;
		
		for (int i = 0; i < conversor.getArrayChar().length; i ++) {
			if (conversor.getArrayChar()[i] == '\n' && conversor.getArrayChar()[i + 1] == '\n') {
				contador ++;
			}
		}
		return contador;
	}
	/**
	 * Identifica los palíndromos con el método de Identifier
	 * y los cuenta.
	 * @return
	 */
	public int contarPalindromos() {
		int contador = 0;
		
		for(String word : conversor.getArrayPalabras()) { 
			if (identificador.identificarPalindromos(word)) {
				contador ++;
			}
		}
		return contador;
	}
	/**
	 * Identifier identifica los Strings repetidos y ordena las listasy los agrupa en listas
	 * para que después devuelva un map generado por el método generarTabla con los cinco Strings 
	 * más usados y su valor.
	 * @return Map<String, Integer>
	 */
	public Map<String, Integer> contarPalabrasRepetidas() {
		
		ArrayList<ArrayList<String>> listasPalabras = identificador.identificarStringsRepetidas(conversor.getArrayPalabras());
		listasPalabras = identificador.ordenarListas(listasPalabras);
		
		return generarTabla(listasPalabras);
	}
	/**
	 * Identifier genera las combinaciones, identifica los Strings repetidos y los agrupa en listas 
	 * y ordena las listas para que después devuelva un map generado por el método generarTabla 
	 * con los cinco Strings más usados y su valor.
	 * @return Map<String, Integer>
	 */
	public Map<String, Integer> contarCombinacionesRepetidas(){
		
		ArrayList<String> listaCombinaciones = identificador.crearCombinacionesPalabras(conversor.getArrayPalabras());
		
		ArrayList<ArrayList<String>> listaListasStrings = identificador.identificarStringsRepetidas(listaCombinaciones);
		listaListasStrings = identificador.ordenarListas(listaListasStrings);
		
		return generarTabla(listaListasStrings);
	}
	/**
	 * Genera un mapa con las Strings más usadas y su número de usos.	
	 * @param listasStrings
	 * @return Map<String, Integer>
	 */
	private Map<String, Integer> generarTabla(ArrayList<ArrayList<String>> listasStrings){
		Map<String, Integer> tablaPalabras = new HashMap<String, Integer>();
		for(int i = 0; i <= 4; i ++) {
			tablaPalabras.put(listasStrings.get(i).get(0).toLowerCase(), listasStrings.get(i).size());		
		}
		return tablaPalabras;
	}
}
