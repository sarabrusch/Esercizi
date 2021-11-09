package simulazioneLancio;
import java.util.Random;

public class Dado extends OggettoLanciato {

	private int facceDado;
	private Random generatore = new Random();
	
	public Dado(int f) {
		super(f);
		facceDado = f;
	}
}
