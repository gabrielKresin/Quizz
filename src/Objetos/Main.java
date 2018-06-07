package Objetos;

import formularios.TelaInicial;

public class Main {
    
    public static void main(String[] args) {
       Metodos m = new Metodos();
       m.preencheArrays();
       TelaInicial a = new TelaInicial();
       a.setVisible(true);
    }
}
