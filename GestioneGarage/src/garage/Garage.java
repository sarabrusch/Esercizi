package garage;
import java.util.*;

public class Garage {

	private int postiDisponibili; //max 15
	private final int numeroMaxPosti = 16;
	public int contatore = 0;
	public ArrayList<VeicoloAMotore> postiOccupati = new ArrayList<VeicoloAMotore>();
	VeicoloAMotore veicolo = new VeicoloAMotore(0,null,null,0);

	public Garage() {
		postiDisponibili = numeroMaxPosti;
		postiOccupati = new ArrayList<VeicoloAMotore>(postiDisponibili);
		for(int i=0;i<postiDisponibili;i++) {
			postiOccupati.add(null);
		}
	}

	public int getPosti() {
		return numeroMaxPosti;
	}

	//aggiungo un veicolo nel primo posto libero disponibile del garage
	public int immettiVeicolo(VeicoloAMotore veicolo) {
		int i=0;
		int indice;
		while(i<postiDisponibili && postiOccupati.get(i)!=null)
			i++;
		if(i==postiDisponibili)
			indice=-1;
		postiOccupati.set(i,veicolo);
		indice=i;
		return indice;
	}


	public VeicoloAMotore estraiVeicolo(int posto) {
		VeicoloAMotore veicolo;
		if(posto>=0 && posto<postiDisponibili) {
			veicolo = postiOccupati.get(posto);
			postiOccupati.set(posto,null);
			return veicolo;
		}
		return null;
	}

	public void stampaSituazione() {
		for(int i=0;i<postiDisponibili;i++) {
			if(postiOccupati.get(i) == null) {
				System.out.println("Posto numero "+i+" libero.");
			}
			else {
				System.out.println("Posto numero "+i+" occupato da: \n"+postiOccupati.get(i));
			}

		}
	}
}





