package contaAvancada;

public class CartaoDeCredito {

	private int numero;
	private String operadora;
	private double limite;
	private String tipoDecatao;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getTipoDecatao() {
		return tipoDecatao;
	}

	public void setTipoDecatao(String tipoDecatao) {
		this.tipoDecatao = tipoDecatao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CartaoDeCredito [numero=");
		builder.append(numero);
		builder.append(", operadora=");
		builder.append(operadora);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", tipoDecatao=");
		builder.append(tipoDecatao);
		builder.append("]");
		return builder.toString();
	}

}
