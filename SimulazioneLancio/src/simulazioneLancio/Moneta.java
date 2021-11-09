package simulazioneLancio;
import java.util.Random;

public class Moneta {
	
	private Random generatore = new Random();
	private final int testa=0;
	private final int croce=1;
	private int faccia;
	
	//costruttore
	public Moneta() {
		
	}

    //lancio casuale di una moneta e converto il risultato in stringa
	public String lancioMoneta() {
		faccia = generatore.nextInt(2);
		String nomeFaccia;
		if(faccia == testa)
			nomeFaccia = "testa";
		else 
			nomeFaccia = "croce";
		return nomeFaccia;
	}
}
