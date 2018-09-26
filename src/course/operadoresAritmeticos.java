package course;

import java.util.Scanner;

public class operadoresAritmeticos {

	/*> Operadores aritméticos
	 * public static void main(String[] args) {
	 * 
	 * int n1 = 3 + 4 * 2; System.out.println(n1); int n2 = (3 + 4) * 2;
	 * System.out.println(n2); int n3 = 17 % 3; System.out.println(n3); double n4 =
	 * (double) 10 / 8; // casting System.out.println(n4); double a = 1.0, b = -3.0,
	 * c = -4.0; double x1 = (-b + Math.sqrt(b * b - 4.0 * a * c) / (2 * a));
	 * 
	 * System.out.println(x1); }
	 */

	/*
	 * a = 10 > atribui A expressão 10 (a recebe 10 )
	 * 
	 * 
	 * 
	 *  > Operadores de atribuição
	 * public static void main(String[] args) {
	 * 
	 * double n1 = 10; double n2 = 30; String s = "ABC"; System.out.println(n1);
	 * System.out.println(n2); System.out.println(s);
	 * 
	 * System.out.println("----------------------------------");
	 * 
	 * n1 *= 2; // 20 n2 += n1; //30 s += "DEF"; System.out.println(n1);
	 * System.out.println(n2); System.out.println(s); }
	 * 
	 * Operadores 
	 * 
	 * public static void main(String[] args) { 
	 * 
	 * int a = 10; int b = ++a;
	 * 
	 * System.out.println(a); 
	 * System.out.println(b);
	 * 
	 * }
	 
	// Operadores Comparativos
	public static void main(String[] args) {
		int a = 10;
		
		boolean c1 = a < 10;
		boolean c2 = a < 20;
		boolean c3 = a > 20;
		boolean c4 = a > 5;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println("--------------------------");
		
		boolean c5 = a <= 10;
		boolean c6 = a >= 10;
		boolean c7 = a == 10;
		boolean c8 = a != 10;
		
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		
	}
	 && > E 
	 || > ou 
	  ! > não
	// Operadores Lógicos >
	public static void main(String[] args) {
	boolean c1 = 2 > 3 || 4!= 5;
	boolean c2 = !(2 > 3) && 4!= 5;
		
	System.out.println(c1);
	System.out.println(c2);
	System.out.println("-------------------------");
	
	boolean c3 = 10 < 5;
	boolean c4 = c1 || c2 && c3;
	System.out.println(c3);
	System.out.println(c4);
	}	
	
	// Operadores BITWISE >
	
	public static void main(String[] args) {
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		System.out.println("-------------------------");
		int mask = 0b00100000;
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		if((n & mask) != 0 ){
			System.out.println("6th bit is true!");
		} else { 
				System.out.println("6th bit is false!");
			}
			
			sc.close();
	}*/
	
}