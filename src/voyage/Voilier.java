package voyage;

public class Voilier extends NavireVoile{
	//propriétés
	private String fabricants;
	
	//constructeurs vide et initialisé
	public Voilier(){
		super();
		fabricants ="";
	}
	public Voilier(String forme, int nbDePlaces, int rayonAction,String fabricants){
		super(forme, nbDePlaces, rayonAction);
		this.fabricants =fabricants;
	}
	
	//accesseurs et mutateurs
}
