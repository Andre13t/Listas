package homeTheater;

public class EquipamentoEletronico {
	private float tencao;
	private float consumo;

	public float getTencao() {
		return tencao;
	}

	public void setTencao(float tencao) {
		if (tencao > 0)
			this.tencao = tencao;
	}

	public float getConsumo() {
		return consumo;
	}

	public void setConsumo(float consumo) {
		if (consumo > 0)
			this.consumo = consumo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EquipamentoEletronico [tencao=");
		builder.append(tencao);
		builder.append(", consumo=");
		builder.append(consumo);
		builder.append("]");
		return builder.toString();
	}

}
