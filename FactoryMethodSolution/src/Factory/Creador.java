package Factory;

public class Creador extends AbstractCreador{

	@Override
	public ITarjetaAfiliacion crearTarjeta(Type tipo) {
		switch (tipo) {
		case BASIC: 
			return new TarjetaBasica();
			
		case PREMIUM:
			return new TarjetaPremium();
			
		case VIP:
			return new TarjetaVIP();
		
		default:
			return null;
		}
	}
}
