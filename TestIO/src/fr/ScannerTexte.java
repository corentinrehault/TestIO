/**
 * 
 */
package fr;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author dao303
 *
 */
public class ScannerTexte {

	public static void scanTexte(String monUrl) throws MalformedURLException, IOException {

		Scanner scan = new Scanner(new URL(monUrl).openStream());
		String titre = new String("<title>");
		int nbreDeMotsa = 0;
		int nbreDeMotsb = 0;
		int nbreDeMotsc = 0;
		int nbreDeMotsd = 0;
		int nbreDeMotse = 0;
		int nbreDeMotsf = 0;
		int nbreDeMotsg = 0;
		int nbreDeMotsh = 0;
		int nbreDeMotsi = 0;
		int nbreDeMotsj = 0;
		int nbreDeMotsk = 0;
		int nbreDeMotsl = 0;
		int nbreDeMotsm = 0;
		int nbreDeMotsn = 0;
		int nbreDeMotso = 0;
		int nbreDeMotsp = 0;
		int nbreDeMotsq = 0;
		int nbreDeMotsr = 0;
		int nbreDeMotss = 0;
		int nbreDeMotst = 0;
		int nbreDeMotsu = 0;
		int nbreDeMotsv = 0;
		int nbreDeMotsw = 0;
		int nbreDeMotsx = 0;
		int nbreDeMotsy = 0;
		int nbreDeMotsz = 0;

		//Tableau alphabétique
		char letr = 'a';
		char alphabet[] = new char[26]; 
		for (int i = 0; i <= 25; i++) {
			alphabet[i] = letr;
			letr++;
			System.out.println(alphabet[i]);
		}	

		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			if (line.contains("<title>")) {
				//				System.out.println(line.length());
			}
			if (!line.contains("<")) {
				//				System.err.println(line); 
				Container.buildGeneralList(line);
			}	
			if (line.endsWith("ver")) {
				//				System.out.println(line);
				Container.builEndVerList(line);
			}
			
			/*for (int nbre = 1; nbre <= 50; nbre++) {
				if (nbre == line.length()) {

				}
			}*/
			
			//Méthode par switch
			
			switch (line.charAt(0)) {
			case 'a':
				nbreDeMotsa++;
				Container.buildPremiereLettreList("a", nbreDeMotsa);
				break;
			case 'b':
				nbreDeMotsb++;
				Container.buildPremiereLettreList("b", nbreDeMotsb);
				break;
			case 'c':
				nbreDeMotsc++;
				Container.buildPremiereLettreList("c", nbreDeMotsc);
				break;
			case 'd':
				nbreDeMotsd++;
				Container.buildPremiereLettreList("d", nbreDeMotsd);
				break;
			case 'e':
				nbreDeMotse++;
				Container.buildPremiereLettreList("e", nbreDeMotse);
				break;
			case 'f':
				nbreDeMotsf++;
				Container.buildPremiereLettreList("f", nbreDeMotsf);
				break;
			case 'g':
				nbreDeMotsg++;
				Container.buildPremiereLettreList("g", nbreDeMotsg);
				break;
			case 'h':
				nbreDeMotsh++;
				Container.buildPremiereLettreList("h", nbreDeMotsh);
				break;
			case 'i':
				nbreDeMotsi++;
				Container.buildPremiereLettreList("i", nbreDeMotsi);
				break;
			case 'j':
				nbreDeMotsj++;
				Container.buildPremiereLettreList("j", nbreDeMotsj);
				break;
			case 'k':
				nbreDeMotsk++;
				Container.buildPremiereLettreList("k", nbreDeMotsk);
				break;
			case 'l':
				nbreDeMotsl++;
				Container.buildPremiereLettreList("l", nbreDeMotsl);
				break;
			case 'm':
				nbreDeMotsm++;
				Container.buildPremiereLettreList("m", nbreDeMotsm);
				break;
			case 'n':
				nbreDeMotsn++;
				Container.buildPremiereLettreList("n", nbreDeMotsn);
				break;
			case 'o':
				nbreDeMotso++;
				Container.buildPremiereLettreList("o", nbreDeMotso);
				break;
			case 'p':
				nbreDeMotsp++;
				Container.buildPremiereLettreList("p", nbreDeMotsp);
				break;
			case 'q':
				nbreDeMotsq++;
				Container.buildPremiereLettreList("q", nbreDeMotsq);
				break;
			case 'r':
				nbreDeMotsr++;
				Container.buildPremiereLettreList("r", nbreDeMotsr);
				break;
			case 's':
				nbreDeMotss++;
				Container.buildPremiereLettreList("s", nbreDeMotss);
				break;
			case 't':
				nbreDeMotst++;
				Container.buildPremiereLettreList("t", nbreDeMotst);
				break;
			case 'u':
				nbreDeMotsu++;
				Container.buildPremiereLettreList("u", nbreDeMotsu);
				break;
			case 'v':
				nbreDeMotsv++;
				Container.buildPremiereLettreList("v", nbreDeMotsv);
				break;
			case 'w':
				nbreDeMotsw++;
				Container.buildPremiereLettreList("w", nbreDeMotsw);
				break;
			case 'x':
				nbreDeMotsx++;
				Container.buildPremiereLettreList("x", nbreDeMotsx);
				break;
			case 'y':
				nbreDeMotsy++;
				Container.buildPremiereLettreList("y", nbreDeMotsy);
				break;
			case 'z':
				nbreDeMotsz++;
				Container.buildPremiereLettreList("z", nbreDeMotsz);
				break;				
			default :
				
			}
			
		}
		System.out.println("nombre de mots en : " + Container.listPremiereLettre);
		System.out.println("list recupérée " + Container.listDeMot.size());
		System.out.println("nbre mot ver" + Container.listVer.size());
		scan.close();
	}

}
