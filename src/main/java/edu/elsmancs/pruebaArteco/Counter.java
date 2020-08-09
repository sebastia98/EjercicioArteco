package edu.elsmancs.pruebaArteco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Counter {
	
	String loren = null;
	
	//Inyección de dependencias
	
	private Converser conversor = new Converser();
	private Identifier identificador = new Identifier();
	
	public Counter(String loren) {
		conversor.setArrayChar(loren);
		conversor.setArrayList(loren);
	}
	
	public String toString() {
		return "Este texto tiene " + this.countWords() + " palabras.\n"
			 + "Este texto tiene " + this.countPhrases() + " frases.\n"
		   	 + "Este texto tiene " + this.countParagraphs() + " párrafos.\n"
		   	 + "Este texto tiene " + this.countPalindroms() + " palíndromas.\n"
		   	 + "Estos son las palabras más usadas " + this.countRepeated();
	}
	
	public int countWords() {
		return conversor.getArrayList().size();
	}
	
	public int countPhrases() {
		int contador = 0;
		
		for (int i = 0; i < conversor.getArrayChar().length; i ++) {
			if (conversor.getArrayChar()[i] == '.') {
				contador ++;
			}
		}
		return contador;
	}

	public int countParagraphs() {
		int contador = 1;
		
		for (int i = 0; i < conversor.getArrayChar().length; i ++) {
			if (conversor.getArrayChar()[i] == '\n' && conversor.getArrayChar()[i + 1] == '\n') {
				contador ++;
			}
		}
		
		return contador;
	}

	
	public int countPalindroms() {
		int contador = 0;
		
		for(String word : conversor.getArrayList()) { 
			
			if (identificador.identificarPalindromos(word)) {
				contador ++;
			}
		}
		
		return contador;
	}

	public Map<String, Integer> countRepeated() {
		Map<String, Integer> tablaPalabras = new HashMap<String, Integer>();
		ArrayList<ArrayList<String>> listasPalabrasOrdenada = identificador.identificarPalabrasRepetidas(conversor.getArrayList());
		
		for(int i = 0; i <= 4; i ++) {
			
			tablaPalabras.put(listasPalabrasOrdenada.get(i).get(0), listasPalabrasOrdenada.get(i).size());
			
		}
		return tablaPalabras;
	}

}
