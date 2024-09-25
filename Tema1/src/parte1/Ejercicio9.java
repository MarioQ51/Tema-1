package parte1;

import java.util.Scanner;

public class Ejercicio9 {
public static void main(String[] args) {
	int age;
	boolean over18;
	Scanner reader = new Scanner(System.in);
			System.out.println("Introduzca su edad");
	age = reader.nextInt();
	over18 = (age>=18);
	System.out.println(over18);
	
}
}
