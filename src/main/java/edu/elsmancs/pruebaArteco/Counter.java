package edu.elsmancs.pruebaArteco;


public class Counter {

	private char[] loren = null;
	
	public Counter(String loren) {
		// TODO Auto-generated constructor stub
		this.loren = loren.toCharArray();
	}

	public int countWords() {
		// TODO Auto-generated method stub
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
	

}
