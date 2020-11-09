package teste;

public class TesteCarro {
		public static void main(String args[]) {
			
		Carro meuCarro = new Carro();
		meuCarro.cor = "A que molha elas";
		meuCarro.modelo = "O que cabe mais mulher";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		
		meuCarro.liga();
		
		meuCarro.acelera(0);
		System.out.println(meuCarro.velocidadeAtual);
		System.out.println(meuCarro.pegaMarcha());
			
		}
}
