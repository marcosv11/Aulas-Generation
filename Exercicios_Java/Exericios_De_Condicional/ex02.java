package Exericios_De_Condicional;

import java.util.Scanner;

public class ex02 {
	public static void main(String [] args) {
		
		int num1,num2,num3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite o numero 1: ");
		num1 = ler.nextInt();
		
		System.out.printf("Digite o numero 2: ");
		num2 = ler.nextInt();
		
		System.out.printf("Digite o numero 3: ");
		num3 = ler.nextInt();

		
		if ((num1>num2)&& (num1>num3)&&(num2>num3)) {
			
			System.out.printf("A ordem é: %d, %d, %d",num1,num2,num3);
		}
		
		else if ((num2>num1)&&(num2>num3)&&(num1>num3)) {
			System.out.printf("A ordem é: %d, %d, %d",num2,num1,num3);
		}
		
		else {
			System.out.printf("A ordem é: %d, %d, %d",num3,num2,num1);
		}
		
		
			
		
	}
}
