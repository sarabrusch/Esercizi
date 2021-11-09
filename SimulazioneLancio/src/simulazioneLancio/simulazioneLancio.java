package simulazioneLancio;
import java.util.Scanner;

public class simulazioneLancio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int facce;
		Moneta moneta = new Moneta();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vuole lanciare un dado o una moneta?");
		String scelta = input.next();
		
		switch(scelta) {
		case "dado","Dado","DADO","d","D":
			System.out.println("Da quante facce deve essere il dado?");
		    facce = input.nextInt();
		    Dado dado = new Dado(facce);
		    System.out.println("Quanti lanci vuole eseguire?");
		    int lanci = input.nextInt();
		    System.out.println("I numeri usciti dai "+lanci+" del dado sono: ");
		    for(int i=0;i<lanci;i++) {
		    	System.out.println(dado.lancioDado());
		    }
		    
		case "moneta","Moneta","MONETA","M","m":
			System.out.println("Quanti lanci vuole eseguire?");
		    int n = input.nextInt();
		    System.out.println("Le facce uscite dai "+n+" lanci della moneta sono: ");
		    for(int i=0;i<n;i++) {
			System.out.println(moneta.lancioMoneta());
		    }
		}

	}

}
