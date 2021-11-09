package simulazioneLancio;
import java.util.Random;

public class Moneta extends OggettoLanciato {

	private Random generatore = new Random();
	private int testa = 0;
	private int croce = 1;
	
	public Moneta() {
		super(2);
	}
	
	/*public void lancioMoneta() {
		int lancio = generatore.nextInt(2);
	}*/
	
	public String convertMoneta() {
		int lancio = lancio();
		String nomeFaccia;
		if(lancio == testa)
			nomeFaccia = "testa";
		else 
			nomeFaccia = "croce";
		return nomeFaccia;
	}
}
