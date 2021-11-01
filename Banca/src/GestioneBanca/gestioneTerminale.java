package GestioneBanca;
import java.util.*; //importa tutte le java util

public class gestioneTerminale {

	gestioneUtenti utente = new gestioneUtenti();
	contoCorrente conto = new contoCorrente();

	Scanner input = new Scanner(System.in);
	private static String nomeUtente;

	/////////metodi\\\\\\\\

	public void stampaMenuIniziale() {

		boolean controllo = true;
		gestioneUtenti utente = new gestioneUtenti();

		System.out.println("***** BENVENUTO UTENTE *****");
		Scanner input = new Scanner(System.in);

		while (controllo) {
			System.out.println("\n***** SELEZIONA OPERAZIONE *****");
			System.out.println(" 0) ESCI");
			System.out.println(" 1) LOG-IN");
			System.out.println(" 2) SIGN-IN");
			System.out.print("\n Inserire numero operazione scelta: ");
			byte operazione = input.nextByte();
			switch(operazione) {
			case 0:
				System.out.println("\n Arrivederci e grazie per averci scelto!");
				controllo = false;
				break;
			case 1: 
				if(loginUtente()) {
					System.out.println("Benvenuto "+utente.getNomeUtente()+"!");
					stampaMenu();
				}
				else {
					System.out.println("Password o nome utente errati!");
				}
				controllo = false;
				break;
			case 2: 
				if(signInUtente()) {
					System.out.println("Utente registrato con successo!");
					stampaMenu();
				}
				controllo=false;
				break;
			}
		}
	}



	public void stampaMenu() {

		boolean avanti = true;

		while (avanti) {
			System.out.println("\n***** SELEZIONA OPERAZIONE *****");
			System.out.println(" 0) ESCI");
			System.out.println(" 1) PRELEVA");
			System.out.println(" 2) VERSA ");
			System.out.println(" 3) CALCOLO INTERESSI");
			System.out.println(" 4) CAMBIA PASSWORD");
			System.out.println(" 5) STAMPA SALDO");
			System.out.println(" 6) LOG-OUT");
			System.out.print("\n Inserire numero operazione scelta: ");
			byte scelta = input.nextByte();
			switch(scelta) {
			case 0: 
				System.out.println("\n Arrivederci e grazie per averci scelto"); 
				avanti=false;
				break;
			case 1: 
				System.out.println("Inserire somma da prelevare: ");
				double prelevato = input.nextLong();
				if(conto.preleva(prelevato))
					System.out.println("Operazione effettuata con successo");
				else System.out.println("Spiacenti, saldo insufficiente!");
				break;
			case 2: 
				System.out.println("Inserire somma da versare: ");
				double versato = input.nextDouble();
				conto.versa(versato);
				break;
			case 3:
				conto.interessi();
				break;
			case 4:
				boolean controllo = true;
				do {
					System.out.println("Inserire la vecchia password: ");
					String oldPassword = input.next();
					System.out.println("Inserire la nuova password: ");
					String newPassword = input.next();
					if(oldPassword.equals(newPassword)) {
						System.out.println("La sua nuova password non può coincidere con la vecchia!");
					}
					else {
						utente.changePassword(oldPassword,newPassword);
						System.out.println("La password è stata modificata con successo!");
						controllo = false;
					} 
				}
				while(controllo);
				break;
			case 5:
				System.out.println("In questo conto sono presenti: "+conto.getSaldo()+" euro");
				break;
			case 6:
				stampaMenuIniziale();
				break;

			}
		}
	}


	//registrazione utente
	public boolean signInUtente() {

		System.out.println("Inserire username: ");
		String nome = input.nextLine();
		nome = nome.toLowerCase();
		nomeUtente = nome;

		System.out.println("Inserire password: ");
		String password = input.nextLine();

		utente.gestioneUtente(nome, password);

		System.out.println("Desidera aprire un conto family o business?");
		String tipo = input.next();
		tipo = tipo.toLowerCase();

		System.out.println("Il suo id conto è: "+utente.contatore);

		System.out.println("Inserire saldo iniziale del conto: ");
		double saldo = input.nextDouble();

		char iniziale;

		switch(tipo) {
		case "family":
			iniziale = 'F';
			conto.contoCorrenti(nome,saldo,iniziale);
			break;
		case "business":
			iniziale = 'B';
			conto.contoCorrenti(nome,saldo,iniziale);
			break;
		}
		utente.id(utente.contatore);

		return true;
	}

	public boolean loginUtente() {

		System.out.println("**** ACCESSO UTENTE ****");
		System.out.println("Inserire username: ");
		String nome = input.next();
		System.out.println("Inserire password: ");
		String password = input.next();
		System.out.println("Inserire id conto: ");
		int id = input.nextInt();
		utente.id(id);
		return (utente.checkProfilo(nome,password));

	}
}
