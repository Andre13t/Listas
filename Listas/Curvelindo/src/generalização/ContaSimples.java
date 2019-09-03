package generalização;

public class ContaSimples extends Conta {

	private double saldoPolpanca;

	// é pra arrumar o contrutor do Conta
	public ContaSimples(String banco, int agencia, int numeroConta, double saldo) {
		super(banco, agencia, numeroConta, saldo);
	}

	public ContaSimples(int agencia, int numeroConta) {
		super(agencia, numeroConta);
	}

	public double getSaldoPolpanca() {
		return saldoPolpanca;
	}

	public void setSaldoPolpanca(double saldoPolpanca) {
		if (saldoPolpanca >= 0)
			this.saldoPolpanca = saldoPolpanca;
	}

	public boolean depositoPoupanca(double dinheiro) {
		if (dinheiro >= 0) {
			saldoPolpanca += dinheiro;
			return true;
		} else
			return false;
	}

	public boolean saquePoupanca(double dinheiro) {
		if (dinheiro <= saldoPolpanca) {
			saldoPolpanca -= dinheiro;
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPolpanca=");
		builder.append(saldoPolpanca);
		builder.append("]");
		// aqui é pra ir junto a herança do pai
		builder.append(super.toString());
		return builder.toString();
	}

}
