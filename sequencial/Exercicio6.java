package programacao.sequencial;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	
		double x1, x2, y1, y2, potencia1, potencia2, d;
		
		System.out.println("Digite o valor de x1: ");
		x1 = ler.nextDouble();
		
		System.out.println("Digite o valor de x2: ");
		x2 = ler.nextDouble();
		
		System.out.println("Digite o valor de y1: ");
		y1 = ler.nextDouble();
		
		System.out.println("Digite o valor de y2: ");
		y2 = ler.nextDouble();
		
		potencia1 = (Math.pow(x2 - x1, 2));
		potencia2 = (Math.pow(y2 - y1, 2));
		d = (Math.sqrt(potencia1+ potencia2));
		
		System.out.println("O valor de D é igual a: " + d);
		
	}
}
