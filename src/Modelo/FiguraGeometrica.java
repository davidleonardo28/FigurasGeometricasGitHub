package Modelo;

abstract class FiguraGeometrica {

	private String Nombre;
	private String Figura;
	protected double area;
	protected double perimetro;

	public abstract double CalcularArea();
	public abstract double CalcularPerimetro();

	
	public FiguraGeometrica(String Nombre) {
		this.Nombre = Nombre;
		this.Figura = "";
		this.area = 0.0;
		this.perimetro = 0.0;
	}

	public void Dibujar() {

	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getFigura() {
		return Figura;
	}
	public void setFigura(String figura) {
		Figura = figura;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	

}
