package course;

import java.util.Locale;
import java.util.Scanner;

public class tipoWhile {


	/*	while ( condição ) {
			comando 1
			comando 2
				}
			Regra:
				V: executa e volta
				F: pula fora
*/
			public static void main(String[] args) {
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter a number: " );
				double n = sc.nextDouble();
				
				while(n >= 0.0) {
					double sr = Math.sqrt(n);
					System.out.printf("%.2f%n", sr);
					System.out.print("Enter another number: ");
					n = sc.nextDouble();
				}
				System.out.println("Negative number");
				sc.close();
				
				/*
				
				Enter a number: 25
				5.000
				Enter another number: 10
				3.162
				Enter another number: 9
				3.000
				Enter another number: -4
				Negative number	
				
				*/
	}

}
