package parte1;

import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
	Scanner reader = new Scanner(System.in); //Creamos el scanner
	//Le pedimos al usuario nombre,direccion y numero de telefono
	
	System.out.println("Dime tu nombre");//Declaramos las variables
	String name = reader.nextLine();
	
	System.out.println("Dime tu dirección");
	String direction = reader.nextLine();
		
	System.out.println("Dime tu numero de telefono");
	int numtlf = reader.nextInt();
	
	System.out.println(name);
	System.out.println(direction);
System.out.println(numtlf);
}
}
