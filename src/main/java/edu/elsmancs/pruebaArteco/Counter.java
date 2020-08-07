package edu.elsmancs.pruebaArteco;

import java.util.ArrayList;

public class Counter {
	
	String lorenString = null;
	private char[] lorenArrayChar = null;
	private ArrayList<String> arrayListLoren = new ArrayList<String>();
	
	public Counter(String loren) {
		this.lorenString = loren;
	}
	
	private void setArrayList(String loren) {
		
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
	
	private void setArrayChar(String loren) {
		this.lorenArrayChar = loren.toCharArray();
	}
	
	public char[] getArrayChar() {
		return this.lorenArrayChar;
	}
	
	public ArrayList<String> getArrayList(){
		return arrayListLoren;
	}
	
	public int countWords() {
		setArrayList(this.lorenString);
		return getArrayList().size();
	}
	
	public int countPhrases() {
		// TODO Auto-generated method stub
		
		setArrayChar(this.lorenString);
		
		int contador = 0;
		
		for (int i = 0; i < getArrayChar().length; i ++) {
			if (getArrayChar()[i] == '.') {
				contador ++;
			}
		}
		return contador;
	}

}
