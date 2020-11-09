package Exericios_De_Condicional;

import java.util.Scanner;

public class ex03 {
	public static void main(String [] args)
	{
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite a sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade <=14) {
			System.out.printf("Sua categoria é a Infantil");
		}
		
		else if (idade>14 && idade <=17) {
			System.out.printf("Sua categoria é a Juvenil");
		}
		
		else if (idade>17 && idade <=25) {
			System.out.printf("Sua categoria é a Adulto");
		}
		
		else {
				System.out.printf("Desculpe, não consigos achar a sua categoria :(");
			}
			
		}
		
		
		
	}


