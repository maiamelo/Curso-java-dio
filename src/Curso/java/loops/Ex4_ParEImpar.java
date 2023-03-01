package Curso.java.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int quantNumeros;
		int num;
		int quantPares = 0, quantImpares = 0;

		System.out.println("Quantidade de números ?");
		quantNumeros = scan.nextInt();

		int count = 0;
		do {
			System.out.println(count + 1 + "° Número :");
			num = scan.nextInt();

			if (num % 2 == 0)quantPares++;
			else quantImpares++;
			

			count++;
		} while (count < quantNumeros);

		System.out.println("Número de pares :" + quantPares);
		System.out.println("Número de impares :" + quantImpares);
	}
}
