package Exericios_De_Condicional;

import java.util.Scanner;

public class exemplo_01 {
	public static void main(String [] args)
	{
		Scanner ler = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.printf("Entre com a sua idade: ");
		idade = ler.nextInt();
		ler.nextLine();
		System.out.printf("Entre com o seu nome: ");
		nome = ler.nextLine();
		System.out.printf("Seu nome �: %s e a sua idade � %d anos",nome,idade);
		
		if(idade >= 18) {
			System.out.printf("\nVoc� ja pode tirar a carta");
		}
		
		else if(idade<=18 && idade >=1) {
			System.out.printf("\nVoc� ainda n�o tem idade para tirar a carta");
		}
		
		else {
			System.out.printf("\nNumeros da idade invalidos!");
		}
		
		
		
		
		
	}

}
