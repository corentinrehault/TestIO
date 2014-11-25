/**
 * 
 */
package fr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author dao303
 *
 */
public class Container {

	public static List<String> listDeMot = new ArrayList<String>();
	public static List<String> listVer = new ArrayList<String>();
	public static HashMap<String, Integer> listPremiereLettre = new HashMap<String, Integer>();
	public static HashMap<Integer, Integer> listNbreLettres = new HashMap<Integer, Integer>();

	static void buildGeneralList(String mot) {
		listDeMot.add(mot);
	}

	static void builEndVerList(String mot) {
		listVer.add(mot);
	}

	static void buildPremiereLettreList(String premiereLettre, Integer nombreDeMots) {
		listPremiereLettre.put(premiereLettre, nombreDeMots);
	}

	static void buildNbreLettresList(Integer nombreDeLettres, Integer nombreDeMots) {
		listNbreLettres.put(nombreDeLettres, nombreDeMots);
	}


}
