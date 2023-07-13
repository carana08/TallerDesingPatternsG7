package Decorator;
public class Email implements Notificador {
	
	
	public Email(String mensaje) {
		System.out.println(mensaje);
    }

	@Override
	public void notificar() {
		// TODO Auto-generated method stub
		System.out.println("Notificación enviada por correo electrónico");
		
	}
}
