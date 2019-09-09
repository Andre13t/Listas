package CarroMotoPessoa;

public class Carro {
	private String fabricantes;
	private String modelo;
	private String cor;
	private int ano;
	protected Pessoa pessoa;
	protected Motor motor;

	public String getFabricantes() {
		return fabricantes;
	}

	public void setFabricantes(String fabricantes) {
		if (fabricantes.length() > 3)
			this.fabricantes = fabricantes;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo.length() > 3)
			this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		if (cor.length() > 3)
			this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano >= 4)
			this.ano = ano;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [fabricantes=");
		builder.append(fabricantes);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", ano=");
		builder.append(ano);
		builder.append(", pessoa=");
		builder.append(pessoa);
		builder.append(", motor=");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}

}
