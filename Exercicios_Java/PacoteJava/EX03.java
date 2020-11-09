package PacoteJava;

import java.util.Scanner;
import java.math.*;
public class EX03 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		float seg,horas,minutos,segundos;
		
		System.out.println("Escreva o tempo em segundos: ");
		seg = ler.nextFloat();
		
				horas = (seg/3600);
				minutos = (seg%3600)/60;
				segundos = (seg%3600)%60;
		
		System.out.printf("%e hora(s), %e minutos e %e segundos",horas, minutos, segundos);
		
		
	}

}
 