package teste4;

public class teste_adm {
	public static void main (String args[]) {
		
		Adm marcos = new Adm("Marcos",48906,1775347,11,"Ele te ajuda nos custos");
		System.out.printf(marcos.getNome(),marcos.getCpf(),marcos.getAjudaDeCusto());
		
	}
}
