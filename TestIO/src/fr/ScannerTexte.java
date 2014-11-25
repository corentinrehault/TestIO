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

	public static String titre = new String();

	/**
	 * @param monUrl
	 * @param charSet
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public static void scanTexte(String monUrl, String charSet) throws MalformedURLException, IOException {

		Scanner scan = new Scanner(new URL(monUrl).openStream(), charSet);

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

		int nbreDeLettres1 = 0;
		int nbreDeLettres2 = 0;
		int nbreDeLettres3 = 0;
		int nbreDeLettres4 = 0;
		int nbreDeLettres5 = 0;
		int nbreDeLettres6 = 0;
		int nbreDeLettres7 = 0;
		int nbreDeLettres8 = 0;
		int nbreDeLettres9 = 0;
		int nbreDeLettres10 = 0;
		int nbreDeLettres11 = 0;
		int nbreDeLettres12 = 0;
		int nbreDeLettres13 = 0;
		int nbreDeLettres14 = 0;
		int nbreDeLettres15 = 0;
		int nbreDeLettres16 = 0;
		int nbreDeLettres17 = 0;
		int nbreDeLettres18 = 0;
		int nbreDeLettres19 = 0;
		int nbreDeLettres20 = 0;
		int nbreDeLettres21 = 0;
		int nbreDeLettres22 = 0;
		int nbreDeLettres23 = 0;
		int nbreDeLettres24 = 0;
		int nbreDeLettres25 = 0;

		//Tableau alphabétique
		char letr = 'a';
		char alphabet[] = new char[26]; 
		for (int i = 0; i <= 25; i++) {
			alphabet[i] = letr;
			letr++;
			//System.out.println(alphabet[i]);
		}

		//Tableau de nombres
		int nombres[] = new int[50];
		for (int i = 0; i <= 49; i++) {
			nombres[i] = i+1;
			//System.out.println(nombres[i]);
		}

		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			if (line.contains("<title>")) {
				titre = line.toString();
				titre = titre.replace("<title>", "");
				titre = titre.replace("</title>", "");
				titre = titre.replace(" ", "_");
			}
			if (!line.contains("<")) {
				//				System.err.println(line); 
				Container.buildGeneralList(line);

				//Méthode par switch pour l'alphabet

				switch (line.charAt(0)) {
				case 'a': case 'A': case 'à': case 'â':
					nbreDeMotsa++;
					Container.buildPremiereLettreList("a", nbreDeMotsa);
					break;
				case 'b': case 'B':
					nbreDeMotsb++;
					Container.buildPremiereLettreList("b", nbreDeMotsb);
					break;
				case 'c': case 'C': case 'ç':
					nbreDeMotsc++;
					Container.buildPremiereLettreList("c", nbreDeMotsc);
					break;
				case 'd': case 'D':
					nbreDeMotsd++;
					Container.buildPremiereLettreList("d", nbreDeMotsd);
					break;
				case 'e': case 'E': case 'é': case 'è': case 'ê':
					nbreDeMotse++;
					Container.buildPremiereLettreList("e", nbreDeMotse);
					break;
				case 'f': case 'F':
					nbreDeMotsf++;
					Container.buildPremiereLettreList("f", nbreDeMotsf);
					break;
				case 'g': case 'G':
					nbreDeMotsg++;
					Container.buildPremiereLettreList("g", nbreDeMotsg);
					break;
				case 'h': case 'H':
					nbreDeMotsh++;
					Container.buildPremiereLettreList("h", nbreDeMotsh);
					break;
				case 'i': case 'I': case 'î':
					nbreDeMotsi++;
					Container.buildPremiereLettreList("i", nbreDeMotsi);
					break;
				case 'j': case 'J':
					nbreDeMotsj++;
					Container.buildPremiereLettreList("j", nbreDeMotsj);
					break;
				case 'k': case 'K':
					nbreDeMotsk++;
					Container.buildPremiereLettreList("k", nbreDeMotsk);
					break;
				case 'l': case 'L':
					nbreDeMotsl++;
					Container.buildPremiereLettreList("l", nbreDeMotsl);
					break;
				case 'm': case 'M':
					nbreDeMotsm++;
					Container.buildPremiereLettreList("m", nbreDeMotsm);
					break;
				case 'n': case 'N':
					nbreDeMotsn++;
					Container.buildPremiereLettreList("n", nbreDeMotsn);
					break;
				case 'o': case 'O': case 'ô':
					nbreDeMotso++;
					Container.buildPremiereLettreList("o", nbreDeMotso);
					break;
				case 'p': case 'P':
					nbreDeMotsp++;
					Container.buildPremiereLettreList("p", nbreDeMotsp);
					break;
				case 'q': case 'Q':
					nbreDeMotsq++;
					Container.buildPremiereLettreList("q", nbreDeMotsq);
					break;
				case 'r': case 'R':
					nbreDeMotsr++;
					Container.buildPremiereLettreList("r", nbreDeMotsr);
					break;
				case 's': case 'S':
					nbreDeMotss++;
					Container.buildPremiereLettreList("s", nbreDeMotss);
					break;
				case 't': case 'T':
					nbreDeMotst++;
					Container.buildPremiereLettreList("t", nbreDeMotst);
					break;
				case 'u': case 'U':
					nbreDeMotsu++;
					Container.buildPremiereLettreList("u", nbreDeMotsu);
					break;
				case 'v': case 'V':
					nbreDeMotsv++;
					Container.buildPremiereLettreList("v", nbreDeMotsv);
					break;
				case 'w': case 'W':
					nbreDeMotsw++;
					Container.buildPremiereLettreList("w", nbreDeMotsw);
					break;
				case 'x': case 'X':
					nbreDeMotsx++;
					Container.buildPremiereLettreList("x", nbreDeMotsx);
					break;
				case 'y': case 'Y':
					nbreDeMotsy++;
					Container.buildPremiereLettreList("y", nbreDeMotsy);
					break;
				case 'z': case 'Z':
					nbreDeMotsz++;
					Container.buildPremiereLettreList("z", nbreDeMotsz);
					break;				
				default :
					System.out.println(line.charAt(0));
					break;
				}

				//Méthode par switch pour le nombre de lettres

				switch (line.length()) {
				case 1:
					nbreDeLettres1++;
					Container.buildNbreLettresList(1, nbreDeLettres1);
					break;
				case 2:
					nbreDeLettres2++;
					Container.buildNbreLettresList(2, nbreDeLettres2);
					break;
				case 3:
					nbreDeLettres3++;
					Container.buildNbreLettresList(3, nbreDeLettres3);
					break;
				case 4:
					nbreDeLettres4++;
					Container.buildNbreLettresList(4, nbreDeLettres4);
					break;
				case 5:
					nbreDeLettres5++;
					Container.buildNbreLettresList(5, nbreDeLettres5);
					break;
				case 6:
					nbreDeLettres6++;
					Container.buildNbreLettresList(6, nbreDeLettres6);
					break;
				case 7:
					nbreDeLettres7++;
					Container.buildNbreLettresList(7, nbreDeLettres7);
					break;
				case 8:
					nbreDeLettres8++;
					Container.buildNbreLettresList(8, nbreDeLettres8);
					break;
				case 9:
					nbreDeLettres9++;
					Container.buildNbreLettresList(9, nbreDeLettres9);
					break;
				case 10:
					nbreDeLettres10++;
					Container.buildNbreLettresList(10, nbreDeLettres10);
					break;
				case 11:
					nbreDeLettres11++;
					Container.buildNbreLettresList(11, nbreDeLettres11);
					break;
				case 12:
					nbreDeLettres12++;
					Container.buildNbreLettresList(12, nbreDeLettres12);
					break;
				case 13:
					nbreDeLettres13++;
					Container.buildNbreLettresList(13, nbreDeLettres13);
					break;
				case 14:
					nbreDeLettres14++;
					Container.buildNbreLettresList(14, nbreDeLettres14);
					break;
				case 15:
					nbreDeLettres15++;
					Container.buildNbreLettresList(15, nbreDeLettres15);
					break;
				case 16:
					nbreDeLettres16++;
					Container.buildNbreLettresList(16, nbreDeLettres16);
					break;
				case 17:
					nbreDeLettres17++;
					Container.buildNbreLettresList(17, nbreDeLettres17);
					break;
				case 18:
					nbreDeLettres18++;
					Container.buildNbreLettresList(18, nbreDeLettres18);
					break;
				case 19:
					nbreDeLettres19++;
					Container.buildNbreLettresList(19, nbreDeLettres19);
					break;
				case 20:
					nbreDeLettres20++;
					Container.buildNbreLettresList(20, nbreDeLettres20);
					break;
				case 21:
					nbreDeLettres21++;
					Container.buildNbreLettresList(21, nbreDeLettres21);
					break;
				case 22:
					nbreDeLettres22++;
					Container.buildNbreLettresList(22, nbreDeLettres22);
					break;
				case 23:
					nbreDeLettres23++;
					Container.buildNbreLettresList(23, nbreDeLettres23);
					break;
				case 24:
					nbreDeLettres24++;
					Container.buildNbreLettresList(24, nbreDeLettres24);
					break;
				case 25:
					nbreDeLettres25++;
					Container.buildNbreLettresList(25, nbreDeLettres25);
					break;
				default:
					System.err.println(line.length());
					break;
				}

			}	
			if (line.endsWith("ver")) {
				Container.builEndVerList(line);
			}

		}

		System.out.println(titre);
		System.out.println("nombre de mots en : " + Container.listPremiereLettre);
		System.out.println("longueur des mots : " + Container.listNbreLettres);
		System.out.println("list recupérée " + Container.listDeMot.size());
		System.out.println("nbre mot ver" + Container.listVer.size());
		scan.close();
	}

}
