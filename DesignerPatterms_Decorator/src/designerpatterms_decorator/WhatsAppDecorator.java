package designerpatterms_decorator;

public class WhatsAppDecorator extends NotificationDecorator{
    
    public WhatsAppDecorator(Notifier notifier){
        super(notifier);
    }

    @Override
    public void sendNottification(String message) {
        super.sendNotification(message);
        System.out.println("Enviando mensagem no WhatsApp: " + message);
    }
    
}
