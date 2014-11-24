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

	static List<String> listDeMot = new ArrayList<String>();
	static List<String> listVer = new ArrayList<String>();
	static HashMap<String, Integer> listPremiereLettre = new HashMap<String, Integer>();
	static HashMap<Integer, Integer> listNbreLettres = new HashMap<Integer, Integer>();

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
