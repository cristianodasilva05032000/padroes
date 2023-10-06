package br.com.unipar.framework.designerpatterms.app;

import br.com.unipar.framework.designerpatterms.abastractFactory.WidgetFactory;

public class ContactForm {
    
   public void render (WidgetFactory factory){
       factory.createButton().render();
       factory.createTextBox().render();
   } 
}
