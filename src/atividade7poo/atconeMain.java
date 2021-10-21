package atividade7poo;

import java.util.Scanner;

public class atconeMain {

	public static void main(String[] args) {
		
		atcone atcone = new atcone (0);
		
		Scanner input = new Scanner (System.in);

		System.out.println("Digite o raio do cone a ser pintado: ");
		atcone.setRaio(input.nextFloat());

		System.out.println("Digite o altura do cone a ser pintado: ");
		atcone.setAltura(input.nextFloat());

		System.out.println("Escolha o tipo de tinta que você quer? 1-Tinta Clase1, 2-Tinta Classe2,3-Tinta Classe3: ");
		atcone.setTinta(input.nextInt());
		
		System.out.println(atcone);
		

		input.close();
		
	}
}

	
