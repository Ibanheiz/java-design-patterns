
public class PessoaServiceGovernoImpl implements PessoaServiceGoverno {

	@Override
	public void salvarPessoa(String id, String nome, String cpf) throws Exception {
		System.out.println("Salvando a pessoa " + nome + " no serviço do governo.");
	}

}
