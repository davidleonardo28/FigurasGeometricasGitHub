package Modelo;

public class Cuadrado extends FiguraGeometrica {
	
	private int lado;
	
	
	public Cuadrado(int lado) {
		super("Cuadrado");
		this.lado = lado;
	}

	@Override
	public double CalcularArea() {
		super.setArea(lado*lado);
		return area;
	}

	
	@Override
	public double CalcularPerimetro() {
		super.setPerimetro(4*lado);
		return perimetro;
	}

	@Override
	public void Dibujar() {
		String D = "\n\n";
		for(int i = 0; i< lado; i++) {
			for(int j = 0; j<lado; j++) {
				if(i==0 || j==0 || i==lado-1 || j== lado-1) {
					D = D + "*";
				}else{
					D = D + " ";
				}
			}
			D = D + "\n";
		}
		super.setFigura(D);
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	
	}

