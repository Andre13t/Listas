package contaAvancada;

public class ContaSimples extends ContaBancaria{

	private double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		if (saldoPoupanca < 0)
			this.saldoPoupanca = saldoPoupanca;
	}

	public boolean depositoPouanca(double valor) {
		if (valor > 0)
			return true;
		else
			return false;
	}

	public boolean saquePoupanca(double valor) {
		if (valor <= saldoPoupanca) {
			saldoPoupanca -= valor;
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
