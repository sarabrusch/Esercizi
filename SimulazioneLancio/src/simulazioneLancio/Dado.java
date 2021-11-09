package simulazioneLancio;
import java.util.Random;

public class Dado {
	
	private int numeroFacce;
	private Random generatore = new Random();
	
	//costruttore dado
	public Dado(int n) {
		numeroFacce = n;
	}
	
	//simulatore lancio del dado
	public int lancioDado() {
		return 1 + generatore.nextInt(numeroFacce);
	}
}
