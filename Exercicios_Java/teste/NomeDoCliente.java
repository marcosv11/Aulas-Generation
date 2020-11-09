package teste;

public class NomeDoCliente {
	public static void main (String args [])
	{
		Cliente cliente1 = new Cliente("Ana","Livia","Tres");
		System.out.println(cliente1.getNomeCompleto());
		
		Cliente cliente2 = new Cliente("Anderson","Rocha","Tadeu");
		System.out.println(cliente2.getNomeCompleto());
	}

}
