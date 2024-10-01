package parte2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Declaramos la de milmetros
		double milimetros;
		
		//Declaramos la variable de centímetros
		double centimetros;
		
		//Declaramos la variable de metros
		double metros;
		
		//Variable para milimetros en centímetros
		double milímetrosEnCenti;
		
		//Variable para metros en centímetros
		double metrosEnCenti;
		
		//Resultado final
		double resultado;
		
		//Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//Pedimos milimetros
		System.out.println("Dame una medida en milímetros");
		 milimetros =reader.nextDouble();
		 
		 //Pedimos centímetros
		 System.out.println("Dame una medida en centímetros");
		 centimetros= reader.nextDouble();
				 
		 //Pedimos metros
		 System.out.println("Dame una medida en metros");
		 metros= reader.nextDouble();
		 
		 milímetrosEnCenti= milimetros/10;
		 metrosEnCenti= metros *100;
		 resultado= centimetros+metrosEnCenti+milímetrosEnCenti;
		 
		 //Leemos en consola
		 System.out.println("Las cantidades que ha introducido en centímetros en total es " + resultado);
		 
		 
		 

	}

}
