package figure;

public class Cerchio extends Figura {

	private double raggio;
	private double perimetro;
	private double area;
	private final double pi = 3.14;
	
	public Cerchio() {
		super("cerchio");
	}
	
	public double getRaggio() {
		return raggio;
	}
	
	public void setRaggio(double r) {
		raggio = r;
	}
	
	public double calcoloPerimetro() {
		return perimetro = 2*pi*raggio;
	}
	
	public double calcoloArea() {
		return area = pi*Math.pow(raggio, 2);
	}
}
