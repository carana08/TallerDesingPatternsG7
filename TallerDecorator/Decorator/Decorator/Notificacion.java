package Decorator;
public class Notificacion implements Notificador {

	@Override
    public void notificar() {
        System.out.println("Notificación enviada");
    }
	
}
