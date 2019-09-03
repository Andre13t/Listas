package generalização;

public class ContaEspecial extends Conta {

	private double limiteEspecial;
	private double saldoEspecial;

	// é pra arrumar o contrutor do Conta
	public ContaEspecial(String banco, int agencia, int numeroConta, double saldo) {
		super(banco, agencia, numeroConta, saldo);
	}

	public ContaEspecial(int agencia, int numeroConta) {
		super(agencia, numeroConta);
	}

	public double getSaldoEspecial() {
		return saldoEspecial;
	}

	public void setSaldoEspecial(double saldoEspecial) {
		this.saldoEspecial = saldoEspecial;
	}

	public double getlimiteEspecial() {
		return limiteEspecial;
	}

	public void setlimiteEspecial(double limiteEspecial) {

		this.limiteEspecial = limiteEspecial;
	}

	public boolean depositoEspecial(double dinheiro) {
		if (dinheiro <= 0) {
			saldoEspecial += dinheiro;
			return true;
		} else
			return false;
	}

	public boolean saqueEspecial(double dinheiro) {
		if (dinheiro < saldoEspecial) {
			saldoEspecial -= dinheiro;
			return true;
		} else if (dinheiro <= limiteEspecial + saldoEspecial) {
			saldoEspecial -= dinheiro;
			limiteEspecial -= (saldoEspecial * -1);
			saldoEspecial = 0;
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [limiteEspecial=");
		builder.append(limiteEspecial);
		builder.append(", saldoEspecial=");
		builder.append(saldoEspecial);
		builder.append("]");
		// aqui é pra ir junto a herança do pai
		builder.append(super.toString());
		return builder.toString();
	}
	
}
