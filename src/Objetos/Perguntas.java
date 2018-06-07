package Objetos;

import java.util.ArrayList;

public class Perguntas {
    
    protected static ArrayList<Perguntas> perguntasPrimeiraGuerra = new ArrayList<>();
    protected static ArrayList<Perguntas> perguntasSegundaGuerra = new ArrayList<>();
    protected static ArrayList<Perguntas> perguntasVietna = new ArrayList<>();
    protected String pergunta;
    protected String alternativa1;
    protected String alternativa2;
    protected String alternativa3;
    protected String alternativa4;
    protected String resposta;

    public String getAlternativa1() {
        return alternativa1;
    }

    public void setAlternativa1(String alternativa1) {
        this.alternativa1 = alternativa1;
    }

    public String getAlternativa2() {
        return alternativa2;
    }

    public void setAlternativa2(String alternativa2) {
        this.alternativa2 = alternativa2;
    }

    public String getAlternativa3() {
        return alternativa3;
    }

    public void setAlternativa3(String alternativa3) {
        this.alternativa3 = alternativa3;
    }

    public String getAlternativa4() {
        return alternativa4;
    }

    public void setAlternativa4(String alternativa4) {
        this.alternativa4 = alternativa4;
    }

    public ArrayList<Perguntas> getPerguntasPrimeiraGuerra() {
        return perguntasPrimeiraGuerra;
    }

    public void setPerguntasPrimeiraGuerra(ArrayList<Perguntas> perguntasPrimeiraGuerra) {
        Perguntas.perguntasPrimeiraGuerra = perguntasPrimeiraGuerra;
    }

    public ArrayList<Perguntas> getPerguntasSegundaGuerra() {
        return perguntasSegundaGuerra;
    }

    public void setPerguntasSegundaGuerra(ArrayList<Perguntas> perguntasSegundaGuerra) {
        Perguntas.perguntasSegundaGuerra = perguntasSegundaGuerra;
    }

    public ArrayList<Perguntas> getPerguntasVietna() {
        return perguntasVietna;
    }

    public void setPerguntasVietna(ArrayList<Perguntas> perguntasVietna) {
        Perguntas.perguntasVietna = perguntasVietna;
    }

    public Perguntas(String pergunta, String alternativa1, String alternativa2, String alternativa3, String alternativa4, String resposta) {
        this.pergunta = pergunta;
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3 = alternativa3;
        this.alternativa4 = alternativa4;
        this.resposta = resposta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String respsota) {
        this.resposta = respsota;
    }
    
    public Perguntas(){
        
    }
        
}
