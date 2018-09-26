package course;

import java.util.Locale;
import java.util.Scanner;

public class estruturaRepetitivaFor {

	/*
	 * public static void main(String[] args) {
	 * 
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * System.out.print("How many integer numbers are you going to enter: "); int n
	 * = sc.nextInt();
	 * 
	 * int sum = 0; for (int i = 1; i <= n; i++) { // quantas vezes vou somar?
	 * System.out.println("Value number #" + i + ": "); // qual o numero ? int x =
	 * sc.nextInt(); //x recebe o valor sum += x; // faz a soma do valor mais o
	 * numero informado } System.out.println("Sum " + sum); // mostra o resultado da
	 * soma sc.close(); // fecha o programa
	 * 
	 * }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * int n = sc.nextInt();
	 * 
	 * while (n <= 0) { System.out.print("N must be positive! Try again: "); n =
	 * sc.nextInt(); }
	 * 
	 * int higher = Integer.MIN_VALUE; for (int i = 1; i <= n; i++) {
	 * System.out.print("Value #" + i + ": "); int x = sc.nextInt(); if (x > higher)
	 * { higher = x; } } System.out.println("Higher = " + higher); sc.close();
	 * 
	 * sc.close(); }
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.print("Enter a number: ");
			double n = sc.nextDouble();
			double sq = Math.sqrt(n);
			System.out.printf("Square root = %.3f%n ", sq);
			System.out.print("Repeat (y/n)? ");
			resp = sc.next().charAt(0);
			
		} while ( resp!= 'n' );
		System.out.println("Até logo :p");
		sc.close();
		}
	}

