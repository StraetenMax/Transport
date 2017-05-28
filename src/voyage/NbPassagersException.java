package voyage;

public class NbPassagersException extends Exception{
	public NbPassagersException(){
		System.out.println("Instanciation de Bateau avec nbPassagers negatif");
	}
	public NbPassagersException(int nbPassagers){
		System.out.println("Instanciation de Bateau avec nbPassagers negatif"+nbPassagers);
	}
}
