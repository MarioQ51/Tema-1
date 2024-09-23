package parte1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		//Creamos el Scanner y las variables
		Scanner reader= new Scanner(System.in);
		//Variable donde almacenar la fecha
		int number;
		//Pedimos la fecha
		System.out.println("Dime tu edad");
		number= reader.nextInt();
		System.out.println("Tu edad es: " + number + " años");
		
	}

}
