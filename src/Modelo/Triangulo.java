package Modelo;

public class Triangulo extends FiguraGeometrica {
	
	private int lado1;
	private int lado2;
	
	
	public Triangulo(int lado1, int lado2) {
		super("Triangulo");
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public double CalcularArea() {
		super.setArea((lado1*lado2)/2);
		return area;
	}

	
	@Override
	public double CalcularPerimetro() {
		super.setPerimetro(lado1 + lado2+ Math.sqrt((lado1*lado1)+(lado2*lado2)));
		return perimetro;
	}

	@Override
	public void Dibujar() {
		String D = "\n\n";
		for(int i = 0; i< lado1; i++) {
			for(int j = 0; j<lado2; j++) {
				if(i==lado1-1 || i==lado1-1-j || j== lado2-1) {
					D = D + "*";
				}else{
					D = D + " ";
				}
			}
			D = D + "\n";
		}
		super.setFigura(D);
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	
}
