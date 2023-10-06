package designerpatterms_decorator;

abstract class NotificationDecorator implements Notifier{
    protected Notifier notifier;
    
    public NotificationDecorator( Notifier notifier) {
        this.notifier = notifier;
    }
    
    public void sendNotification(String message) {
        notifier.sendNottification(message);
    }
}
