package Exericios_De_Condicional;

import java.util.Scanner;


public class ex04 {
	public static void main(String [] args) {
		int raiz,num,elevado;
		double resultado;
		 
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Escreva o n�mero: ");
		num =ler.nextInt();
		resultado = Math.sqrt(num);
		
		elevado = (num*num*num*num);
		
		
		
		if(num%2==0) {
			System.out.printf("\nO numero %d � par",num);
			System.out.printf("\nA raiz quadrada dele �: %2f",resultado);
			
		}
		
		else if (num%2!=0) {
			System.out.printf("\nO numero %d � �mpar",num);
			System.out.printf("\n%d elevado ao quadrado �: %d ",num,elevado);
			
		}
		
		
		
	}

}
