programa
{
	
	inclua biblioteca Matematica -->
	funcao inicio()
	{
		 inteiro n1,n2,n3,media

		 escreva("Coloque sua primeira nota: ")
		 leia(n1)
		 escreva("Coloque sua segunda nota: ")
		 leia(n2)
		 escreva("Coloque sua terceira nota: ")
		 leia(n3)

		 media= (n1+n2+n3)/2

		 se (media>=7)
		 {
		 	escreva("você foi aprovado")
		 }
		 senao se (media>4 e media <7)
		 {
		 	escreva("voce está de exame")
		 }
		 senao {
		 	escreva("voce foi reprovado :(((")
		 }
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 188; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */