package programacao.sequencial;

import java.util.Scanner;

/*
 * Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o:  D= R+S/2, 
 * onde R = (A+B)� e S = (B+ C)�
 */

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, r, s;
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = ler.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = ler.nextDouble();
		
		r = Math.pow(a+b, 2);
		s = Math.pow(b+c, 2);
		d = (r+s) / 2;
		
		System.out.println("O valor de D �: " + d);
		
		
		
		
	}
}
