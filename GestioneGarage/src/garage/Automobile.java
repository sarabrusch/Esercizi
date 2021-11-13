package garage;

public class Automobile extends VeicoloAMotore {

	private int numeroPorte;
	
	public Automobile(int anno, String marca, String tipo, int cilindrata, int porte) {
		super(anno,marca,tipo,cilindrata);
		numeroPorte = porte;
	}
	
	public int getNumeroPorte() {
		return numeroPorte;
	}
	
	public void setNumeroPorte(int n) {
		numeroPorte = n;
	}
	
	public String toString() {
		String frase = "\n**AUTOMOBILE**\n"+"Anno di immatricolazione: "+Integer.toString(getAnnoImmatricolazione())+"\n"+"Marca: "+getMarca()+"\n"+"Tipo di alimentazione: "+getTipoAlimentazione()+"\n"+"Cilindrata: "+Integer.toString(getCilindrata())+" cm^3"+"\n"+"Numero di porte: "+Integer.toString(numeroPorte)+"\n";
		return frase;
	}
}
