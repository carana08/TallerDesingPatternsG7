package Decorator;

public class SignalDecorator extends NotificacionDecorator {
    public SignalDecorator(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void notificar() {
        System.out.println("Notificación enviada por Signal");
    }
}
