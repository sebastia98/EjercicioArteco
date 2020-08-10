package edu.elsmancs.pruebaArteco;

import java.util.ArrayList;
/**
 * La clase Identifier es la encargada de encontrar los elementos que luego
 * debe contar la clase contador. Es decir debe encontrar las palabras y combinaciones
 * repetidas y los palíndromos. 
 * @author sebas
 */
public class Identifier {
	/**
	 * Este método revertiza la palabra que recibe por parámetro y combrueba si se lee igual.
	 * En caso afirmativo devuelve true, en caso negativo devuelve false.
	 * @param word
	 * @return Boolean
	 */
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
	/**
	 * Este método recibe por parámetro el arrayList de palabras que genere el Converser y se encarga
	 * de juntar las palabras iguales en listas dentro de un ArrayList<ArrayList<String>>
	 * @param palabras
	 * @return ArrayList<ArrayList<String>>
	 */
	public ArrayList<ArrayList<String>> identificarStringsRepetidas(ArrayList<String> palabras){
		/*
		 * Indicador de si el String que recibe es nuevo o no.
		 */
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
		return listasPalabras;
		
	}
	/**
	 * Este método de encarga de ordenar por tamaño las listas de Strings repetidas. Las de mayor tamaño quedan 
	 * delante mientras que las mas pequeñas detras. Con el método size comprobamos el tamaño de la lista y a su 
	 * vez la cantidad de veces que se repite dicha palabra.
	 * @param listasStringsRepetidas
	 * @return ArrayList<ArrayList<String>>
	 */
	public ArrayList<ArrayList<String>> ordenarListas(ArrayList<ArrayList<String>> listasStringsRepetidas){
		
		/*
		 * Creamos una lista de Strings de referencia de tamaño uno que introducimos dentro de la lista ordenada 
		 * previamente. Así toda nueva lista de Strings que sea mayor o igual a su tamaño pasará una posición 
		 * delante.
		 */
		ArrayList<String> listaReferencia = new ArrayList<String>();
		listaReferencia.add(" ");
		
		ArrayList<ArrayList<String>> listasOrdenadas = new ArrayList<ArrayList<String>>();
		listasOrdenadas.add(listaReferencia);
		
		for (ArrayList<String> lista : listasStringsRepetidas) {
			for (int i = 0; i < listasStringsRepetidas.size(); i++ ) {
				if (lista.size() >= listasOrdenadas.get(i).size()) {
					listasOrdenadas.add(i, lista);
					break;
				}
			}
		}
		return listasOrdenadas;
	}
	/**
	 * Este método recibe por parámetro la lista de Strings. Se encarga de generar todas las posibles combinaciones
	 * de palabras desde su posición hacia delante. Llama identificarStringsRepetidas para unir las combinaciones de
	 * Strings que se repiten y luego llama a ordenarListas para devolver las listas de combinaciones ordenadas.
	 * @param listaPalabras
	 * @return ArrayList<ArrayList<String>>
	 */
	public ArrayList<String> crearCombinacionesPalabras(ArrayList<String> listaPalabras) {
		
		ArrayList<String> listaCombinaciones = new ArrayList<String>();
		/*
		 * Genera las combinaciones respecto a la palabra que recibe. Una vez creadas todas las posibles
		 * combinaciones, pasamos a la siguente palabra.
		 */
		int posicion = 0;
		for (String palabra : listaPalabras) {
			String combinacionNueva = palabra;
			for (int i = posicion + 1; i < listaPalabras.size(); i++) {
				combinacionNueva += " " + listaPalabras.get(i);
				listaCombinaciones.add(combinacionNueva);
			}
			posicion ++;
		}
		return listaCombinaciones;
	}

}

