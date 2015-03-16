
public class Main {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("134", "Nicolas", "12.345.678-9");
		
		// Service do governo é adaptado ao padrão de service privado
		PessoaServiceGoverno pessoaServiceGoverno = new PessoaServiceGovernoImpl();
		PessoaServicePrivado service = new PessoaServiceGovernoAdapter(pessoaServiceGoverno);
		service.salvarPessoa(pessoa);
	}
}
