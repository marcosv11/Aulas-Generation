package teste3;

public class TestePessoa {
	public static void main (String args [])
	{
		Pessoa jessica = new Pessoa("Jessica",15533);
		Funcionario1 pedro = new Funcionario1("Pedro",12233,"Manutenção");
		Pessoa maria = new Funcionario1("Maria",1392,"TI");
		Pessoa jose = new Coordenador("Jose",92839,"Matematica");
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getMatricula());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getMatricula());
	}
}
