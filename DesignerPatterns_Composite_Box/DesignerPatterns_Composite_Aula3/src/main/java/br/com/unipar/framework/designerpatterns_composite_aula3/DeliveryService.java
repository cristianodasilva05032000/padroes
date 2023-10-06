package br.com.unipar.framework.designerpatterns_composite_aula3;

public class DeliveryService {
    
    private Box  box;
    
    public DeliveryService() {
        
    }
    
    public void setupOrder (Box... boxes) {
        this.box = new CompositeBox(boxes);
    }
    
    public double calculateOrderPrice() {
        return box.calculatePrice();
    }
}
