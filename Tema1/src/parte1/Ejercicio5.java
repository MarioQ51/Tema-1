package parte1;

import java.util.Scanner;

public class Ejercicio5 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Pedir la primera nota
	        System.out.print("Por favor, ingresa la primera nota: ");
	        int nota1 = scanner.nextInt();

	        // Pedir la segunda nota
	        System.out.print("Por favor, ingresa la segunda nota: ");
	        int nota2 = scanner.nextInt();

	        // Calcular la media aritmética
	        double media = (nota1 + nota2) / 2.0;

	        // Mostrar la media
	        System.out.println("La media aritmética es: " + media);
	    }
	}

