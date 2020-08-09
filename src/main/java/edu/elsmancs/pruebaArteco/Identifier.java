package edu.elsmancs.pruebaArteco;

import java.util.ArrayList;

public class Identifier {
	
	public boolean identificarPalindromos(String word) {
		String palabraInvert = "";
		
		for (int i = word.length() - 1; i >= 0; i -- ) {
			palabraInvert += word.charAt(i);
		}
		
		if (palabraInvert.equalsIgnoreCase(word)) {
			return true;
		}
		
		return false;
	}
	
	public ArrayList<ArrayList<String>> identificarPalabrasRepetidas(ArrayList<String> palabras){
		
		Boolean indicador;
		ArrayList<ArrayList<String>> listasPalabras = new ArrayList<ArrayList<String>>();
		
		for (String palabra : palabras) {
			indicador = true;
			for (ArrayList<String> lista : listasPalabras) {
				if(palabra.equalsIgnoreCase((String) lista.toArray()[0])) {
					lista.add(palabra);
					indicador = false;
					break;
				}
			}
			if (indicador == true) {
				ArrayList<String> palabraNueva = new ArrayList<String>();
				palabraNueva.add(palabra);
				listasPalabras.add(palabraNueva);
			}
		}
		
		listasPalabras = ordenarSetRepeated(listasPalabras);
		
		return listasPalabras;
		
	}
	
	private ArrayList<ArrayList<String>> ordenarSetRepeated(ArrayList<ArrayList<String>> setRepetidos){
		
		ArrayList<String> listaReferencia = new ArrayList<String>();
		listaReferencia.add("Este es el último de set de referencia de tamaño 1");
		
		ArrayList<ArrayList<String>> listaOrdenada = new ArrayList<ArrayList<String>>();
		listaOrdenada.add(listaReferencia);
		
		for (ArrayList<String> set : setRepetidos) {
			for (int i = 0; i < setRepetidos.size(); i++ ) {
				if (set.size() >= listaOrdenada.get(i).size()) {
					listaOrdenada.add(i, set);
					break;
				}
				
			}
			
		}
		return listaOrdenada;
		
	}

}

