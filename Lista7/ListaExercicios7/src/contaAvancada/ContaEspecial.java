package contaAvancada;

public class ContaEspecial {
	private float limite;
	protected CartaoDeCredito cartaoDeCredito;
	
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public CartaoDeCredito getCartaoDeCredito() {
		return cartaoDeCredito;
	}
	public void setCartaoDeCredito(CartaoDeCredito cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}
	
	public boolean saque(float valor) {
		
		return true;
	}

}
