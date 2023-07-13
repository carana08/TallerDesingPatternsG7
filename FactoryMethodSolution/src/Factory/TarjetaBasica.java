package Factory;

public class TarjetaBasica implements ITarjetaAfiliacion {

	private Type tipo = Type.BASIC;
	
	@Override
	public int costoAnual() {
		return 50;
	}

	@Override
	public int limiteCredito() {
		return 1000;
	}
	
	//getter
	public Type getTipo() {
		return tipo;
	}

}
