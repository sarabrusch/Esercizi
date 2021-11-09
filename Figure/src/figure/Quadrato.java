package figure;

public class Quadrato extends Rettangolo {
	
	private double lato;
    private double area;
    private double perimetro;
	
	public Quadrato(double lato1, double lato2) {
		super(lato1,lato2);
		lato1 = lato2;
		lato = lato1;
	}
	
	public double getLato() {
		return lato;
	}
	
	public void setLato(double l) {
		lato = l;
	}
	
	public double calcoloPerimetro() {
		return perimetro = 4*lato;
	}
	
	public double calcoloArea() {
		return area = Math.pow(lato, 2);
	}
}
