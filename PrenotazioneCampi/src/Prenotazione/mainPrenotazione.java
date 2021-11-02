package Prenotazione;
import java.util.Scanner;

public class mainPrenotazione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("**** BENVENUTO ****");

		//istanza campo
		Campo campo = new Campo();
		
		String risposta;
		boolean controllo = false;
		boolean risp;
		boolean arrivederci = true;

		//operazioni 
		//do while perché stampo almeno solo una volta
		do {
			System.out.println("\n***** SELEZIONA OPERAZIONE *****");
			System.out.println("0) Esci");
			System.out.println("1) Prenota");
			System.out.println("2) Cancella Prenotazione");
			System.out.println("3) Mostra lista prenotazioni");
			System.out.println("\n Inserire il numero dell'operazione da eseguire: ");
			byte scelta = input.nextByte();
			switch(scelta) {
			case 0:
				System.out.println("\n Arrivederci!");
				arrivederci = false; //non entro nell'if per chiedere altre prenotazioni
				break;
			case 1:
				risp = campo.addPrenotazione(); //dà il return di addPrenotazione
				if(risp==false)
					System.out.println("Errore, riprovare");
				break;
			case 2: 
				risp = campo.removePrenotazione();
				if(risp==false)
					System.out.println("Errore, riprovare");
				break;
			case 3:
				campo.toList();
				break;
			}
			//chiedo se vogliono essere effettuate altre prenotazioni dopo averne finita una (che non sia esci)
			if(arrivederci) {
				System.out.println("Vuole effettuare altre operazioni?");
				System.out.println("Inserire 'SI', 'NO': ");
				risposta = input.next();
				//valuto tutti i casi di risposta
				switch(risposta) {
				case "Si","SI","si","sì","Sì":
					controllo = true;
				break;
				case "NO","No","no":
					System.out.println("Arrivederci!");
				controllo = false;
				break;
				}
			}
		}
		while(controllo);

	}

}
