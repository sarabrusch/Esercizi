package figure;

public class Triangolo extends Figura {
	
	private double base;
	private double altezza;
	private double lato1, lato2, lato3;
	private double perimetro;
	private double area;
	
	public Triangolo() {
		super("triangolo");
	}
	
	public String getLati() {
		String frase = lato1+" "+lato2+" "+lato3;
		return frase;
	}
	
	public void setLati(double lato1, double lato2, double lato3) {
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
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
		return perimetro = lato1+lato2+lato3;
	}
	
	public double calcoloArea() {
		return area = (base*altezza)/2;
	}

}
