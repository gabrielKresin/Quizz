package Objetos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Metodos {

    private ArrayList<Perguntas> perguntas = new ArrayList<>();
    private int quantErros = 0;
    private int quantAcertos = 0;
    private int quantPulos = 0;
    private int quantAjudas = 0;
    private Random rand = new Random();

    public void preencheArrays() {
        Perguntas p = new Perguntas("Vários fatores desencadearam a Primeira Guerra Mundial, selecione um deles:", "a)O expansionismo do Império Alemão e sua transformação na maior potência industrial da Europa fizeram brotar uma enorme desconfiança entre a Alemanha e França, Inglaterra e Rússia.", "b)O expansionismo do Império Norueguês e sua transformação na maior potência industrial da Europa fizeram brotar uma enorme desconfiança entre a Alemanha e EUA, Inglaterra e Itália.", "c)O assassinato do embaixador norueguês Francisco Ferdinando.", "d)Nacionalismo de Portugal.", "a");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("Quais eram os principais países que faziam parte da Tríplice Aliança?", "a)França, Inglaterra e Itália.", "b)Alemanha, Áustria e Itália.", "c)França, Áustria e Itália.", "d)França, Inglaterra e Alemanha.", "b");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("Quantos países estavam envolvidos na primeira guerra mundial?", "a)17.", "b)19.", "c)20.", "d)15.", "a");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("Reino da Romênia, Hungria, Império Turco-Otomano e Suécia. Dentre esses quatro países, qual deles não participou da guerra?", "Reino da Romênia.", "Hungria.", "Império Turco-Otomano.", "Suécia.", "d");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("Quais eram os principais países que faziam parte da Tríplice Entente?", "a)Itália, Inglaterra e Alemanha.", "b)França, Inglaterra e Rússia.", "c)EUA, Inglaterra e Rússia.", "d)Brasil, Inglaterra e Turquia.", "b");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("Selecione a alternatica correta:", "a)A Tríplice Entente não tinha canhão de longo alcance, mas dominava os mares, graças ao poderio inglês.", "b)A Tríplice Aliança não tinha canhão de longo alcance, mas dominava os mares, graças ao poderio Alemão.", "c)As balistas, as catapultas, as canoas, os estilingues, entre outras inovações tecnológicas da época, constituíram artefatos bélicos de grande poder de destruição.", "d)Os tanques de guerra, os encouraçados, os submarinos, os obuses de grosso calibre e a aviação, entre outras inovações tecnológicas da época,não constituíram artefatos bélicos de grande poder de destruição.", "a");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("O início da Primeira Guerra (1914/1918) completou seu centenário em 2014. Conflito de grandes proporções, ela foi o resultado de disputas econômicas, imperialistas e nacionalistas numa Europa industrializada.", "a)A questão balcânica evidencia as disputas entre Alemanha e Hungria pelo controle do mar Adriático e coloca em choque os movimentos nacionalistas: pan-eslavismo, liderado pela Sérvia e o pan-germanismo, liderado pelos alemães.", "b)Apesar de ter começado a guerra como aliada da Tríplice Aliança, a Itália passou para o lado da Tríplice Entente por ter recebido uma proposta de compensações territoriais.", "c)A Rússia não permaneceu na guerra até o seu término. Por conta da Revolução socialista foi assinado um tratado com os alemães e os russos se retiraram da guerra.", "d)Quando a guerra iniciou, multidões saíram às ruas nos países envolvidos para comemorar o conflito: a lealdade e o patriotismo eram palavras de ordem.", "a");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("Sobre a participação brasileira na Primeira Guerra Mundial, é correto afirmar:", "a)O governo brasileiro declarou guerra à Alemanha, em 1914, após o torpedeamento de um navio, carregado de café, que acabara de deixar o porto de Santos.", "b)O governo brasileiro manteve-se neutro ao longo de todo o conflito devido aos interesses do ministro das relações exteriores Lauro Muller, de origem alemã.", "c)A partir de 1916, o Exército brasileiro participou de batalhas na Bélgica e no norte da França com milhares de soldados desembarcados na região.", "d)O Brasil enviou uma missão médica, um pequeno contingente de oficiais do Exército e uma esquadra naval, que se envolveu em alguns confrontos com submarinos alemães.", "d");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("A Grande Guerra deixou profundas consequências para todo o mundo. Selecione a incorreta.", "a)Redesenhou o mapa político da Europa e do Oriente Médio.", "b)Marcou a queda do capitalismo liberal.", "c)Motivou a criação da Liga das Nações.", "d)Permitiu a ascensão econômica e política do Brasil.", "d");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("Selecione a razão correta para a entrada do Brasil na Primeira Guerra.", "a)Em outubro,um navio brasileiro, o Macau, é atacado. No final de 1917, desembarca na Europa uma equipe médica e soldados para auxiliar a Entente.", "b)Em outubro,um navio brasileiro, o Chacau, é atacado. No final de 1917, desembarca na Europa uma equipe médica e soldados para auxiliar a Entente.", "c)Em 1917, o imperador da Inglaterra intima o governador brasileiro a entrar na guerra.", "d)Em 1917, o imperador da Alemão intima o governador brasileiro a entrar na guerra.", "a");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("As batalhas desenvolveram-se principalmente em:", "a)Trincheiras.", "b)Ar.", "c)Rios.", "d)No espaço.", "a");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("Os gases venenosos eram conhecidos muito antes da 1ª Guerra Mundial, mas os oficiais do exército mostravam relutância em os utilizar por que os consideravam uma arma incivilizada. Qual exército foi o pioneiro desta técnica?", "a)O exército francês.", "b)O exército alemão.", "c)O exército russo.", "d)O exército britânico.", "a");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("Selecione um dos principais gases utilizados nessa guerra:", "a)Gás mostarda.", "b)Gás chucrute.", "c)Gás ketchup.", "d)Gás maionese.", "a");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("", "", "", "", "", "");
        p.getPerguntasVietna().add(p);
    }

    public void esvaziaValores() {
        perguntas.clear();
        quantAcertos = 0;
        quantErros = 0;
        quantPulos = 0;
        quantAjudas = 0;
    }

    public ArrayList<Perguntas> geraPergundas(String assunto) {
        int quantQuestoes = 0;
        Perguntas p = new Perguntas();
        String questao = "";
        boolean repetido = true;
        int IDquestao = 0;
        if (assunto.equals("1ª Guerra Mundial")) {
            do {
                do {
                    IDquestao = rand.nextInt(20);
                    questao = p.getPerguntasPrimeiraGuerra().get(IDquestao).getPergunta();
                    repetido = false;
                    for (int i = 0; i < perguntas.size(); i++) {
                        if (questao.equals(perguntas.get(i).getPergunta())) {
                            repetido = true;
                        }
                    }
                } while (repetido == true);
                p = new Perguntas(p.getPerguntasPrimeiraGuerra().get(IDquestao).getPergunta(), p.getPerguntasPrimeiraGuerra().get(IDquestao).getAlternativa1(), p.getPerguntasPrimeiraGuerra().get(IDquestao).getAlternativa2(), p.getPerguntasPrimeiraGuerra().get(IDquestao).getAlternativa3(), p.getPerguntasPrimeiraGuerra().get(IDquestao).getAlternativa4(), p.getPerguntasPrimeiraGuerra().get(IDquestao).getResposta());
                perguntas.add(p);
                quantQuestoes++;
            } while (quantQuestoes < 13);
        } else if (assunto.equals("2ª Guerra Mundial")) {
            do {
                do {
                    IDquestao = rand.nextInt(20);
                    questao = p.getPerguntasSegundaGuerra().get(IDquestao).getPergunta();
                    repetido = false;
                    for (int i = 0; i < perguntas.size(); i++) {
                        if (questao.equals(perguntas.get(i).getPergunta())) {
                            repetido = true;
                        }
                    }
                } while (repetido == true);
                p = new Perguntas(p.getPerguntasSegundaGuerra().get(IDquestao).getPergunta(), p.getPerguntasPrimeiraGuerra().get(IDquestao).getAlternativa1(), p.getPerguntasPrimeiraGuerra().get(IDquestao).getAlternativa2(), p.getPerguntasPrimeiraGuerra().get(IDquestao).getAlternativa3(), p.getPerguntasPrimeiraGuerra().get(IDquestao).getAlternativa4(), p.getPerguntasPrimeiraGuerra().get(IDquestao).getResposta());
                perguntas.add(p);
                quantQuestoes++;
            } while (quantQuestoes < 13);
        } else {
            do {
                do {
                    IDquestao = rand.nextInt(20);
                    questao = p.getPerguntasVietna().get(IDquestao).getPergunta();
                    repetido = false;
                    for (int i = 0; i < perguntas.size(); i++) {
                        if (questao.equals(perguntas.get(i).getPergunta())) {
                            repetido = true;
                        }
                    }
                } while (repetido == true);
                p = new Perguntas(p.getPerguntasVietna().get(IDquestao).getPergunta(), p.getPerguntasPrimeiraGuerra().get(IDquestao).getAlternativa1(), p.getPerguntasPrimeiraGuerra().get(IDquestao).getAlternativa2(), p.getPerguntasPrimeiraGuerra().get(IDquestao).getAlternativa3(), p.getPerguntasPrimeiraGuerra().get(IDquestao).getAlternativa4(), p.getPerguntasPrimeiraGuerra().get(IDquestao).getResposta());
                perguntas.add(p);
                quantQuestoes++;
            } while (quantQuestoes < 13);
        }
        return perguntas;
    }

    public void verificaPergunta(int indice, String reposta) {
        if (reposta.equals(perguntas.get(indice).resposta)) {
            quantAcertos++;
        }
    }

    /*
    public void realizaAjuda(String pergunta) {
        boolean valido = false;
        do {
            int indice = rand.nextInt(4);
            for (int i = 0; i < perguntas.size(); i++) {
                if(pergunta.equals(perguntas.get(i).pergunta)){
                    if(rand == 0){
                        if(){
                            
                        }
                    }
                }
            }
        } while (valido == false);
    }
     */
     /*
    public void pulaQuestao() {

    }
     */
    
    public String geraData() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
