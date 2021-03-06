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
	public String getFabricants(){
		return fabricants;
	}
	public void setFabricants(String fabricants){
		this.fabricants=fabricants;
	}
	//méthodes
	public void avancer(){
		System.out.println("J'avance en voilier");
	}
	public void seGarer(){
		System.out.println("Je me range sur la plage");
	}
}
