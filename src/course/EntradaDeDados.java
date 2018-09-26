package course;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	
	//   public static void main(String[] args) {
	 /*  
	   Scanner sc = new Scanner (System.in); String sentence = sc.nextLine(); String
	   x, y, z; x = sc.next(); y = sc.next(); z = sc.next();
	   
	   System.out.println(sentence); System.out.println(x); System.out.println(y);
	   System.out.println(z);
	   
	   x = sc.next(); y = sc.next(); z = sc.next();
	   
	   System.out.println(sentence); 
	   System.out.println(x); 
	   System.out.println(y);
	   System.out.println(z);
	   
	   sc.close(); 
	 } */ 

	/*  public static void main(String[] args) {
	   
	   
	   Locale.setDefault(Locale.CANADA); 
	   Scanner sc = new Scanner (System.in);
	   
	   int n1 = sc.nextInt(); 
	   // 35 
	   sc.nextLine(); 
	   // flush 
	   String name =sc.nextLine(); // Bob Brown 
	   char gender = sc.next().charAt(0); // 1 caracter  da string // b5 
	   String s = sc.next(); 
	   char letter = s.charAt(0); //F 
	   int digit = Integer.parseInt(s.substring(1)); //4.32 
	   double n2 = sc.nextDouble();
	   // Maria F 23 1.68 
	   String name2 = sc.next(); char ch = sc.next().charAt(0);
	   int age = sc.nextInt(); double height = sc.nextDouble();
	   
	   System.out.println(n1); 
	   System.out.println(name); 
	   System.out.println(gender);
	   System.out.println(letter); 
	   System.out.println(digit);
	   System.out.println(n2); 
	   System.out.println(name2); 
	   System.out.println(ch);
	   System.out.println(age); 
	   System.out.println(height);
	   
	   
	   sc.close(); }
	   
	   public static void main(String[] args) { 
	   String original = "Clarissa Costa MaRTINS     "; 
	   String s01 = original.toLowerCase(); // Todas as letras minusculas 
	   String s02 = original.toUpperCase(); // Todas as letras maiusculas 
	   String s03 = original.trim(); 
	   String s04 = original.substring(5);
	   String s05 = original.substring(5, 9); 
	   String s06 = original.replace('a','x'); 
	   String s07 = original.replace("Cla", "xy"); 
	   int i = original.indexOf("ss"); 
	   int j = original.lastIndexOf("ss");
	   
	   System.out.println("Original : -" +original+"-");
	   System.out.println("ToloweCase : -" +s01+"-");
	   System.out.println("ToUpperCase : -" +s02+"-"); 
	   System.out.println("Trim : -"+s03+"-"); 
	   System.out.println("Substring : -" +s04+"-");
	   System.out.println("Substring 2/9 paramtros : -" +s05+"-");
	   System.out.println("Replace : -" +s06+"-");
	   System.out.println("Replace 2 parametros: -" +s07+"-");
	   System.out.println("IndexOf: -" +i+"-"); 
	   System.out.println("LastIndex: -"+j+"-");
	   
	   
	   }
	  
	//public static void main(String[] args) {
		String s = "potato apple lemon orange";

		String[] vect = s.split(" "); // só funcionará com um espaço 
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[3]);
	} */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three student scores: ");
		
		double score1 = sc.nextDouble(); // primeira nota 
		double score2 = sc.nextDouble(); // segunda nota 
		double score3 = sc.nextDouble(); // terceira nota
		
		double finalScore = score1 + score2 + score3;
		
		System.out.printf("Final score: %.2f%n", finalScore);
			if (finalScore < 60.0) {
				System.out.println("FAILED");
			}
			sc.close();
		
		}
	}
