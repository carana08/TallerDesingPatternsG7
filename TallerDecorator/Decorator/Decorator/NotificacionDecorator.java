package Decorator;
public abstract class NotificacionDecorator implements Notificador{
	private Notificador notificador;

    public NotificacionDecorator(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void notificar() {
        notificador.notificar();
    }
}
