package parte1;

import java.util.Scanner;

public class Ejercicio12 {
public static void main(String[] args) {
	//Indicamos las variables
	 final double precioPera = 1.95;
	 final double precioManzana = 2.35; 
	 double totalManzanas;
	 double totalPeras;
	 double importe;
	double peras;
	double manzanas;
	//Creamos el scanner
	Scanner reader = new Scanner (System.in);
	//Le pedimos al usuario cuantos kilos de peras y manzanas ha vendido
	System.out.println("Cuantos kilos de peras ha vendido");
	peras = reader.nextDouble();
	System.out.println("Cuantos kilos de manzanas ha vendido");
	manzanas= reader.nextDouble();
	//Calculamos el total y lo indicamos
	totalManzanas = manzanas * precioManzana;
	totalPeras = peras * precioPera;
	importe = totalManzanas + totalPeras;
	System.out.println("El importe total es de " + importe + " Euros");
	//Cerramos el scanner
	reader.close();
	
	
}
}
