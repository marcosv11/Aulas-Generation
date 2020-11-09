package PacoteJava;

import java.util.Scanner;

public class EX05 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		float n1,n2,n3,med;
		
		System.out.println("Escreva a nota da primera prova: ");
		n1 = ler.nextFloat();

		System.out.println("Escreva a nota da primera prova: ");
		n2 = ler.nextFloat();
		
		System.out.println("Escreva a nota da primera prova: ");
		n3 = ler.nextFloat();
		
		med = (n1+n2+n3)/3;
		
		System.out.println(med);
	}

}
