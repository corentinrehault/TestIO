/**
 * 
 */
package fr.main;

import java.awt.AlphaComposite;
import java.io.IOException;
import java.net.MalformedURLException;
import fr.ScannerTexte;

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

		ScannerTexte.scanTexte("http://www.altenide.com/lmg.html");
		//ListeAlpha.buildAlphabet();
		//System.out.println(ListeAlpha.alphabet);

	}
}

