programa
{
	
	funcao inicio()
	{
		inteiro numero[4],x

		para (x=0;x<4;x++){

			escreva("Escreva um numero: ")
			leia(numero[x])
		
		}
		limpa()
		para (x=0;x<4;x++){

			escreva("\n",x+1,"° posição: ",numero[x])
		}
		para (x=3;x>=0;x--){
		
		escreva("\n",x+1,"° posição: ",numero[x])	
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 243; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */