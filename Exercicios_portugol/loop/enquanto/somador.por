programa
{
	
	funcao inicio()
	{
		inteiro valor=0, contador=0
		real media=0, soma=0

		enquanto (valor>=0){

			escreva("Digite um valor: ")
			leia(valor)

			se(valor>0){
				soma=valor+soma
				contador=contador +1
				media=soma/contador
			}
			
			
		}

		escreva("\nTotal do somatório ", soma, 
		"\nA média é: ", media, 
		"\nTotal de valores lidos: ", contador)
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 252; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */