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
        p = new Perguntas("Aproximadamente, quantos soldados morreram durante a guerra?", "a)10 milhões.", "b)20 milhões.", "c)30 milhões.", "d)1 milhão.", "a");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("Aproxiamdamente, qual a estimativa dos gastos dessa guerra?", "a)180 bilhões de dólares.", "b)350 bilhões de dólares.", "c)90 bilhões de dólares.", "d)2 bilhões de dólares.", "a");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("Quem venceu a guerra?", "a)Os aliados.", "b)Os impérios centrais.", "c)Os comunistas.", "d)Os petistas.", "a");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("A preocupação em isolar a França e obter o maior número possível de aliados caracterizou a política de um chefe de governo europeu no período de 1871 e 1890. Estamos no referindo a:", "a)Lloyd George.", "b)Bismarck.", "c)Guilherme II.", "d)Cavour.", "b");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("Em 1914, a crise balcânica atingiu um momento de grande tensão, quando a Áustria e a Sérvia entraram em atrito devido ao (à):", "a)Patrocínio da independência da Albânia pela Áustria, privando a Sérvia de uma saída para o mar.", "b)Anexação da Bósnia e Herzegovina pela Áustria.", "c)Tentativa da Rússia de anexar a Sérvia.", "d)Tentativa da Áustria de anexar a Sérvia.", "b");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("Qual dos países abaixo NÃO esta alinhado com as chamadas \"Potências Centrais\" durante a I Grande Guerra?", "a)Turquia.", "b)Bulgária.", "c)Sérvia.", "d)Alemanha.", "c");
        p.getPerguntasPrimeiraGuerra().add(p);
        p = new Perguntas("Em todos os sistemas de alianças formados por Bismarck, qual o país que foi sistematicamente excluído?", "a)Itália.", "b)Rússia.", "c)Áustria.", "d)França.", "d");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("Qual foi o período de tempo da 2ª Guerra Mundial?", "a)1914-1918.", "b)1914-1935.", "c)1939-1945.", "d)1945-1947.", "c");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("Qual o nome dos dois lados dos combatentes?", "a)Eixo e Lado.", "b)Eixo e Aliado.", "c)Combatentes e Aliados.", "d)Aliados e Nazistas.", "b");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("Que grupo étnico foi principalmente afetado pelos nazistas?", "a)Judeus.", "b)Negros.", "c)Asiáticos.", "d)Esquerdistas", "a");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("Sobre a crise de 29, marque a alternativa que responde qual pais ficou seriamente afetado e chegou a acusar um certo grupo por ser o culpado da crise.", "a)EUA.", "b)França.", "c)Alemanha.", "d)Itália.", "c");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("Que invasão desencadeou a segunda guerra mundial?", "a)A invasão da Rússia.", "b)A invasão da Polônia.", "c)A invasão da Polônia.", "d)A invasão da Sérvia.", "c");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("Quais foram as duas cidades atacadas por bombas nucleares.", "a)Hiroshima e Nagasaki.", "b)Tokio e Paris.", "c)Brasilia e São Pualo.", "d)Berlim e Rio de Janeiro.", "a");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("Que pais era governado por Mussolini?", "Alemanha", "França", "Rússia", "Itália", "d");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("O Estados Unidos entrou na guerra motivado pelo(a):", "a)Invasão da França por tropas italianas.", "b)Política de implantação do Plano Marshall, que favorecia a industrialização do país.", "c)Afundamento, no Oceano Pacífico, de navios de países aliados, como o Brasil.", "d)Ataque japonês à base naval americana de Pearl Harbor.", "d");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("Os anos posteriores à Segunda Guerra Mundial foram tensos entre as grandes potências mundiais. Considerando-se a Organização do Tratado do Atlântico Norte (OTAN) e o Pacto de Varsóvia, criados nesse período, é CORRETO afirmar que:", "a)a OTAN visava a apaziguar os conflitos relacionados à divisão da cidade de Berlim, bem como a proteger os países sob sua influência econômica das ameaças de invasão externa e de conflitos militares.", "b)ambos desenvolveram políticas que incentivaram a chamada corrida armamentista, que, durante o período da Guerra Fria, colocou o Planeta sob a ameaça de uma guerra nuclear.", "c)ambos foram estabelecidos, simultaneamente, para defender os interesses dos países que disputavam, após a Segunda Guerra, uma reordenação dos espaços europeu e americano.", "d)os países signatários do Pacto de Varsóvia se aliaram e, para defender seus interesses financeiros, formaram um bloco econômico, a fim de competir com a Alemanha, a Inglaterra e os Estados Unidos.", "b");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("A primeira metade do século XX foi marcada por conflitos e processos que a inscreveram como um dos mais violentos períodos da história humana. Entre os principais fatores que estiveram na origem dos conflitos ocorridos durante a primeira metade do século XX estão:", "a)a crise do colonialismo, a ascensão do nacionalismo e do totalitarismo.", "b)o enfraquecimento do império britânico, a Grande Depressão e a corrida nuclear.", "c)o declínio britânico, o fracasso da Liga das Nações e a Revolução Cubana.", "d)a corrida armamentista, o terceiro-mundismo e o expansionismo soviéticoa corrida armamentista, o terceiro-mundismo e o expansionismo soviético", "a");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("Quem lançou o ataque a Pearl Harbor? ", "a)União Soviética.", "b)Japão.", "c)França.", "d)Alemanha.", "b");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("Qual foi o primeiro país a ser invadido pelas tropas da Alemanha, e que desencadeou o começo da Segunda Guerra Mundial?", "a)Polônia.", "b)Grã-Bretanha.", "c)França.", "d)EUA.", "a");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("Qual batalha foi a mais sangrenta de toda a guerra?", "a)Batalha de Stalingrado.", "b)Btalha de Ardenas.", "c)Batlha de Barbados.", "d)Batalha de Chicago.", "a");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("Quando os alemães se renderam?", "a).", "b).", "c).", "d).", "");
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
