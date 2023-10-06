package designerpatterms_decorator;

public class SMSDecorator extends NotificationDecorator{
    
    public SMSDecorator(Notifier notifier){
        super(notifier);
    }

    @Override
    public void sendNottification(String message) {
        super.sendNotification(message);
        System.out.println("Enviando SMS: " + message);
    }
    
}
