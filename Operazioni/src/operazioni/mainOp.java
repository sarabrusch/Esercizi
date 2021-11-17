package operazioni;
import java.util.*;

public class mainOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		double primo, secondo, res;
		boolean controllo = true;
		Addizione add = new Addizione();
		Sottrazione sub = new Sottrazione();
		Moltiplicazione mul = new Moltiplicazione();
		Divisione div = new Divisione();

		do {
			System.out.println(" \\\\\\ BENVENUTO IN CALCOLATRICE ONLINE ///");
			System.out.println("Quale operazione aritmetica vuole eseguire?");
			System.out.println("0) Esci ");
			System.out.println("1) Addizione ");
			System.out.println("2) Sottrazione ");
			System.out.println("3) Moltiplicazione ");
			System.out.println("4) Divisione ");
			byte scelta = input.nextByte();
			switch(scelta) {

			case 0:
				System.out.println("Arrivederci e grazie per averci scelto!");
				controllo = false;
				break;
			case 1:
				System.out.println("Inserire il primo numero: ");
				primo = input.nextDouble();
				System.out.println("Inserire il secondo numero: ");
				secondo = input.nextDouble();
				res = add.result(primo, secondo);
				add.stampa(res);
				break;
			case 2:
				System.out.println("Inserire il primo numero: ");
				primo = input.nextDouble();
				System.out.println("Inserire il secondo numero: ");
				secondo = input.nextDouble();
				res = sub.result(primo, secondo);
				sub.stampa(res);
				break;
			case 3:
				System.out.println("Inserire il primo numero: ");
				primo = input.nextDouble();
				System.out.println("Inserire il secondo numero: ");
				secondo = input.nextDouble();
				res = mul.result(primo, secondo);
				mul.stampa(res);
				break;
			case 4:
				System.out.println("Inserire il primo numero: ");
				primo = input.nextDouble();
				System.out.println("Inserire il secondo numero: ");
				secondo = input.nextDouble();
				res = div.result(primo, secondo);
				div.stampa(res);
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
