package PacoteJava;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int anos,meses,dias,resultado;
		
		
		System.out.println("Escreva a sua idade em dias: ");
		dias = ler.nextInt();
		
				anos = (dias/365);
				meses = (dias%365)/30;
				dias = (dias%365)%30;
		
		
		System.out.printf("%d ano(s), %d meses e %d dias", anos, meses, dias);
		
		 
	}
}
