package programacao.sequencial;

import java.util.Scanner;

/*
 * O custo ao consumidor de um carro novo ? a soma do custo de f?brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de f?brica).
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f?brica de um carro e escreva o custo ao consumidor. 
 */
public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor, distribuidor;
		
		System.out.println("Digite o custo de f?brica: ");
		custoFabrica = ler.nextDouble();
		
		distribuidor = custoFabrica + (custoFabrica * 0.25);
		custoConsumidor = distribuidor + (distribuidor * 0.45);
		
		System.out.println("O custo do consumidor ? de: R$ " + custoConsumidor);
				
	}
}
