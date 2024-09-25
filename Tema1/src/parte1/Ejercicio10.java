package parte1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Creamos las variables
		int number;
		boolean espar;
		//Creamos el scanner
		Scanner reader = new Scanner (System.in);
		//Pedimos un número al usuario
		System.out.println("Dime un número");
		number = reader.nextInt();
		//Le damos un valor a la variable
		espar= number % 2 == 0;
		//Indicamos si es par
		System.out.println(espar);
		
		
		

	}

}
