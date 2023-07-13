package Factory;

public class TarjetaPremium implements ITarjetaAfiliacion {

	private Type tipo = Type.PREMIUM;
	@Override
	public int costoAnual() {
		return 100;
	}

	@Override
	public int limiteCredito() {
		return 2000;
	}
	
	public Type getTipo() {
		return tipo;
	}

}
