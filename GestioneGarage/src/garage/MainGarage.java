package garage;
import java.util.Scanner;

public class MainGarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//veicoli necessari ad una simulazione del programma
		VeicoloAMotore furgonee = new Furgone(2010,"suzuki","diesel",1500,800);
		VeicoloAMotore auto = new Automobile(2017,"citroen","benzina",1200,5);
		VeicoloAMotore motocicletta = new Motocicletta(2020,"aprilia","benzina",150,"scooter",4);

		Scanner input = new Scanner(System.in);
		Garage garage = new Garage();
		//per simulazione:
		garage.immettiVeicolo(furgonee);
		garage.immettiVeicolo(auto);
		garage.immettiVeicolo(motocicletta);
		
		int annoImm;
		String marca;
		String tipoAlim;
		int cilindrata;
		int porte;
		String tipologia;
		int tempi;
		int capacita;
		int posto;
		byte scelta;
		boolean controllo = true;

		do {
			System.out.println(" **** MENU' DI GESTIONE DEL GARAGE **** ");
			System.out.println("0) Uscire ");
			System.out.println("1) Inserire un'automobile ");
			System.out.println("2) Inserire una moto ");
			System.out.println("3) Inserire un furgone ");
			System.out.println("4) Liberare un posto ");
			System.out.println("5) Situazione corrente garage ");
			System.out.println(" Scegliere l'operazione che si vuole eseguire: ");
			scelta = input.nextByte();

			switch(scelta) {

			case 0:
				System.out.println("Arrivederci.");
				break;
			case 1:
				System.out.println("Inserire le informazioni riguardo l'automobile: ");
				System.out.println("Anno di immatricolazione: ");
				annoImm = input.nextInt();
				System.out.println("Marca: ");
				marca = input.next();
				System.out.println("Tipo di alimentazione: ");
				tipoAlim = input.next();
				System.out.println("Cilindrata: ");
				cilindrata = input.nextInt();
				System.out.println("Numero porte: ");
				porte = input.nextInt();
				VeicoloAMotore automobile = new Automobile(annoImm, marca, tipoAlim, cilindrata, porte);
				garage.immettiVeicolo(automobile);
				break;
			case 2:
				System.out.println("Inserire le informazioni riguardo la moto: ");
				System.out.println("Anno di immatricolazione: ");
				annoImm = input.nextInt();
				System.out.println("Marca: ");
				marca = input.next();
				System.out.println("Tipo di alimentazione: ");
				tipoAlim = input.next();
				System.out.println("Cilindrata: ");
				cilindrata = input.nextInt();
				System.out.println("Numero di tempi del motore: ");
				tempi = input.nextInt();
				System.out.println("Tipologia: ");
				tipologia = input.next();
				VeicoloAMotore moto = new Motocicletta(annoImm, marca, tipoAlim, cilindrata, tipologia, tempi);
				garage.immettiVeicolo(moto);
				break;
			case 3:
				System.out.println("Inserire le informazioni riguardo il furgone: ");
				System.out.println("Anno di immatricolazione: ");
				annoImm = input.nextInt();
				System.out.println("Marca: ");
				marca = input.next();
				System.out.println("Tipo di alimentazione: ");
				tipoAlim = input.next();
				System.out.println("Cilindrata: ");
				cilindrata = input.nextInt();
				System.out.println("Capacita' di carico: ");
				capacita = input.nextInt();
				VeicoloAMotore furgone = new Furgone(annoImm, marca, tipoAlim, cilindrata, capacita);
				garage.immettiVeicolo(furgone);
				break;
			case 4:
				System.out.println("Quale posto si deve liberare?");
				posto = input.nextInt();
				if(posto>15) {
					controllo = false;
					break;
				}
				else if(garage.postiOccupati.get(posto) == null) {
					System.out.println("Posto gia' libero.");
				}
				else {
					garage.estraiVeicolo(posto);
					System.out.println("Veicolo rimosso con successo dalla posizione numero "+posto);
				}
				break;
			case 5:
				garage.stampaSituazione();
				break;
			}

			System.out.println("Vuole effettuare altre operazioni?");
			switch(input.next()) {
			case "no","No","NO": 
				System.out.println("Arrivederci.");
				controllo = false;
			break;
			}
		}
		while(controllo);
		
	}
}


