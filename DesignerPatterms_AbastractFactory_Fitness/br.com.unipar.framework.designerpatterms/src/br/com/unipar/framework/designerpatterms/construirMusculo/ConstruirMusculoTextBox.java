package br.com.unipar.framework.designerpatterms.construirMusculo;

import br.com.unipar.framework.designerpatterms.abastractFactory.TextBox;

public class ConstruirMusculoTextBox implements TextBox{
    public void render() {
        System.out.println("Selecionou Construir Musculo TextBox!");
    }
}
