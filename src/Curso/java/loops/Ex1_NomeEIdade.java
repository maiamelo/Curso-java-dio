package Curso.java.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nome;
		int idade;

		while (true) {
			System.out.println("Nome : ");
			nome = scan.next();// leitor para nome.
			if (nome.equals("0"))// if de parada de loop.
				break;
			System.out.println("Idade : ");
			idade = scan.nextInt();// leitor para idade.

		}
		
		System.out.println("Parada!!!");//Msg de parada de loop .

	}

}
