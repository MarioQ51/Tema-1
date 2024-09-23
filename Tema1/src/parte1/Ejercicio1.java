package parte1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		int number;
		Scanner reader = new Scanner(System.in);
		System.out.println("Dime un numero");
		number = reader.nextInt();
		System.out.println("Has introducido el numero " + number);
	}
}
