package edu.elsmancs.pruebaArteco;

public class Identifier {
	
	public boolean identificarPalindroms(String word) {
		String palabraInvert = "";
		
		for (int i = word.length() - 1; i >= 0; i -- ) {
			palabraInvert += word.charAt(i);
		}
		
		if (palabraInvert.equalsIgnoreCase(word)) {
			return true;
		}
		
		return false;
	}

}
