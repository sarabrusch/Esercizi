package garage;

public class Motocicletta extends VeicoloAMotore {

	public String tipologia;
	public int numeroTempiMotore;
	
	public Motocicletta(int anno, String marca, String tipo, int cilindrata, String tipologia, int tempi) {
		super(anno,marca,tipo,cilindrata);
		this.tipologia = tipologia;
		numeroTempiMotore = tempi;
	}
	
	public String getTipologia() {
		return tipologia;
	}
	
	public void setTipologia(String tipologia) {
		 this.tipologia = tipologia;
	}

	public int getTempiMotore() {
		 return numeroTempiMotore;
	 }
	 
	public void setTempiMotore(int tempi) {
		 numeroTempiMotore = tempi;
	 }
	
	public String toString() {
		String frase = "\n**MOTOCICLETTA**\n"+"Anno di immatricolazione: "+Integer.toString(getAnnoImmatricolazione())+"\n"+"Marca: "+getMarca()+"\n"+"Tipo di alimentazione: "+getTipoAlimentazione()+"\n"+"Cilindrata: "+Integer.toString(getCilindrata())+" cm^3"+"\n"+"Numero di tempi del motore: "+Integer.toString(numeroTempiMotore)+"\n"+"Tipologia: "+tipologia+"\n";
		return frase;
	}
	
	
}
