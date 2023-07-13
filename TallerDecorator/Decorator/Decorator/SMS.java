package Decorator;
public class SMS implements Notificador{
	
	public SMS(String mensaje) {
		System.out.println(mensaje);
    }
	
    @Override
    public void notificar() {
        System.out.println("Notificación enviada por SMS");
    }
}
