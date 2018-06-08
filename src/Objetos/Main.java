package Objetos;

import formularios.TelaInicial;
import formularios.FormAssunto1;

public class Main {
    
    public static void main(String[] args) {
       
        //FormAssunto1 f1 = new FormAssunto1();
        //f1.setVisible(true);
        
       Metodos m = new Metodos();
       m.preencheArrays();
       TelaInicial a = new TelaInicial();
       a.setVisible(true);
       
    }
}
