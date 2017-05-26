package voyage;

public class NavireVoile extends Navire{
	//propriétés
	protected int rayonAction;
	protected boolean longCourrier;
	
	//constructeur vide et initialisé
	public NavireVoile(){
		super();
		rayonAction = 0;
		longCourrier = true;
	}
	public NavireVoile(String forme, int nbDePlaces, int rayonAction, boolean longCourrier){
		super(forme, nbDePlaces);
		this.rayonAction = rayonAction;
		this.longCourrier= longCourrier;
	}

}
