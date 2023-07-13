package Decorator;

public class TelegramDecorator extends NotificacionDecorator {
    public TelegramDecorator(Notificador notificador) {
        super(notificador);
    }

   
    @Override
    public void notificar() {
        System.out.println("Notificación enviada por Telegram");
    }
}
