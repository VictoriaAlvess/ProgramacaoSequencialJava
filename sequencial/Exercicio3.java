package programacao.sequencial;

import java.util.Scanner;

/*
 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos 
 * E mostre-o expresso em horas, minutos e segundos. 
 */

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int horas, minutos, segundos, totalHoras, totalMinutos, restoSegundos;
		
		System.out.println("Digite a quantidade de tempo em segundos do evento: ");
		segundos = ler.nextInt();
		
		horas = (segundos / 3600);
		minutos = ((segundos % 3600) % 60);
		restoSegundos = ((segundos % 3600)% 60);
		
		System.out.println("O evento durou " + horas + " horas " + minutos + " minutos e " + restoSegundos +
				" segundos" );
		
		
		
	}
}
