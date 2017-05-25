package application;

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
	
	}

}
