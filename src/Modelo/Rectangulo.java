package Modelo;

public class Rectangulo extends FiguraGeometrica {
	
	private int lado1;
	private int lado2;
	
	
	public Rectangulo(int lado1, int lado2) {
		super("Rectangulo");
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public double CalcularArea() {
		super.setArea(lado1*lado2);
		return area;
	
	}
	@Override
	public double CalcularPerimetro() {
		super.setPerimetro(2*lado1 +2*lado2);
		return perimetro;
	}
	

	@Override
	public void Dibujar() {
		String D = "\n\n";
		for(int i = 0; i< lado1; i++) {
			for(int j = 0; j<lado2; j++) {
				if(i==0 || j==0 || i==lado1-1 || j== lado2-1) {
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
