package generalização;


public class PessoaFisica extends Pessoa {
	private String cpf;
	private String estadoCivil;

	// espelha aqui para nao der erro no construtor do pai
	public PessoaFisica(String nome, String endereco) {
		super(nome, endereco);
	}

	public PessoaFisica(String nome) {
		super(nome);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf.length() >= 9)
			this.cpf = cpf;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		if (estadoCivil.length() > 3)
			this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", estadoCivil=");
		builder.append(estadoCivil);
		builder.append("]");
		// agregar da classe Pessoa| super.toString pega o to string do pai
		builder.append(super.toString());
		return builder.toString();
	}

}

