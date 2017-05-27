package voyage;

public class Zodiac extends NavireMoteur {
	//propriétés
	private String marque;
	
	//constructeurs vide et initialisé
	public Zodiac(){
		super();
		marque ="";
	}
	public Zodiac(String forme, int nbDePlaces, String marque){
		super(forme, nbDePlaces);
		this.marque = marque;
	}
	
	// accesseurs et mutateurs
	public String getMarque(){
		return marque;
	}
	public void setMarque(String marque){
		this.marque = marque;
	}	
	
	//méthodes
	public void avancer(){
		System.out.println("J'avance en Zodiac");
	}
	public void seGarer(){
		System.out.println("Je me gare sur la plage");
	}
	
	}
	


