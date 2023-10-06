package designerpatterms_factorymethod_appburguer;

public class AngusHamburger extends Hamburger {
    public AngusHamburger() {
        super("Angus Hamburger", "Brioche", "Carne Angus");
        adicionarIngrediente("Queijo Cheddar");
        adicionarIngrediente("Bacon");
        adicionarIngrediente("Molho especial");
    }

    @Override
    public void servir() {
        System.out.println("Servindo o Angus Hamburger");
    }
}
