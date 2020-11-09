programa
{
	/*Escrever um programa que leia uma quantidade desconhecida de números e conte
quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A
entrada de dados deve terminar quando for lido um número negativo.*/
	funcao inicio()
	{
	

		inteiro num=1,contado=0,acm1=0,acm2=0,acm3=0,acm4=0

		

		enquanto (num>0){

			escreva("Escreva um numero de 1 até 100 : ")
			leia(num)
			limpa()

			
		
			se (num>0 e num<=25){	
			acm1 = acm1 + 1
				
			}

			senao se (num<=50){
				acm2 =acm2 + 1
			}

			senao se (num<=75){
				acm3= acm3+1

			}

			senao se (num<=76 e num<100){
				acm4= acm4+1
			
		}


		}
		
		escreva("Foram lidos ",acm1," numeros de [0-25]")
		escreva("\nForam lidos ",acm2," numeros de [26-50]")
		escreva("\nForam lidos ",acm3," numeros de [51-75]")
		escreva("\nForam lidos ",acm4," numeros de [76-100]")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 427; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */