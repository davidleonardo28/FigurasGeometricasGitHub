package Vista;

import java.util.Scanner;

public class Vista {
	Scanner Leer;

	public Vista() {
		Leer = new Scanner(System.in);
	}

	public int menu() {
		int opcion = 0;
		String Dato;
		try {
			System.out.println("Menu de Figuras");
			System.out.println("\n1. Cuadrado");
			System.out.println("2. Rectangulo");
			System.out.println("3. Triangulo");
			System.out.println("4. Salir");
			System.out.println("\nDigite Opcion: ");
			Dato = Leer.next();
			opcion=Integer.parseInt(Dato);	
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("No es un Numero "+"ERROR");
		}
		if (opcion < 0) {
			System.out.println(" Ingrese Valores Postivos");
		}
		return opcion;
	}

	public int menu2() {

		System.out.println("\nDigite Valos asignado al lado: ");
		int r = Leer.nextInt();
		return r;
	}

	public void ImprimirValor(String a, String b) {
		System.out.println(a + " = " + b);
	}

	public void ImprimirFigura(String a) {
		System.out.println(a);
	}

}
