package parte1;

import java.util.Scanner;

public class Ejercicio6 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Pedir el radio de la circunferencia
	        System.out.print("Por favor, ingresa el radio de la circunferencia: ");
	        double radio = scanner.nextDouble();

	        // Calcular la longitud de la circunferencia
	        double longitud = 2 * Math.PI * radio;

	        // Calcular el área de la circunferencia
	        double area = Math.PI * Math.pow(radio, 2);

	        // Mostrar los resultados
	        System.out.println("La longitud de la circunferencia es: " + longitud);
	        System.out.println("El área de la circunferencia es: " + area);
	    }
	}


