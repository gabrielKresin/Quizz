package Objetos;

import java.util.ArrayList;

public class Perguntas {
    
    protected static ArrayList<String> perguntasPrimeiraGuerra = new ArrayList<>();
    protected static ArrayList<String> perguntasSegundaGuerra = new ArrayList<>();
    protected static ArrayList<String> perguntasVietna = new ArrayList<>();

    public ArrayList<String> getPerguntasPrimeiraGuerra() {
        return perguntasPrimeiraGuerra;
    }

    public void setPerguntasPrimeiraGuerra(ArrayList<String> perguntasPrimeiraGuerra) {
        this.perguntasPrimeiraGuerra = perguntasPrimeiraGuerra;
    }

    public ArrayList<String> getPerguntasSegundaGuerra() {
        return perguntasSegundaGuerra;
    }

    public void setPerguntasSegundaGuerra(ArrayList<String> perguntasSegundaGuerra) {
        this.perguntasSegundaGuerra = perguntasSegundaGuerra;
    }

    public ArrayList<String> getPerguntasVietna() {
        return perguntasVietna;
    }

    public void setPerguntasVietna(ArrayList<String> perguntasVietna) {
        this.perguntasVietna = perguntasVietna;
    }
    
}
