package br.com.unipar.framework.designerpatterms;

import br.com.unipar.framework.designerpatterms.app.ContactForm;
import br.com.unipar.framework.designerpatterms.treinodeForca.TreinodeForcaFactory;

public class Designerpatterms {

    public static void main(String[] args) {
        
        new ContactForm().render(new TreinodeForcaFactory());
    }
    
}
