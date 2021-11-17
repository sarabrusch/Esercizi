package collezione;
import java.util.*;

public class Collezione {
	
	private String nomeCollezione;
	private String luogo;
	public ArrayList<OperaArte> opere = new ArrayList<OperaArte>();
	
	public Collezione(String nome, String l) {
		nomeCollezione = nome;
		luogo = l;
	}

	public String getNomeCollezione() {
		return nomeCollezione;
	}

	public void setNomeCollezione(String nomeCollezione) {
		this.nomeCollezione = nomeCollezione;
	}

	public String getLuogo() {
		return luogo;
	}

	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}

	public void addOpera(OperaArte opera) {
		opere.add(opera);
	}
	
	public void findOpera(String titolo) {
		boolean controllo = true;
		OperaArte opera;
		int i=0;
		for(i=0;i<opere.size();i++) {
			opera = opere.get(i);
			if(titolo.equals(opera.getTitolo())) {
				System.out.println("Quest'opera e' presente nella collezione "+nomeCollezione);
				System.out.println("Artista: "+opera.getArtista()+"\nIngombro: "+opera.ingombro());
				controllo = false;
			}
		}
		if(controllo) {
			System.out.println("Quest'opera non e' presente nella collezione, riprovare.");
		}
	}
	
	public void printCollezione() {
		System.out.println("Collezione: "+nomeCollezione+" esposta a: "+luogo);
		for(int i=0;i<opere.size();i++) {
			System.out.println(opere.get(i));
		}
	}
}
	

