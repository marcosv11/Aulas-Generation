package teste2;

public class TestandoFuncionario {
	public static void main (String args []) {
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Lucas");
		funcionario1.setSalario(1200);
		
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getSalario());
	}
}
