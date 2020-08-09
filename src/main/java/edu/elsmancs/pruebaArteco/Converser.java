package edu.elsmancs.pruebaArteco;

import java.util.ArrayList;

public class Converser {
	private char[] lorenArrayChar = null;
	private ArrayList<String> arrayListLoren = new ArrayList<String>();
	
	public Converser() {
	}
	
	public void setArrayList(String loren) {
		
		String palabra = "";
		
		for (int i = 0; i < loren.length(); i++) {
			if (loren.charAt(i) != ' ' && loren.charAt(i) != '.' &&
				loren.charAt(i) != ',' && loren.charAt(i) != '\n') {
				palabra = palabra + loren.charAt(i);
			} else {
				if (palabra != "") {
					arrayListLoren.add(palabra);
					palabra = "";
				}
			}
		}
	}

	public ArrayList<String> getArrayList(){
		return arrayListLoren;
	}
	
	public void setArrayChar(String loren) {
		this.lorenArrayChar = loren.toCharArray();
	}
	
	public char[] getArrayChar() {
		return this.lorenArrayChar;
	}
}
