package Decorator;

public class WhatsAppDecorator extends NotificacionDecorator {
    public WhatsAppDecorator(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void notificar() {
        System.out.println("Notificación enviada por WhatsApp");
    }
}
