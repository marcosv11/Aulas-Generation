package PacoteJava;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int anos,meses,dias,resultado;
		
		
		System.out.println("Anos: ");
		anos = ler.nextInt();
		
		System.out.println("Meses: ");
		meses = ler.nextInt();
		
		System.out.println("Dias: ");
		dias = ler.nextInt();
		
		resultado = (anos*360)+(meses*30)+dias;
		
		System.out.println(resultado);
	}
}
