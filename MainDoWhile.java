package dowhile;

import java.util.Locale;
import java.util.Scanner;

public class MainDoWhile {

	public static void main(String[] args) {
		// Menos ultilizado o DoWhile porém em alguns caso usado,Bloco execulta pelo - uma vez

		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		/*System.out.print("Digite a temperatura  em Cellsius :");
		double C = sc.nextDouble();
		double F = 9.0 * C / 5.0 + 32.00;
		System.out.printf("Equivalente em Fahrenheit: %.2f%n",F);
		System.out.print("Quer repetir (s/n)?");*/
		
		
		char resp; //Variavel declarada fora do escopo  do Do While
		do{ 
			
			System.out.print("Digite a temperatura  em Cellsius :");
			 double C = sc.nextDouble();
		     double F = 9.0 * C / 5.0 + 32.00;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n",F);
			System.out.print("Quer repetir (s/n)?");
			 resp =sc.next().charAt(0);
			
		} while (resp  != 'n');
		
		
		sc.close();
		
		
	}

}
