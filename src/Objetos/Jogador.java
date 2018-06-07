package Objetos;

import java.util.ArrayList;
import java.util.Date;

public class Jogador {
  
    private String nome;
    private Date data;
    private int pontuacao;

    public Jogador(String nome, Date data, int pontuacao) {
        this.nome = nome;
        this.data = data;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public static ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public static void setJogadores(ArrayList<Jogador> jogadores) {
        Jogador.jogadores = jogadores;
    }
    
    private static ArrayList<Jogador> jogadores = new ArrayList<>();
}
