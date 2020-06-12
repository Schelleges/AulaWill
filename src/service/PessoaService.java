package service;

import java.util.ArrayList;
import java.util.List;

import domain.Pessoa;

public class PessoaService {
	
	private final static String JOAO = "João";
	private final static String MARIA = "Maria";
	

	public List<Pessoa> listPessoas() {
		List<Pessoa> listPessoa = new ArrayList<>();

		Pessoa pessoa = new Pessoa();
		pessoa.setName("João");
		pessoa.setIdade("30");
		pessoa.setPrograma("Jornal");
		listPessoa.add(pessoa);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setName("Maria");
		pessoa2.setIdade("28");
		pessoa2.setPrograma("Receita");
		listPessoa.add(pessoa2);

		Pessoa pessoa3 = new Pessoa();
		pessoa3.setName("Yago");
		pessoa3.setIdade("3");
		pessoa3.setPrograma("Desenho");
		listPessoa.add(pessoa3);

		return listPessoa;
	}

	public void VerificaQuemEstaAssistindo(String name) {

		for (Pessoa pessoas : listPessoas()) {

			if (name.equals(pessoas.getName())) {
				System.out.println("Quem esta assistindo e o " + pessoas.getName() + "\n Ele tem " + pessoas.getIdade()
						+ " anos" + " e esta assistindo " + pessoas.getPrograma());
			}
		}
	}

}
