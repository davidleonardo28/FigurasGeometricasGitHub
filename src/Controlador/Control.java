package Controlador;

import Modelo.Cuadrado;
import Modelo.Rectangulo;
import Modelo.Triangulo;
import Vista.Vista;

public class Control {

	Vista V;
	Cuadrado C;
	Rectangulo R;
	Triangulo T;

	public Control() {
		V = new Vista();
		fg();
	}

	public void fg() {
		int opcion =0;
		do {
			opcion = V.menu();
			switch (opcion) {
			case 1:
				int lado = V.menu2();
				C = new Cuadrado(lado);
				C.CalcularArea();
				C.CalcularPerimetro();
				C.Dibujar();
				V.ImprimirValor("Area", "" + C.getArea());
				V.ImprimirValor("Perimetro", "" + C.getPerimetro());
				V.ImprimirFigura(C.getFigura());
				break;

			case 2:
				int lado1 = V.menu2();
				int lado2 = V.menu2();
				R = new Rectangulo(lado1, lado2);
				R.CalcularArea();
				R.CalcularPerimetro();
				R.Dibujar();

				V.ImprimirValor("Area", "" + R.getArea());
				V.ImprimirValor("Perimetro", "" + R.getPerimetro());
				V.ImprimirFigura(R.getFigura());
				break;
			case 3:
				lado1 = V.menu2();
				lado2 = V.menu2();
				T = new Triangulo(lado1, lado2);
				T.CalcularArea();
				T.CalcularPerimetro();
				T.Dibujar();

				V.ImprimirValor("Area", "" + T.getArea());
				V.ImprimirValor("Perimetro", "" + T.getPerimetro());
				V.ImprimirFigura(T.getFigura());
				break;

			case 4:
				V.ImprimirValor("Adios", " Bye ");
				break;

			/*
			 * default: V.ImprimirValor("Favor escoger una opcion correcta", "[1 a 4]");
			 * break;
			 **/
			}
		} while (opcion != 4);
	}

}
