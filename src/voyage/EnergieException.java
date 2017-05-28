package voyage;

public class EnergieException extends Exception {
    public EnergieException(){
    	System.out.println("Instanciation de Bateau avec energie inconnue");
    }
    
    public EnergieException(String energie){
    	System.out.println("Instanciation de Bateau avec energie inconnue: "+energie);
    }
	
	
}
