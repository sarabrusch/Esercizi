package collezione;
import java.util.*;

public class mainCollezione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//dati necessari ad una simulazione
		Quadro q = new Quadro("notte stellata","van gogh",120,80);
		Quadro qu = new Quadro("persistenza della memoria","dali'",200,160);
		Scultura s = new Scultura("amore e psiche","non ricordo",120,60,80);
		Scultura sc = new Scultura("boh","aiuto",40,80,30);
		
		
		boolean controllo = true;
		byte scelta;
		double altezza,larghezza,profondita;
		String nomeQuadro,nomeScultura,nomeArtistaS,nomeArtistaQ,parola;
		Quadro quadro;
		Scultura scultura;
		Collezione collezione = new Collezione(null,null);
		collezione.addOpera(q);
		collezione.addOpera(qu);
		collezione.addOpera(s);
		collezione.addOpera(sc);
		
		while(controllo) {
		System.out.println(" **** COLLEZIONE D'ARTE **** ");
		System.out.println("0) Uscire ");
		System.out.println("1) Creare una collezione");
		System.out.println("2) Stampare una collezione ");
		System.out.println("3) Stampa ingombro opere ");
		System.out.println("4) Trova opera ");
		System.out.println(" Scegliere l'operazione che si vuole eseguire: ");
		scelta = input.nextByte();
		
		switch(scelta) {
		
		case 0:
			System.out.println("Arrivederci.");
		    controllo = false;
		    break;
		    
		case 1:
			System.out.println("Inserisci il nome della collezione: ");
			input.nextLine();
			String nome = input.nextLine();
			System.out.println("Inserisci il luogo dove verra' esibita: ");
			String luogo = input.nextLine();
			collezione = new Collezione(nome,luogo);
			System.out.println("Vuoi inserire un quadro o una scultura?");
			parola = input.next();
			parola = parola.toLowerCase();
			switch(parola) {
			
			case "quadro":
				System.out.println("Inserisci l'altezza: ");
				altezza = input.nextDouble();
				System.out.println("Inserisci la lunghezza: ");
				larghezza = input.nextDouble();
				System.out.println("Inserisci il nome del quadro: ");
				input.nextLine();
				nomeQuadro = input.nextLine();
				System.out.println("Inserisci il nome dell'artista: ");
				nomeArtistaQ = input.nextLine();
				quadro = new Quadro(nomeQuadro,nomeArtistaQ,altezza,larghezza);
				collezione.addOpera(quadro);
				break;
				
			case "scultura":
				System.out.println("Inserisci l'altezza: ");
				altezza = input.nextDouble();
				System.out.println("Inserisci la lunghezza: ");
				larghezza = input.nextDouble();
				System.out.println("Inserici la profondità: ");
				profondita = input.nextDouble();
				System.out.println("Inserisci il nome della scultura: ");
				input.nextLine();
				nomeScultura = input.nextLine();
				System.out.println("Inserisci il nome dell'artista: ");
				nomeArtistaS  = input.nextLine();
				scultura = new Scultura(nomeScultura,nomeArtistaS,altezza,larghezza,profondita);
				collezione.addOpera(scultura);
				break;
			}
			break;
			
		case 2:
			collezione.printCollezione();
			break;
			
		case 3:
			for(int i=0;i<collezione.opere.size();i++) {
				OperaArte opera = collezione.opere.get(i);
				System.out.println("L'ingombro di "+opera.getTitolo()+" e' "+opera.ingombro());
			 }
			break;
			
		case 4:
			System.out.println("Inserire il nome dell'opera:");
			input.nextLine();
			String nomeOpera = input.nextLine();
			collezione.findOpera(nomeOpera);
			break;
		}
		    
		if(controllo) {
		System.out.println("Vuole effettuare altre operazioni? ");
		String risposta = input.next();
		risposta = risposta.toLowerCase();
		if(risposta.equals("no")) {
			System.out.println("Arrivederci.");
			controllo = false;
		}
      }
    }
  }
}