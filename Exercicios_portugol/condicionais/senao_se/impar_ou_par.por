programa
{
	
	funcao inicio()
	{
		inteiro num,pos

		escreva("Escreva seu numero: ")
		leia(num)

		pos= num/2

		se (num%2==0 e num>0){
			escreva("O numero ",num," é positivo e par")
		}
		senao se (num%2==0 e num<0){
			escreva("O numero ",num," é negativo e par")
		}
		senao se (num%2!=0 e num>0){
			escreva("O numero ",num," é positivo e impar")
		}
		senao {
			escreva("O numero ",num," é negativo e impar")
		}

}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 182; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */