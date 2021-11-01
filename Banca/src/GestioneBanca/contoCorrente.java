package GestioneBanca;
import java.util.ArrayList;

public class contoCorrente {

	gestioneUtenti utente = new gestioneUtenti();
	//dettagli per descrivere l'utente
	ArrayList conti = new ArrayList();
	ArrayList saldi = new ArrayList();
	private String nome;
	private char tipoConto; //il conto può essere family o business
	private double saldo;

	//tasso per ogni tipo di conto
	private double tassoFamily = 0.01;
	private double tassoBusiness = 0.05; 

	//costruttore conto
	public contoCorrente() {
		// TODO Auto-generated constructor stub
	}

	public void contoCorrenti(String nome, double saldoIniziale, char tipo) {

		conti.add(nome+" "+saldoIniziale+" "+tipo);
		this.nome = nome;
		saldo=saldoIniziale;
		tipoConto = tipo;

		saldi.add(saldoIniziale);
	}

	public void versa(double somma) {
		saldo+=somma;
		saldi.set(utente.id, saldo);
		System.out.println("Versati "+somma+" euro");
		System.out.println("Il saldo disponibile è :"+ (saldo+somma));
	}

	//restituisce false se non ci sono abbastanza soldi
	public boolean preleva(double somma) {
		if(saldo<somma) 
			return false;
		else {
			saldo=saldo-somma;
			saldi.set(utente.id, saldo);
			System.out.println("Prelevati "+saldo+" euro");
			System.out.println("Il saldo disponibile è :"+ (saldo-somma));
			return true;
		}
	}

	//calcolo interessi
	public void interessi() {
		double soldi;
		soldi = saldo;
		switch(tipoConto) {
		case 'F':
			soldi+=soldi*tassoFamily;
			System.out.println("Gli interessi sul suo conto di tipo family sono: "+soldi+" euro");
			break;
		case 'B':
			soldi+=soldi*tassoBusiness;
			System.out.println("Gli interessi sul suo conto di tipo business sono: "+soldi+" euro");
			break;
		}

	}

	//restituisce il saldo
	public double getSaldo() {
		return saldo;
	}

	//restituisce nome e id utente
	public String getUtente() {
		return this.nome;
	}

}

