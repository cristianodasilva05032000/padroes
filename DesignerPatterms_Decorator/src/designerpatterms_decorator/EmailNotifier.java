package designerpatterms_decorator;

public class EmailNotifier implements Notifier{

    @Override
    public void sendNottification(String message) {
        System.out.println("Enviando Email: " + message);
    }
    
}
