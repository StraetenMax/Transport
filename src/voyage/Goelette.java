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
	
}
