package parte1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el año actual
        System.out.print("Por favor, ingresa el año actual: ");
        int anoActual = scanner.nextInt();

        // Pedir el año de nacimiento
        System.out.print("Por favor, ingresa tu año de nacimiento: ");
        int anoNacimiento = scanner.nextInt();

        // Calcular la edad
        int edad = anoActual - anoNacimiento;

        // Mostrar la edad
        System.out.println("Tu edad es: " + edad + " años.");
    }
}


