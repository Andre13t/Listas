package homeTheater;

public class SistemaDeSom extends EquipamentoEletronico {

	private String marca;
	private String modelo;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca.length() > 3)
			this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo.length() > 3)
			this.modelo = modelo;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		if (potencia > 0)
			this.potencia = potencia;
	}

	private float potencia;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaDeSom [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", potencia=");
		builder.append(potencia);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}

