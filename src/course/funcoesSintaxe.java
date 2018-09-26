package course;

import java.util.Scanner;

public class funcoesSintaxe {

	public static void main(String[] args) {
		
		//double x = Math.sqrt(25.0); //função raiz quadrada
		//System.out.println(x);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max (a,b,c);
		showResult(higher);
		
		sc.close();
	} 
	public static int max(int x, int y, int z) {
		int aux; // funcao escopo
		
		if (x > y && x > z) {
			aux =x;
		} else if (y > z) {
			aux =y ;
		} else {
			aux =z;
		}
		
		return aux;
	}
	public static void showResult(int value) {
		System.out.println("Higher = " +value);
		
	}
}
