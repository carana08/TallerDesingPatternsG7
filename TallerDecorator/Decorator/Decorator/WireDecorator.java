package Decorator;

public class WireDecorator extends NotificacionDecorator  {
    public WireDecorator(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void notificar() {
        System.out.println("Notificación enviada por Wire");
    }
}
