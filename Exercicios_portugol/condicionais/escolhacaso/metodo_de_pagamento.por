programa
{
	inclua biblioteca Matematica --> mat
	/*Elabore um programa que calcule o que deve ser pago por um produto, considerando
o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos
da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo
adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 20% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em três vezes, preço normal de etiqueta mais juros de 10%*/
	
	funcao inicio()
	{
		inteiro forma
		real valor=0.0,novovalor,total
		

		
	escreva("Digite o valor da compra: ")
	leia(valor)
	limpa()
	escreva("Forma de pagamento \n 1- A vista \n 2- Cheque \n 3- A vista no cartão de credito \n 4- Parcelado em 2x \n 5- Parcelado em 3x \n Digite o numero da opção: ")
	leia(forma)
	limpa()

	
 

	escolha(forma) {

		caso 1:
		novovalor= (20*valor)/100
		total = valor-novovalor
		 

		escreva("O valor total da compra é:",total," reais")
		pare

		caso 2: 
		novovalor= (20*valor)/100
		total = valor-novovalor
		 

		escreva("O valor total da compra é:",total," reais")
		pare
		
		caso 3:
		novovalor= (15*valor)/100
		total = valor-novovalor
	 

		escreva("O valor total da compra é:",total," reais")
		pare

		caso 4: 
		escreva(valor)
		pare

		caso 5: 
		novovalor= (10*valor)/100
		total = valor+novovalor
		 
		escreva("O valor total da compra é:",total," reais")
		pare
		


		
	}


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1346; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */