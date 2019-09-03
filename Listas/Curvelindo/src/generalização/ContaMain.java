package generalização;

public class ContaMain {
	public static void main(String[] args) {

		Conta conta = new Conta(00, 000);
		conta.setAgencia(13);
		conta.setBanco(" AKI - Juros Abusivos");
		conta.setNumeroConta(999);
		conta.setSaldo(300.0);
		System.out.println(conta);

		ContaSimples contaSimples = new ContaSimples(00, 000);
		contaSimples.setAgencia(14);
		contaSimples.setBanco("Aqui jas seu futuro");
		contaSimples.setNumeroConta(888);
		contaSimples.setSaldo(1000.0);
		contaSimples.setSaldoPolpanca(200);
		System.out.println(contaSimples);

		ContaEspecial contaEspecial = new ContaEspecial(00, 000);
		contaEspecial.setAgencia(15);
		contaEspecial.setBanco("Empreste x e pagque 2x");
		contaEspecial.setlimiteEspecial(500);
		contaEspecial.setNumeroConta(777);
		contaEspecial.setSaldo(1100);
		contaEspecial.setSaldoEspecial(500);
		System.out.println(contaEspecial);

		// verificaçao
		System.out.println("deposito de 30 na conta" + conta.deposito(30));
		System.out.println("Saque na conta de 330: " + conta.saque(330));
		System.out.println("deposito na popanca de 3003 na conta simples: " + contaSimples.depositoPoupanca(3003));
		System.out.println("saque na poupanca de 4003: " + contaSimples.saquePoupanca(3203));
		System.out.println("Saque na conta especial de 1000: " + contaEspecial.saqueEspecial(1000));

	}
}
