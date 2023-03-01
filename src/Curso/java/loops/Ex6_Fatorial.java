package Curso.java.loops;

import java.util.Scanner;

import javax.swing.plaf.multi.MultiButtonUI;

public class Ex6_Fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Número");
		int fat = scan.nextInt();

		int multplicação = 1;
		System.out.print(fat +"! = ");
		
		for (int i = fat; i >= 1; i--) {

			multplicação = multplicação * i;
			// System.out.println();

		}
		System.out.println(multplicação);
	}

}
