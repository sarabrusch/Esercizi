package figure;

public class mainFigure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rettangolo rettangolo = new Rettangolo(5,10.20);
		Quadrato quadrato = new Quadrato(4,4);
		Triangolo triangolo = new Triangolo();
		triangolo.setAltezza(3.24);
		triangolo.setBase(1);
		triangolo.setLati(5, 4, 47);
		Cerchio cerchio = new Cerchio();
		cerchio.setRaggio(8);

		System.out.println(rettangolo.calcoloPerimetro());
		System.out.println(cerchio.calcoloArea());
	}

}
