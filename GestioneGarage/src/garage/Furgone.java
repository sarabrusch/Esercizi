package garage;

public class Furgone extends VeicoloAMotore {

	private int capacitaCarico;
	
	public Furgone(int anno, String marca, String tipo, int cilindrata, int carico) {
		super(anno,marca,tipo,cilindrata);
		capacitaCarico = carico;
	}
	
	public int getCapacita() {
		return capacitaCarico;
	}
	
	public void setCapacita(int c) {
		capacitaCarico = c;
	}
	
	public String toString() {
		String frase = "\n**FURGONE**\n"+"Anno di immatricolazione: "+Integer.toString(getAnnoImmatricolazione())+"\n"+"Marca: "+getMarca()+"\n"+"Tipo di alimentazione: "+getTipoAlimentazione()+"\n"+"Cilindrata: "+Integer.toString(getCilindrata())+" cm^3"+"\n"+"Capacita' di carico: "+Integer.toString(capacitaCarico)+" kg\n";
		return frase;
	}
	
}
