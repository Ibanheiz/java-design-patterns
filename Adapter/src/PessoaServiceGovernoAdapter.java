public class PessoaServiceGovernoAdapter implements PessoaServicePrivado {
	
	private PessoaServiceGoverno service;
	
	public PessoaServiceGovernoAdapter(PessoaServiceGoverno pessoaAdapter) {
		this.service = pessoaAdapter;
	}

	@Override
	public void salvarPessoa(Pessoa pessoa) {
		String id = pessoa.getId();
		String nome = pessoa.getNome();
		String cpf = pessoa.getCpf();
		try {
			service.salvarPessoa(id, nome, cpf);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
