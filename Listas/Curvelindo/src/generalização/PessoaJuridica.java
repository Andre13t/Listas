package generalização;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private String tipoEmpresa;

	// espelha aqui para nao der erro no construtor do pai
	public PessoaJuridica(String nome, String endereco) {
		super(nome, endereco);
	}

	public PessoaJuridica(String nome) {
		super(nome);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (cnpj.length() >= 12)
			this.cnpj = cnpj;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		if (tipoEmpresa.length() > 3)
			this.tipoEmpresa = tipoEmpresa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaJuridica [cnpj=");
		builder.append(cnpj);
		builder.append(", tipoEmpresa=");
		builder.append(tipoEmpresa);
		builder.append("]");
		// agregar da classe Pessoa| super.toString pega o to string do pai
		builder.append(super.toString());
		return builder.toString();
	}

}
