package course;

import java.util.Locale;

public class testeConversaoCasting {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 =  "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("-----------------------------");
		System.out.println("Products: ");
		System.out.printf("Products: %s, which price is $ %.2f %n", product2, price2);	
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %.6f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		System.out.printf("%s, which price is $ %,.2f%n", product1, price1);
		
	
		

	/*	System.out.println("Good morning!");
		
		char genderr = 'C';
		int agee = 32;
		double balance = 12.78624;
		String name = "José";
		
		System.out.println("Good afternoon");
		System.out.println("-----------------------------");
		System.out.printf("%.2f%n" , balance);
		System.out.printf("%.4f%n", balance);
		Locale.setDefault(Locale.CHINESE);
		System.out.printf("%.4f%n", balance);
		System.out.println("-----------------------------");*/
/*		System.out.printf("%s %d years old, gender %c, and got balance %.2f Bitcoins %n", name, agee, genderr, balance);   // %s ou %d chama a variavel dentro da impressão
			
		
			double a;
			int b;

			a = 5.0;
			b = (int)a; // >> convertendo de double para int  (Atribuir valor double para int pode haver perda de informação)

			System.out.println(b);
		} 	
		
		int c, d;
		double result;
		c = 5;
		d = 2;
		String s = "23";

		c = Integer.parseInt(s);
		result = Double.parseDouble(s); 
	//	result = (double) c / d ; // tirando o double vira conversao implicita

		System.out.println(result);
		*/
		
		

	}

}
