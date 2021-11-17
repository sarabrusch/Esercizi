package collezione;

public class Scultura extends OperaArte {

	private double altezza;
	private double larghezza;
	private double profondita;
	
	public Scultura(String nome, String artista, double altezza, double larghezza, double profondita) {
		super(nome,artista);
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.profondita = profondita;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}

	public double getProfondita() {
		return profondita;
	}

	public void setProfondita(double profondita) {
		this.profondita = profondita;
	}
	
	@Override
	public String ingombro() {
		return altezza+" x "+larghezza+" x "+profondita;
	}
	
	public String toString() {
    	String frase = "\nNome quadro: "+getTitolo()+"\nNome artista: "+getArtista()+"\nAltezza: "+altezza+"\nLarghezza: "+larghezza+"\nProfondita': "+profondita;
    	return frase;
    }
}
