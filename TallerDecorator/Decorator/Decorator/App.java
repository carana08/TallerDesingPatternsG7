package Decorator;
public class App {
	public static void main(String[] args) {
		Notificador notificacion = new Notificacion();
		notificacion = new SMS("Mensaje por sms");
		notificacion = new Email("Mensaje por email");
		notificacion = new WhatsAppDecorator(notificacion);
		notificacion = new SignalDecorator(notificacion);
		notificacion = new WireDecorator(notificacion);
		notificacion = new TelegramDecorator(notificacion);
		notificacion.notificar();
		
	}
}
