package voyage;

public class Goelette extends NavireVoile {
	//propriétés
	private boolean canon;
	
	//constructeurs vide et initialisé
	public Goelette(){
		super();
		canon = true;	
	}
	public Goelette(String forme, int nbDePlaces, int rayonAction,boolean canon){
		super(forme, nbDePlaces, rayonAction);
		this.canon = canon;
	}
	
	//accesseurs et mutateurs
	public boolean getCanon(){
		return canon;
	}
	public void setCanon(boolean canon){
		this.canon =canon;
	}
	
	//méthodes
	public void avancer(){
		System.out.println("J'avance en goelette");
	}
	public void seGarer(){
		System.out.println("Je me gare au port");
	}
	
}
