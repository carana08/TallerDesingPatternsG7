package Factory;

public class TarjetaVIP implements ITarjetaAfiliacion {

	private Type tipo = Type.VIP;
	@Override
	public int costoAnual() {
		return 200;
	}

	@Override
	public int limiteCredito() {
		return 3500;
	}

	public Type getTipo() {
		return tipo;
	}
}
