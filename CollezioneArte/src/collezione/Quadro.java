package collezione;

public class Quadro extends OperaArte {
	
	private double altezza;
	private double larghezza;
	
	public Quadro(String nome, String artista, double altezza, double larghezza) {
		super(nome,artista);
		this.altezza = altezza;
		this.larghezza = larghezza;
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

	@Override
	public String ingombro() {
		return altezza+" x "+larghezza;
	}

    public String toString() {
    	String frase = "\nNome quadro: "+getTitolo()+"\nNome artista: "+getArtista()+"\nAltezza: "+altezza+"\nLarghezza: "+larghezza;
    	return frase;
    }
	
}
