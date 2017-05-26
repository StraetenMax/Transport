package application;

import voyage.Barque;
import voyage.Bateau;

public class Test {

	public static void main(String[] args) {
		//instancier les classes
		Bateau bat = new Bateau();
		Bateau bat1 = new Bateau(300,"Bleu","Diesel",350,30);
		Bateau bat2 = new Bateau(5000, "Blanc","Electricité", 150, 40);
		
		
		//appeler les méthodes
		System.out.println("J'aime la couleur "+bat1.getCouleur()+" de ce bateau");
		System.out.println("La vitesse de ce bateau est de "+bat1.getVitesseMax()+" km/h");
		bat2.setCouleur("Rouge");
		System.out.println("J'aime la couleur "+bat2.getCouleur()+" de ce bateau");
		bat2.setNbPassagers(20000);
		System.out.println("Ce bâteau peut prendre "+bat2.getNbPassagers()+" passagers");
	
		System.out.println(bat1.plusRapide(bat2));
		System.out.println(bat2.plusRapide(bat1));
		
		System.out.println(bat1.getNbInstances());
		System.out.println(bat1.getNbInstancesClasse());
		
		Barque bq = new Barque();
		System.out.println(bq.getNbPassagers());
		
		System.out.println(bat1.description());
		System.out.println(bat2.description());
	
		//Polymorphisme
		//Définition d'un tableau de bateau vide
		Bateau[] bt = new Bateau[4];
		
		//Définition d'un tableau
		int tabNbPassagers[] = {300, 50, 100, 25};
		String tabCouleur[] = {"Bleu","Rouge","Blanc","Gris"};
		String tabEnergie[] = {"Diesel","Electrique","Voile","Charbon"};
		int tabPuissance[] = {450, 200, 230, 130};
		int tabVitesseMax[]={24, 40, 30, 25};
		
		for(int i = 0; i<4; i++){
			if(i<3){
			Bateau bateau = new Bateau(tabNbPassagers[i],tabCouleur[i],tabEnergie[i],tabPuissance[i],tabVitesseMax[i]);
			bt[i] = bateau;
			}else{
			Barque barque = new Barque(tabNbPassagers[i], tabCouleur[i], tabEnergie[i], tabPuissance[i], tabVitesseMax[i], null);
			bt[i] = barque;
			}
		}
	
		for(Bateau cv :bt){
			System.out.println(cv.description()+"\n");
		}
	}

}
