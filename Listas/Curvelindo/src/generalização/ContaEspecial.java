package generalização;

public class ContaEspecial extends Conta {

	private double saldoPolpanca;

	// é pra arrumar o contrutor do Conta
	public ContaEspecial(String banco, int agencia, int numeroConta, double saldo) {
		super(banco, agencia, numeroConta, saldo);
	}

	public ContaEspecial(int agencia, int numeroConta) {
		super(agencia, numeroConta);
	}

	public double getSaldoPolpanca() {
		return saldoPolpanca;
	}

	public void setSaldoPolpanca(double saldoPolpanca) {
		this.saldoPolpanca = saldoPolpanca;
	}

	public boolean depositoPoupanca(double dinheiro) {
		if (dinheiro <= 0) {
			saldoPolpanca += dinheiro;
			return true;
		} else
			return false;
	}

	public boolean saquePoupanca(double dinheiro) {
		if (dinheiro < saldoPolpanca) {
			saldoPolpanca -= dinheiro;
			return true;
		} else
			return false;
	}
}
