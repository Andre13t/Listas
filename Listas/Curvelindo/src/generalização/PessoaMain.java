package generalização;



public class PessoaMain {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("nome");
		pessoa.setNome("teta katP");
		pessoa.setEndereco("rua piP");
		System.out.println(pessoa);
		
		PessoaFisica pessoaFisica = new PessoaFisica("nome teta","rua pi2");
		pessoaFisica.setNome("AndreF");
		pessoaFisica.setEndereco("rua sei laF");
		pessoaFisica.setCpf("032432129");
		pessoaFisica.setEstadoCivil("SolteiroF");
		System.out.println(pessoaFisica);
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica("empresa TetaMaster", "Rua pi3");
		pessoaJuridica.setNome("TetaJ");
		pessoaJuridica.setEndereco("Rua piJ");
		pessoaJuridica.setCnpj("123123123123");
		pessoaJuridica.setTipoEmpresa("empresa de aluguel de bikeJ");
		System.out.println(pessoaJuridica);
		
		
	}

}
