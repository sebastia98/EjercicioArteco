package edu.elsmancs.pruebaArteco;

import java.util.ArrayList;
/**
 * La clase Converser convierte el String que le pasamos en dos 
 * estructuras distintas. Un array de todos los carácteres del texto 
 * y un arrayList de sus palabras. 
 */
public class Converser {
	private char[] arrayCaracteres = null;
	private ArrayList<String> arrayPalabras = new ArrayList<String>();
	/**
	 * Constructor sin implementación.
	 */
	public Converser() {}
	/**
	 * Recibe el String por parámetro y recorre cada carácter formando palabras
	 * y ignora espacios, comas, puntos y saltos de linea.
	 * @param loren
	 */
	public void setArrayPalabras(String loren) {
		
		String palabra = "";
		
		for (int i = 0; i < loren.length(); i++) {
			if (loren.charAt(i) != ' ' && loren.charAt(i) != '.' &&
				loren.charAt(i) != ',' && loren.charAt(i) != '\n') {
				palabra = palabra + loren.charAt(i);
			} else {
				if (palabra != "") {
					arrayPalabras.add(palabra.toLowerCase());
					palabra = "";
				}
			}
		}
	}
    /**
     * Devuelve el array de palabras.
     * @return ArrayList<String>
     */
	public ArrayList<String> getArrayPalabras(){
		return arrayPalabras;
	}
	/**
	 * Recibe el String por parámetro y genera un array de carácteres 
	 * con el método toCharArray().
	 * @param loren
	 */
	public void setArrayChar(String loren) {
		this.arrayCaracteres = loren.toLowerCase().toCharArray();
	}
	/**
     * Devuelve el array de carácteres.
     * @return char[]
     */
	public char[] getArrayChar() {
		return this.arrayCaracteres;
	}
}
