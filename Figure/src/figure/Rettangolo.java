package figure;

public class Rettangolo extends Figura {

	private double base;
	private double altezza;
	private double perimetro;
	private double area;
	
	public Rettangolo(double b, double a) {
		super("rettangolo");
		base = b;
		altezza = a;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double b) {
		base = b;
	}
	
	public double getAltezza() {
		return altezza;
	}
	
	public void setAltezza(double a) {
		altezza = a;
	}
	
	public double calcoloPerimetro() {
	    return perimetro = (base + altezza)*2;
	}
	
	public double calcoloArea() {
		return area = base*altezza;
	}
}
