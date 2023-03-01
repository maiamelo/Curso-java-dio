package Curso.java.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Tabuada de :");
		int num = scan.nextInt();
		
		
		for(int i =0 ;i<= 10;i++) {
			System.out.println(num+" X "+i+" = "+num*i );
			
		}
		
		
	}

}
