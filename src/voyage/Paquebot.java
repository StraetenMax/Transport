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
		
}
