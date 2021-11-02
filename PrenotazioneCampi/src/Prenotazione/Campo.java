package Prenotazione;
import java.time.LocalTime;
import java.util.Scanner;
import Prenotazione.Prenotazione;
import java.util.Scanner;

public class Campo {

	Scanner input = new Scanner(System.in);
	CharSequence oraInizio;
	CharSequence oraFine;
	String nome;
	boolean risposta=true;

	//prenotare
	public boolean addPrenotazione() {

		int i=0;
		boolean controllo = true;

		System.out.println("Inserire nome e cognome: ");
		String nome = input.nextLine();

		System.out.println("Inserire ora di arrivo: ");
		oraInizio = input.nextLine();
		//scorro tutte le prenotazioni per controllare l'arrayList orario
		
		//while termina sia se entra nell'if (controllo=false) sia se finisco di scorrere la lista
		
		while(Prenotazione.contatore>i && controllo) {
			if(oraInizio.equals(Prenotazione.orario.get(i))) {
				System.out.println("Esiste già una prenotazione per questo orario");
				controllo = false;
			}
			i++;
		}

		//entro in questo while solo se l'inserimento dell'ora di inizio è andato a buon fine
		while(controllo) {
			System.out.println("Inserire ora di fine: ");
			oraFine = input.nextLine();

			//modifica in formato orario
			LocalTime time1 = LocalTime.parse(oraInizio);
			LocalTime time2 = LocalTime.parse(oraFine);

			//confronto orario
			int confronto = time1.compareTo(time2);

			switch(confronto) {
			case 1: //time1 dopo time2
				System.out.println("Errore");
				risposta = false;
				break;
			case 0: //time1 uguale a time2
				System.out.println("Errore");
				risposta = false;
				break;
			case -1: //time 1 prima di time2 (ok)
				System.out.println("La prenotazione è andata a buon fine");
				//creo oggetto prenotazione
				Prenotazione p = new Prenotazione(nome,oraInizio,oraFine);
				risposta = true;
				break;
			}
			controllo = false;
		}
		return risposta; //true solo se la prenotazione è andata a buon fine
	}

	//cancellare la prenotazione di un cliente
	public boolean removePrenotazione() {

		int i=0;
		Object utente; //non funziona con un altro tipo di variabile
		String frase;
		boolean risposta = true;
		boolean controllo = true;

		System.out.println("Inserire nome e cognome: ");
		nome = input.nextLine();

		System.out.println("Inserire ora di arrivo: ");
		oraInizio = input.nextLine();

		System.out.println("Inserire ora di fine: ");
		oraFine = input.nextLine();
		
		frase = nome+" "+oraInizio+" "+oraFine;

		//controllo presenza utente nell'arraylist prenotazioni
		while(Prenotazione.contatore>i) {
			utente = Prenotazione.prenotazioni.get(i); //restituisce la frase
			//se c'è corrispondenza a quell'indice i rimuovo la prenotazione e scalo il contatore
			if(frase.equals(utente)) {
				Prenotazione.prenotazioni.remove(i);
				Prenotazione.orario.remove(i);
				Prenotazione.contatore--;
				controllo = false;
			}
			i++;
		}
		if(controllo) {
			System.out.println("Non risulta nessuna prenotazione di questo tipo!");
			risposta = false;
		}
		else {
			System.out.println("La prenotazione è stata eliminata con successo");
		}
		return risposta;
	}



	//ottenere la lista delle prenotazioni
	public void toList() {
		int i=0;
		//se contatore=0 significa che non è stata effettuata alcuna prenotazione
		if(Prenotazione.contatore == 0) {
			System.out.println("Non risultano prenotazioni!");
		}
		else {
			while(Prenotazione.contatore>i) {
				System.out.println(Prenotazione.prenotazioni.get(i));
				i++;
			}
		}
	}
}
