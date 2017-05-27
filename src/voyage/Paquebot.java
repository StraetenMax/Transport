package voyage;

public class Paquebot extends NavireMoteur{
		//propriétés
		private int nbHublots;
		
		//constructeurs vide et initialisé
		public Paquebot(){
			super();
			nbHublots = 0;			
		}
		public Paquebot(String forme, int nbDePlaces, int nbHublots){
			super(forme, nbDePlaces);
			this.nbHublots = nbHublots;
		}
		
		//accesseurs et mutateurs
		public int getNbHublots(){
			return nbHublots;
		}
		public void setNbHublots(int nbHublots){
			this.nbHublots=nbHublots;
		}
		
		//méthodes
		public void avancer(){
			System.out.println("J'avance en paquebot");
		}
		public void seGarer(){
			System.out.println("Je me gare au port");
		}
}
