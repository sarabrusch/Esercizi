package figure;

public class Figura {
	
	private String nomeFigura;
	private double perimetro;
	private double area;
	
	public Figura(String nome) {
		nomeFigura = nome;
	}
	
	public String getNome() {
		return nomeFigura;
	}
	
	public double calcoloPerimetro() {
		double sommaLati=0;
		return perimetro = sommaLati;
	}
	
	public double calcoloArea() {
		double prodottoLati=0;
		return area = prodottoLati;
	}
	
	public void stampaInfo() {
		System.out.println("Il perimetro e': "+calcoloPerimetro());
		System.out.println("L'area e': "+calcoloArea());
	}
}
