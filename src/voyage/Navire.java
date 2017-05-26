package voyage;

public abstract class Navire {
	//propriétés
	protected String forme;
	protected int nbDePlaces;
	
	//constructeur vide et initialisé
	public Navire(){
		forme = "";
		nbDePlaces = 0;
	}
	public Navire(String forme, int nbDePlaces){
		this.forme = forme;
		this.nbDePlaces = nbDePlaces;
	}
	
	//accesseurs et mutateurs
	public String getForme(){
		return forme;
	}
	public void setForme(String forme){
		this.forme = forme;
	}
	public int getNbDePlaces(){
		return nbDePlaces;
	}
	public void setNbDePlaces(int nbDeplaces){
		this.nbDePlaces=nbDePlaces;
	}
	
	//méthodes
	protected void demarrer(){
		System.out.println("Je démarre");
	}
	protected void arrêter(){
		System.out.println("Je m'arrête");
	}
	abstract void avancer();
	abstract void seGarer();
	
	public String description(){
		String str = "Je suis un objet de la "+this.getClass()+", je suis "+this.forme+", je contiens "+this.nbDePlaces+" de places";
		return str;
	}
}
