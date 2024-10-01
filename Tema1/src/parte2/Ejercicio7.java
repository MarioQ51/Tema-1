package parte2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Declaramos constantes de las entradas
		final double ENTRADA_INF;
		final int ENTRADA_ADU;
		final double DESCUENTO;
		
		//Declaramos variables de la cantidad de entradas
		int entradasInf;
		int entradasAd;
		double totalInf;
		double totalAD;
		double end;
		double descuento;
		
		//Le damos el valor a las constantes
		ENTRADA_INF= 15.50;
		ENTRADA_ADU= 20;
		DESCUENTO= 0.05;
		
		//Creamos el Scanner
		Scanner reader= new Scanner(System.in);
		
		//Preguntamos cantidad de entradas de cada clase
		System.out.println("Cuantas entradas infantiles ha comprado");
		entradasInf= reader.nextInt();
		System.out.println("Cuantas entradas de adultos ha comprado");
		entradasAd= reader.nextInt();
		
		//Calculamos el el coste total infantil
		totalInf= ENTRADA_INF*entradasInf;
		
		//Calculamos el coste total adulto
		totalAD = ENTRADA_ADU*entradasAd;
		
		//Calculamos el importe total
		end= totalAD+totalInf;
		
		 // Aplicar descuento si el importe total es igual o superior a 100€
        descuento = (end>100)? end-(end*0.05): end;
        
        //Mostramos en consola el precio final
        System.out.println("El importe total es "+ descuento + " euros");
       
	}

}
