package Projeto_Joguinho_Tesouro;

import java.util.Random;
import java.util.Scanner;

public class Ca�a_ao_Tesouro {
	
	public static void imprimeTabuleiro(char tabuleiro[]) {
		//Esse la�o percorre o tabuleiro todo imprimindo (entre os colchetes) o conte�do
		//De cada elemento do tabuleiro (pode ser um '-', um 'X' ou um 'O').
		for(int i = 0; i < tabuleiro.length; i++) {
			System.out.printf("[%c]    ", tabuleiro[i]);
		}	
		System.out.println();
	}
	
	public static char[] jogada(int posicaoJogada, int posicaoTesouro, char tabuleiro[]) {
		//Esse if verifica se a ilha escolhida de fato existe
		if(posicaoJogada > 10 || posicaoJogada < 1) {
			System.out.println("Opa! essa ilha n�o existe");
			return tabuleiro;
		}
		
		//Esse if verifica se a ilha j� foi jogada
		if(tabuleiro[posicaoJogada - 1] != '-') {
			System.out.println("Opa! Essa Ilha j� foi explorada. Escolha uma nova");
			return tabuleiro;
		}
		
		//Essas condi��es testam se o usu�rio acertou ou errou a jogada
		if((posicaoJogada - 1) == posicaoTesouro) {
			tabuleiro[posicaoJogada-1] = 'O';
			return tabuleiro;
		}else {
			tabuleiro[posicaoJogada-1] = 'X';
			return tabuleiro;
		}	
	}
	
	//Apenas mostra uma mensagem engra�adinha quando o jogador erra
	public static void avisoMantimentos(int numeroTentativas, char tabuleiro[]) {
		//Esse if verifica se a jogada do usu�rio resultou na vit�ria, caso sim,
		//a fun��o retorna (vazio) e volta para a main.
		if(verificaTabuleiro(tabuleiro) == true) {
			return;
		}	
		//Essas condi��es s�o para mostrar mensagens diferentes dependendo do n�mero de tentativas
		if(numeroTentativas == 1) {
			System.out.println("MALDI��O! DEMOS COM OS BURROS N'�GUA...");
		}else if(numeroTentativas == 2) {
			System.out.println("CUIDADO COM A PR�XIMA ESCOLHA, SEUS MANTIMENTOS EST�O ACABANDO.");
		}
	}
	
	public static boolean verificaTabuleiro(char tabuleiro[]) {
		//A vari�vel vit�ria inicia em false, se houver um caracter 'O' no tabuleiro,
		//Significa que o usu�rio venceu, ent�o ela retorna vitoria == true
		boolean vitoria = false;
		for (int i = 0; i < tabuleiro.length; i++) {
			if(tabuleiro[i] == 'O') {
				vitoria = true;
			}
		}
		return vitoria;
	}
	
	public static void limpa() {
		for (int i = 0; i < 2; i++) {
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		//Vetor � uma fileira de vari�veis do mesmo tipo
		//[1][-4][0][2][1]
		
		// Ctrl + espa�o = Auto complete
		
		/*Criar um joguinho de ca�a ao tesouro em que o tesouro
		 *Esteja escondido em uma posi��o aleat�ria do nosso tabuleiro
		 *e que o jogador tenha 3 tentativas para descobrir onde est� o tesouro
		*/
		
		char tabuleiro[] = new char[10];	
		Scanner ler = new Scanner(System.in);
		int posicaoJogada;
		
		for(int i = 0; i < tabuleiro.length; i++) {
			tabuleiro[i] = '-';
		}
		
		Random aleatorio = new Random();
		int posicaoTesouro;
		posicaoTesouro = aleatorio.nextInt(10);
		//System.out.println(posicaoTesouro);
		int numero_de_jogadas = 0;
		boolean vitoria = false;
		
		//Instru��es
		System.out.println("INSTRU��ES:");
		System.out.println("Reza a lenda que em uma das 10 ilhas do Arquip�lago das Tormentas est� escondido o tesouro de Barba Negra.");
		System.out.println("Todos os piratas que foram em busca dessas riquezas, encontraram o castigo do mar");
		System.out.println("Voc� � o capit�o da tripula��o mais corajosa dos sete mares e decide sair � procura do tesouro");
		System.out.println("Seu objetivo � procurar o tesouro nas ilhas. Mas cuidado!");
		System.out.println("Seus mantimentos ser�o suficientes para apenas tr�s tentativas. Boa viagem...");
		
		limpa();
		
		do {
			imprimeTabuleiro(tabuleiro);
			System.out.printf("Escolha a ilha que deseja explorar: ");
			posicaoJogada = ler.nextInt();
			jogada(posicaoJogada, posicaoTesouro, tabuleiro);
			vitoria = verificaTabuleiro(tabuleiro);	
			numero_de_jogadas++;
			System.out.println();
			avisoMantimentos(numero_de_jogadas, tabuleiro);
			limpa();
		} while (numero_de_jogadas < 3 && vitoria == false);
		
		if(vitoria == true) {
			imprimeTabuleiro(tabuleiro);
			System.out.printf("Voc� encontrou o tesouro! Seu nome estar� para sempre na hist�ria dos piratas");
		}else {
			imprimeTabuleiro(tabuleiro);
			System.out.println("Famintas e derrotadas, as almas de sua tripula��o agora agonizam eternamente no arm�rio de Davy Jones");
		}
		System.out.println("\nFIM DE JOGO!");		
	}
}
