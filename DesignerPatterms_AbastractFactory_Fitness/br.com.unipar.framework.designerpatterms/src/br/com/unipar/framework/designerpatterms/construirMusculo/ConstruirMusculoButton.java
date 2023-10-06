package br.com.unipar.framework.designerpatterms.construirMusculo;

import br.com.unipar.framework.designerpatterms.abastractFactory.Button;

public class ConstruirMusculoButton implements Button{
    public void render() {
        System.out.println("Selecionou Construir Musculo Botão!");
    }
}
