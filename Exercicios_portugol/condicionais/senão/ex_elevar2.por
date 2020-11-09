programa
{
	
	funcao inicio()
	{
		inteiro n1,n2,n3,n4,q1,q2,q3,q4

		escreva("Digite o numero 1 : ")
		leia(n1)
		escreva("Digite o numero 2 : ")
		leia(n2)
		escreva("Digite o numero 3 : ")
		leia(n3) 
		escreva("Digite o numero 4 : ")
		leia(n4)
		limpa()

		q1= n1 * 2
		q2= n2 * 2
		q3= n3 * 2
		q4= n4 * 2

		 se(n3>=500)
		 {
		 	
		 	escreva("\n O quadrado de ",n3," é ",q3)
		 	
		 }
		senao {
			 escreva("\n O quadrado de: ",n1," é ",q1)
			 escreva("\n O quadrado de: ",n2," é ",q2)
			 escreva("\n O quadrado de: ",n3," é ",q3)
			 escreva("\n O quadrado de: ",n4," é ",q4)
		}
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */