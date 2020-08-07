package edu.elsmancs.pruebaArteco;

public class Counter {
	
	String loren = null;
	
	//Inyección de dependencias
	
	private Converser conversor = new Converser(loren);
	
	public Counter(String loren) {
		this.loren = loren;
	}
	
	public int countWords() {
		conversor.setArrayList(this.loren);
		return conversor.getArrayList().size();
	}
	
	public int countPhrases() {
		// TODO Auto-generated method stub
		
		conversor.setArrayChar(this.loren);
		
		int contador = 0;
		
		for (int i = 0; i < conversor.getArrayChar().length; i ++) {
			if (conversor.getArrayChar()[i] == '.') {
				contador ++;
			}
		}
		return contador;
	}

}
