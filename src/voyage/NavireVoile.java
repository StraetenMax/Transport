package voyage;

public class NavireVoile extends Navire{
	//propriétés
	protected int rayonAction;
	protected boolean longCourrier;
	
	//constructeur vide et initialisé
	public NavireVoile(){
		super();
		rayonAction = 0;
		this.setLongCourrier();
	}
	public NavireVoile(String forme, int nbDePlaces, int rayonAction){
		super(forme, nbDePlaces);
		this.rayonAction = rayonAction;
		this.setLongCourrier();
	}
	//accesseurs et mutateurs
	public int getRayonAction(){
		return rayonAction;
	}
	public void setRayonAction(int rayonAction){
		this.rayonAction= rayonAction;
		this.setLongCourrier();
	}
	public boolean getLongCourrier(){
		return longCourrier;
	}
	public void setLongCourrier(){
		if(this.getRayonAction()>5){
			longCourrier = true;
		}else{
			longCourrier = false;
		}
	}
	
	//méthodes
	public void avancer(){
		System.out.println("j'avance à voile");
	}
	public void seGarer(){
		System.out.println("Je me gare au port");

	}


}
