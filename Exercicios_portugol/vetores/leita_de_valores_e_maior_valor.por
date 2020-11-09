programa
{
	
	/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	*/
	funcao inicio()
	{
		inteiro numero[5],x,maior=0

		para (x=0;x<5;x++){

			escreva("Coloque o valor da pontuação: ")
			leia(numero[x])
			limpa()

			
		}

		para (x=0;x<5;x++){

			escreva("\nValor da pontuação é: ",numero[x])

			
			se (numero[x] > maior){
				maior = numero[x]


			
		}
	}
	
			 escreva("\nA maior pontuação foi: ",maior)
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */