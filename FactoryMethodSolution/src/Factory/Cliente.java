package Factory;

public class Cliente {
	public static void main(String[] args) {
		/*Usuario va a crear una tarjeta*/
		
		//Crea al unico objeto CREADOR
		AbstractCreador factory = new Creador();
		
		//Se llama a crear un objeto -> TarjetaAfiliacion
		
		ITarjetaAfiliacion nuevaTarjeta = factory.crearTarjeta(Type.BASIC);
		
		//Se puede crear otra mas
		
		ITarjetaAfiliacion nuevaTarjeta2 = factory.crearTarjeta(Type.PREMIUM);
		
		//Y una mas
		
		ITarjetaAfiliacion nuevaTarjeta3 = factory.crearTarjeta(Type.VIP);
	}
}
