package edu.elsmancs.pruebaArteco;


public class Counter {

	private char[] loren = null;
	
	public Counter(String loren) {
		// TODO Auto-generated constructor stub
		this.loren = loren.toCharArray();
	}

	public int countWords() {
		// TODO Auto-generated method stub
		
		// Comprobamos que el texto no esté vacío
		
		if (loren.length == 0) {
			return 0;
		}
		
		// Iniciamos en uno el contador para tener en cuenta la primera palabra
		int contador = 1;
		
		for (int i = 0; i < loren.length; i ++) {
			if (loren[i] == ' ' && loren[i + 1] != ' ') { 
				contador ++;
			} else if (loren[i] == '\n' && loren[i + 1] == '\n'){
				contador ++;
			}
		}
		return contador;
	}

	public int countPhrases() {
		// TODO Auto-generated method stub
		
		if (loren.length == 0) {
			return 0;
		}
		
		int contador = 0;
		
		for (int i = 0; i < loren.length; i ++) {
			if (loren[i] == '.') {
				contador ++;
			}
		}
		return contador;
	}

}
