package parte2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Declaramos variable cuanta longitud de disparo ha tenido
		double longitud;
		//Declaramos la variable de los centimetros total
		int centimetros;
		//Creamos variable conversion
		double conversion;
		
		//Creamos el Scanner
		Scanner reader= new Scanner(System.in);
		
		System.out.println("¿Cuantos metros de lejos ha llegado?");
		longitud= reader.nextDouble();
		
		//Le damos valor
				conversion= longitud*100;
				
		//Le asignamos valor a centímetros
		centimetros= (int)conversion;
		System.out.println("La distancia en centímetros es " + centimetros + " centimetros");
		
		
	}

}
