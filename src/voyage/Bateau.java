package voyage;

public class Bateau {
	//propriétés
	private int nbPassagers;
	private String couleur;
	private String energie;
	private int puissance;
	private int vitesseMax;
	private String typeBateau;
	private int nbInstances;
	private static int nbInstancesClasse;
	
	//constructeurs vide et initialisé
	public Bateau(){
		nbPassagers = 0;
		couleur = "";
		energie = "";
		puissance = 0;
		vitesseMax = 0;
		this.setTypeBateau();
		nbInstances++;
		nbInstancesClasse++;
		System.out.println("Vivre le bateau");
	}
	public Bateau(int nbPassagers, String couleur,String energie,int puissance,int vitesseMax)throws NbPassagersException{
		if(nbPassagers<0){
			throw new NbPassagersException();
		}else{
		this.nbPassagers = nbPassagers;
		this.couleur = couleur;
		this.energie = energie;
		this.puissance = puissance;
		this.vitesseMax = vitesseMax;
		this.setTypeBateau();
		nbInstances++;
		nbInstancesClasse++;
		System.out.println("J'aime le bateau");}
	}
	
	
	//accesseurs et mutateurs
	public int getNbPassagers(){
		return nbPassagers;
	}
	public void setNbPassagers(int nbPassagers){
		this.nbPassagers = nbPassagers;
		this.setTypeBateau();
	}
	public String getCouleur(){
		return couleur;
	}
	public void setCouleur(String couleur){
		this.couleur= couleur;
	}
	public String getEnergie(){
		return energie;
	}
	public void setEnergie(String energie){
		this.energie = energie;
	}
	public int getPuissance(){
		return puissance;
	}
	public void setPuissance(){
		this.puissance = puissance;
	}
	public int getVitesseMax(){
		return vitesseMax;
	}
	public void setVitesseMax(int vitesseMax){
		this.vitesseMax=vitesseMax;
	}
	public String getTypeBateau(){
		return typeBateau;
	}
	public void setTypeBateau(){
		if(this.nbPassagers<20){
			this.typeBateau = "bateau de plaisance";
		}else{
			this.typeBateau = "paquebot";
		}
	}
	public int getNbInstances(){
		return nbInstances;
	}
	public static int getNbInstancesClasse(){
		return nbInstancesClasse;
	}
	
	//méthodes
	public boolean plusRapide(Bateau bt){
		boolean btn;
		if(bt.vitesseMax < this.vitesseMax){
			btn = true;
		}else{
			btn = false;
		}
		return btn;
	}
	public String description(){
		String str = "Je transporte "+this.getNbPassagers()+" passagers et je suis de couleur "+this.getCouleur()+" avec une énergie de "+this.getEnergie()+" "+this.getPuissance()+" "+this.getVitesseMax()+" "+this.getTypeBateau()+" ";
		return str;
	}

}
