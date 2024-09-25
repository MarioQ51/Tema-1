package parte1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Creamos el scanner
		// Declaramos variables
		String name;
int age;
		System.out.println("dime tu nombre");
		name = reader.nextLine();
		System.out.println("Dime tu edad");
		age = reader.nextInt();
//Imprimimos el mensaje

		System.out.println("Hola " + name + " tienes " + age + " !Que mayor eres!");

	}
}
