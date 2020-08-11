package edu.elsmancs.pruebaArteco;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
/**
 * Clase Main, parsea el html de la url que genera el texto lorenIpsun y 
 * crea un String con sus párrafos.
 * @author sebas
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	String loren = "";
        Document doc = Jsoup.connect("https://es.lipsum.com/feed/html").get();
        Element content = doc.getElementById("lipsum");
        for (Element p : content.getElementsByTag("p")) {
        	loren += p.text() + "\n";
        }
        System.out.println(loren);
    	Counter contador = new Counter(loren);
    	System.out.println(contador.toString());
    	
    	
    }
}
