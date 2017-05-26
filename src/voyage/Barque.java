package voyage;

public class Barque extends Bateau{
	//propriétés
	protected String typeDeplacement;
	
	//constructeurs vide et initialisé
	public Barque(){
		super();
		typeDeplacement ="";
	}
	public Barque(int nbPassagers, String couleur, String energie, int puissance, int vitesseMax, String typeDeplacement){
		super(nbPassagers, couleur, energie, puissance, vitesseMax);
		this.typeDeplacement= typeDeplacement;
	}
	
	//accesseurs et mutateurs
	public String getTypeDeplacement(){
		return typeDeplacement;
	}
	public void setTypeDeplacement(String typeDeplacement){
		this.typeDeplacement=typeDeplacement;
		
	}
}
