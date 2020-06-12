package aplication;

import service.PessoaService;

public class Main {

	public static void main(String[] args) {

		PessoaService ps = new PessoaService();
		ps.VerificaQuemEstaAssistindo("Maria");
		
	}

}
