package ExList;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String args[]) {
		Map<String, Aluno> mapa = new TreeMap<String, Aluno>();

		Aluno a = new Aluno("João da Silva", "JAVA", 6.8);
		Aluno b = new Aluno("Fernando", "php", 4.7);
		Aluno c = new Aluno("Lucas", "c+", 8.6);

		mapa.put("João da Silva", a);
		mapa.put("Fernando", b);
		mapa.put("Lucas", c);

		System.out.println(mapa);
		System.out.println(mapa.get("João da Silva"));

		Collection<Aluno> alunos = mapa.values();
		for (Aluno e : alunos) {
			System.out.println(e);
		}

	}
}
