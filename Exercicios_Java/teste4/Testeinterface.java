package teste4;

public class Testeinterface {
	public static void main (String args [])
	{
		ParticipanteForum participante = new ParticipanteForum();
		leitor leitor = participante;
		System.out.println("O participante está lendo: "+leitor.lendo());
		Programador programador = participante;
		String java = "JAVA";
		programador.pensando(java.toCharArray());
		System.out.println("E programando:"+ programador.digitando());
		
	}
}
