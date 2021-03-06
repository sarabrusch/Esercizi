package Prenotazione;
import java.util.ArrayList;

public class Prenotazione {

	public static ArrayList prenotazioni = new ArrayList();
	public static ArrayList orario = new ArrayList();
	public static String nomeCliente; //nome e cognome
	public static CharSequence oraInizio;
	public static CharSequence oraFine;
	public static int contatore=0; //conta le prenotazioni

	//costruttore
	public Prenotazione(String n, CharSequence inizio, CharSequence fine) {

		String frase;
		nomeCliente=n;
		//prendo solo lettere piccole senza spazi
		nomeCliente = n.toLowerCase();
		nomeCliente = nomeCliente.replaceAll("\\s+","");

		oraInizio=inizio;
		oraFine=fine;
		contatore++;
		
		//riempio l'arraylist
		orario.add(inizio);

		frase = n+" "+inizio+" "+fine;
		//riempio l'arraylist
		prenotazioni.add(frase);
	}
}