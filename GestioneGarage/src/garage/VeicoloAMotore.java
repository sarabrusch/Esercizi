package garage;

public class VeicoloAMotore {
	
	private int annoImmatricolazione;
	private String marca;
	private String tipoAlimentazione;
	private int cilindrata;
	
	public VeicoloAMotore(int a, String m, String tipo, int c) {
		annoImmatricolazione = a;
		marca = m;
		tipoAlimentazione = tipo;
		cilindrata = c;
	}
	
	public int getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}
	
	public void setAnnoImmatricolazione(int a) {
		annoImmatricolazione = a;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String m) {
		marca = m;
	}
	
	public String getTipoAlimentazione() {
		return tipoAlimentazione;
	}
	
	public void setTipoAlimentazione(String tipo) {
		tipoAlimentazione = tipo;
	}
	
	public int getCilindrata() {
		return cilindrata;
	}
	
	public void setCilindrata(int c) {
		cilindrata = c;
	}

}
