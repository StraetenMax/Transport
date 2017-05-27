package voyage;

public class NavireMoteur extends Navire {
	//constructeurs vide et initialisé
	public NavireMoteur(){
		super();
	}
	
	public NavireMoteur(String forme, int nbDePlaces){
		super(forme, nbDePlaces);
	}
	
	//méthodes
	public void avancer(){
		System.out.println("J'avance à moteur");
	}
	public void seGarer(){
		System.out.println("Je me gare dans un port");
	}
}
