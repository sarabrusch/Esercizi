package GestioneBanca;
import java.util.ArrayList;

public class gestioneUtenti {

	public static ArrayList utenti = new ArrayList();
	public static ArrayList passwords = new ArrayList();

	private String nomeUtente;
	private String password;
	public static int contatore = -1;
	public static int id;

	//uso costruttore di default
	public gestioneUtenti() {
		// TODO Auto-generated constructor stub
	}

	public void gestioneUtente(String nomeUtente, String password) {

		utenti.add(nomeUtente);
		passwords.add(password);
		this.nomeUtente = nomeUtente;
		this.password = password;
		contatore++;

	} 

	public void id(int x) {
		id = x;
	}

	//getter e setter degli attributi
	public String getNomeUtente() {
		return nomeUtente;
	}

	public String getPassword() {
		return password;
	}

	//metodi della classe

	//controlla se nome utente e password corrispondono
	public boolean checkProfilo(String nome, String password) {

		boolean risultato = false;

		for(int i=0; i<utenti.size(); i++) {
			if(nome.equals(utenti.get(i)) && password.equals(passwords.get(i))) {
				risultato = true;
			}
		}
		return risultato;
	}

	//permette di cambiare la password verificando che le due non coincidano
	public boolean changePassword(String oldPassword, String newPassword) {
		int i=0;
		boolean risultato = true;
		if(oldPassword.equals(newPassword)) {
			risultato = false;
			return risultato;
		}
		passwords.set(id, newPassword);
		return risultato;
	}
}

