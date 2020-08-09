package edu.elsmancs.pruebaArteco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Counter {
	
	
	//Inyección de dependencias
	
	private Converser conversor = new Converser();
	private Identifier identificador = new Identifier();
	
	public Counter(String loren) {
		conversor.setArrayChar(loren);
		conversor.setArrayList(loren);
	}
	
	public String toString() {
		return "Este texto tiene " + this.contarPalabras() + " palabras.\n"
			 + "Este texto tiene " + this.contarFrases() + " frases.\n"
		   	 + "Este texto tiene " + this.contarParrafos() + " párrafos.\n"
		   	 + "Este texto tiene " + this.contarPalindromos() + " palíndromas.\n"
		   	 + "Estas son las palabras más usadas " + this.contarPalabrasRepetidas() + "\n"
		   	 + "Estas son las combinaciones de palabras más usadas " + this.contarCombinacionesRepetidas();
	}
	
	public int contarPalabras() {
		return conversor.getArrayList().size();
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
		
		for(String word : conversor.getArrayList()) { 
			
			if (identificador.identificarPalindromos(word)) {
				contador ++;
			}
		}
		
		return contador;
	}
	
	public Map<String, Integer> contarPalabrasRepetidas() {
		Map<String, Integer> tablaPalabras = new HashMap<String, Integer>();
		ArrayList<ArrayList<String>> listasPalabrasOrdenada = identificador.identificarStringsRepetidas(conversor.getArrayList());
		
		for(int i = 0; i <= 4; i ++) {
			
			tablaPalabras.put(listasPalabrasOrdenada.get(i).get(0), listasPalabrasOrdenada.get(i).size());
			
		}
		return tablaPalabras;
	}
	
	public Map<String, Integer> contarCombinacionesRepetidas(){
		
		ArrayList<ArrayList<String>> listaCombinaciones = new ArrayList<ArrayList<String>>();
		listaCombinaciones = identificador.crearCombinacionesPalabras(conversor.getArrayList());
		
		Map<String, Integer> tablaCombinaciones = new HashMap<String, Integer>();
		
		for(int i = 0; i <= 4; i ++) {
			
			tablaCombinaciones.put(listaCombinaciones.get(i).get(0), listaCombinaciones.get(i).size());
			
		}
		return tablaCombinaciones;
	}

}
