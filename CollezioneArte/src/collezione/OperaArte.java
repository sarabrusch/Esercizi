package collezione;

public abstract class OperaArte {
	
	protected String titolo;
	protected String artista;

	public OperaArte(String titolo, String artista) {
		this.titolo = titolo;
		this.artista = artista;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public abstract String ingombro();
	
	public boolean equals(Object o1, Object o2) {
		if(o1.equals(o2))
			return true;
		else return false;
	}
	
	public void printIngombroQuadro(Quadro q) {
			System.out.println(q.ingombro());
		}
	
	public void printIngombroScultura(Scultura s) {
		System.out.println(s.ingombro());
	}
	
	
}
