package Exericios_De_Condicional;

import java.util.Scanner;

public class ex01 {
	public static void main(String [] args) {
		
		int num1,num2,num3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite o numero 1: ");
		num1 = ler.nextInt();
		
		System.out.printf("Digite o numero 2: ");
		num2 = ler.nextInt();
		
		System.out.printf("Digite o numero 3: ");
		num3 = ler.nextInt();

		
		if ((num1>num2)&& (num1>num3)) {
			
			System.out.printf("O numero maior é: %d",num1);
		}
		
		else if ((num2>num1)&&(num2>num3)) {
		System.out.printf("O numero maior é: %d",num2);
		}
		
		else {
			System.out.printf("O numero maior é: %d",num3);
		}
		
	}
}
