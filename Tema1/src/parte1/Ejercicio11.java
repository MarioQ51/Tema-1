package parte1;

import java.util.Scanner;
public class Ejercicio11 {
	public static void main(String[] args) {
		//Declaramos las varibles
		double pesetas;
		double euros;
		//Creamos el scanner
		Scanner reader = new Scanner(System.in);
		//Le pedimos al usuario un valor en pesetas
		System.out.println("Indique una cantidad de pesetas");
		pesetas = reader.nextDouble();
		euros = pesetas / 166;
		//Imprimimos la cantidad en euros
		System.out.println("La cantidad que ha indicado en pesatas en euros equivale a " + euros);
		//Cerramos el escaner
		
		reader.close();
		

	}
}
