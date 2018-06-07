package Objetos;

import java.util.ArrayList;

public class Jogador {
  
    private String nome;
    private String data;
    //Dia e mês ou dia mês e ano
    private int pontuacao;

    public Jogador(String nome, String data, int pontuacao) {
        this.nome = nome;
        this.data = data;
        this.pontuacao = pontuacao;
    }

    
    
    public Jogador(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        Jogador.jogadores = jogadores;
    }
    
    private static ArrayList<Jogador> jogadores = new ArrayList<>();
}
