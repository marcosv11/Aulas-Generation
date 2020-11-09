programa
{
	
	funcao inicio()
	{
		inteiro peso,excesso,multa

		escreva("Digite o peso; ")
		leia(peso)

		se (peso>50){

			excesso= (peso-50)
			multa = excesso * 4 
			escreva("Sua multa é de :",multa,",00 reais")
		
		
		}
		senao {
			escreva ("Você não tem multa")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 275; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */