package Curso.java.loops;

import java.util.Scanner;

public class Ex3_MaiorEMenor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;
		int maior = 0;
		int soma = 0;
		

		int count = 0;
		do {
			System.out.println("Número: ");
			num = scan.nextInt();

			if (num > maior) maior = num;
	
			count = count + 1;
			soma = soma + num;

		} while (count < 5);
		
		System.out.println("Maior " + maior);
		System.out.println("Soma " + soma/5);
	}

}
