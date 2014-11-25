/**
 * 
 */
package fr.main;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import fr.Container;
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
		
		DataOutputStream listeComplete;
		DataOutputStream ver;
		DataOutputStream alpha;
		DataOutputStream nbreLettres;

		ScannerTexte.scanTexte("http://www.altenide.com/lmg.html", "ISO-8859-1");
		
		listeComplete = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(ScannerTexte.titre + ".txt"))));
		listeComplete.writeChars(String.valueOf(Container.listDeMot));
		listeComplete.close();
		
		ver = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("mots_en_ver.txt"))));
		ver.writeChars(String.valueOf(Container.listVer));
		ver.close();
		
		alpha = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("mots_par_lettre.txt"))));
		alpha.writeChars(String.valueOf(Container.listPremiereLettre));
		alpha.close();
		
		nbreLettres = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("nombre_de_lettres.txt"))));
		nbreLettres.writeChars(String.valueOf(Container.listNbreLettres));
		nbreLettres.close();

	}
}

