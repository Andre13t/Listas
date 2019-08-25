package listaCincoExercicos;

public class Dois {
	private int numeroUm;
	private int numeroDois;

	public int getNumeroUm() {
		return numeroUm;
	}

	public void setNumeroUm(int numeroUm) {
		this.numeroUm = numeroUm;
	}

	public int getNumeroDois() {
		return numeroDois;
	}

	public void setNumeroDois(int numeroDois) {
		this.numeroDois = numeroDois;
	}

	public boolean invertido() {
		if (numeroDois < numeroUm) {
			numeroUm = numeroUm ^ numeroDois;
			numeroDois = numeroDois ^ numeroUm;
			numeroUm = numeroUm ^ numeroDois;

			return true;
		
		} else {
			return false;
		}
	}

	public int intervalo() {

		return 2;
	}

}
