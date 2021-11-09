package simulazioneLancio;
import java.util.Random;

public class OggettoLanciato {

	private int risultatoLancio;
	private int facce;
	private Random generatore = new Random();
	
	public OggettoLanciato(int facce) {
		this.facce = facce;
		//risultatoLancio = 1 + generatore.nextInt(facce);
	}
	
	public int getRisultatoLancio() {
		return risultatoLancio;
	}
	
	public int lancio() {
		if(facce==2) {
			return risultatoLancio = generatore.nextInt(facce);
		} else {
		return risultatoLancio = 1 + generatore.nextInt(facce);
	}
	}
	
	public void stampaRisultato() {
		System.out.println(risultatoLancio);
	}
}
