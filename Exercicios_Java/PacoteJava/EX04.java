package PacoteJava;

import java.util.Scanner;

public class EX04 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		float a,b,c,d,r,s;
		
		System.out.println("Escreva um numero positivo para A: ");
		a = ler.nextFloat();
		
		System.out.println("Escreva um numero positivo para B: ");
		b = ler.nextFloat();
		
		System.out.println("Escreva um numero positivo para C: ");
		c = ler.nextFloat();
		
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		d = (r+s)/2;
		
		System.out.println(d);
		
	}

}
