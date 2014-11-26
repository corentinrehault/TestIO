/**
 * 
 */
package fr.main;

import java.io.IOException;
import java.net.MalformedURLException;

import fr.service.Ecriture;
import fr.service.ScannerTexte;

/**
 * @author dao303
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws MalformedURLException 
	 * 
	 */
	public static void main(String[] args) throws MalformedURLException, IOException {

		ScannerTexte.scanTexte("http://www.altenide.com/lmg.html", "ISO-8859-1");
		Ecriture.EcritureFichiers();

	}
}

