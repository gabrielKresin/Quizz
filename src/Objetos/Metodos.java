package Objetos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Metodos {

    static private ArrayList<Perguntas> perguntas = new ArrayList<>();

    public static ArrayList<Perguntas> getPerguntas() {
        return perguntas;
    }
    private static int quantAcertos = 0;

    public int getQuantAcertos() {
        return quantAcertos;
    }
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
        p.getPerguntasPrimeiraGuerra().add(p);
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
        p = new Perguntas("Quando os alemães se renderam?", "a)22 de junho de 1945.", "b)7 de maio de 1945.", "c)5 de novembro de 1945.", "d)1 de janeiro de 1945.", "b");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("“Esta guerra, de fato, é uma continuação da anterior.” (Winston Churchill, em discurso feito no Parlamento em 21 de agosto de 1941) A afirmativa acima confirma a continuidade latente de problemas não solucionados na Primeira Guerra Mundial, que contribuíram para alimentar antagonismos e levaram à eclosão da Segunda Guerra Mundial. Entre esses problemas, identificamos:", "a) o crescente nacionalismo econômico e o aumento da disputa por mercados consumidores e por áreas de investimentos.", "b) o desenvolvimento do imperialismo chinês da Ásia, com abertura para o Ocidente.", "c) os antagonismos austro-ingleses em torno da questão da Alsácia-Lorena;", "d) a oposição ideológica que fragilizou os vínculos entre os países, enfraquecendo todo tipo de nacionalismo;", "a");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("Em relação à Segunda Guerra Mundial, é correto afirmar que:", "a) Hitler empreendeu uma implacável perseguição aos judeus, que resultou na morte de seis milhões de pessoas.", "b) os norte-americanos permaneceram neutros na guerra até 1941, quando bombardearam Hiroshima e Nagasaki.", "c) de Gaulle foi o chefe do governo de Vichy.", "d) com o ataque alemão a Pearl Harbor, os norte-americanos resolveram entrar na guerra.", "a");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("O rompimento pelos nazistas do Pacto Germano-Soviético firmado entre a Alemanha e a União das Repúblicas Socialistas Soviéticas (URSS), no ano de 1939, fez com que a União Soviética entrasse na Segunda Guerra em 1943. O que foi o Pacto Germano-Soviético?", "a)Política de acordos efetivada por Hitler e Churchill.", "b)Efetivação do Pacto anti-Komintern entre Alemanha, URSS e Japão.", "c)Política de acordos entre Hitler e Stálin de não agressão e neutralidade entre Alemanha e União Soviética por dez anos.", "d)Pacto que assegurava à Alemanha o direito de incorporar territórios poloneses com a permissão da França e da Inglaterra.", "c");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("Quem era o primeiro-ministro britânico quando o Reino Unido declarou guerra à Alemanha nazista?", "a)Neville Chamberlain.", "b)Margaret Thatcher.", "c)Winston Churchill.", "d)Clement Atlee.", "c");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("Para combater as vantagens tecnológicas superiores americanas, qual foi a chocante tática militar que os japoneses levaram para a guerra e que teve um efeito devastador em 1944?", "a)Tática do kamikaze.", "b)Tática do Envolvimento duplo.", "c)Tática da guerra relâmpago.", "d)Tática de guerrilha.", "a");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("Qual foi a famosa tática militar usado pelos alemães na segunda guerra mundial?", "a)Blitzkrieg.", "Blitzcrank", "Blitz Brigade", "Barnblitz", "a");
        p.getPerguntasSegundaGuerra().add(p);
        p = new Perguntas("A Guerra do Vietnã, símbolo da resistência do povo vietnamita, submeteu as forças militares americanas a sua mais fragorosa derrota. Para os vietnamitas, a presença americana no Sudeste da Ásia apenas substituía as forças colonialistas da:", "a) França.", "b) Inglaterra.", "c) Holanda.", "d) Bélgica", "a");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("Entre 1961 e 1973, um total de 57.939 norte-americanos morreram no conflito da Indochina, a mais longa e custosa guerra externa na história dos Estados Unidos. A Força Aérea dos EUA jogou sobre o Vietnã uma tonelagem de bombas, mais de três vezes superior ao que foi jogado na Alemanha durante a Segunda Guerra. Considerando-se a Guerra do Vietnã, é correto afirmar que:", "a) o conflito foi motivado pela intenção do governo norte-americano de impedir a expansão do comunismo no Sudeste asiático.", "b) os norte-americanos deram apoio decidido às ações de seu governo no Vietnã e manifestaram insatisfação quando suas tropas foram retiradas de lá.", "c) os vietnamitas que enfrentavam o exército dos EUA lutavam em condições difíceis, pois não dispunham de apoio externo.", "d) a saída das tropas norte-americanas e a subsequente derrota das forças locais pró-Ocidente levou à divisão do Vietnã.", "a");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("Acerca da participação norte-americana na Guerra do Vietnã, marque a alternativa incorreta.", "a) durante o conflito, os Estados Unidos se utilizaram de armas químicas como o agente laranja, que causou graves problemas ambientais na região.", "b) a interferência americana tinha como objetivo impedir que os comunistas do Norte do Vietnã tomassem o poder do país e evitar que o comunismo se espalhasse pelo sudeste asiático.", "c) a entrada dos Estados Unidos no conflito se deu após o suposto ataque norte-vietnamita contra a embarcação americana USS Maddox.", "d) a saída americana do conflito se deu após a derradeira derrota na Batalha de Dien Bien Phu.", "d");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("Durante o período histórico que ficou conhecido como GUERRA FRIA, a disputa entre o capitalismo e o comunismo, tivemos um conflito no sudeste asiático a GUERRA DO VIETNÃ. Entre as vários músicas de protesto dessa época, aponte a alternativa que mostra a música e o autor:", "a)The Beatles - Hey Jude.", "b)Master of War - Bob Dylan.", "c)The Beatles - Revolucion.", "d)Caetano Veloso - Alegria, Alegria.", "b");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("Uma das peças de teatro que causou grande impacto no cenário teatral mundial e que fez muito sucesso no Brasil. As músicas dessa peças viraram \"músicas de protesto\" contra a Guerra do Vietnã. Qual o nome dessa peça que lembra alguma parte do nosso corpo?", "a)Hair.", "b)Head.", "c)Cabaret.", "d)The dogs.", "a");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("Na realidade os Estados Unidos foram derrotados na Guerra do Vietnã, mas no cinema surge um personagem que quer mudar a realidade, mostrando o lado americano que só teve sucesso no filmes. Quem seria esse personagem e ator?", "a)Rambo - Jet Lee.", "b)Rambo - Jason Statham.", "c)Rambo - Teery Crees.", "d)Rambo - Sylvester Stallones.", "d");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("Uma das frases que se tornaram muito conhecida na década de 1960, referente a Guerra do Vietnã e com um pequena mudança foi utilizada no programa de humor de Jô Soares. Qual era essa frase utilizada pelos jovens cabeludos daquela época?", "a)Faça amor, não faça guerra.", "b)Faça filho, não faça guerra.", "c)Faça guera, não faça amor.", "d)Não faça nada, não faça guerra.", "a");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("Qual o nome da bomba invediária, também conhecido por fogo líquido utilizada pelos estadunidenses na guerra do vietnã?", "a)Napalm.", "b)Claymore.", "c)Molotov.", "d)Querosene.", "a");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("O napalm era conhecido por:", "a)Queimar as suas vítimas.", "b)Sufocar suas vítimas.", "c)Afogar suas vítimas.", "d)Paralisar suas vítimas", "a");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("O napalm foi usado em:", "a)Bombas incendiárias.", "b)Combustíveis.", "c)Bebidas", "d)Festas", "a");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("Quem eram os vietcongues?", "a)Frente Nacional para a Libertação do Vietname.", "b)Frente Internacional para a Libertação do Vietname.", "c)Exército do veitnã do sul", "d)Soldados americanos", "a");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("Quando se iniciou a guerra do vietnã?", "a)1959.", "b)1949.", "c)1979.", "d)1969.", "a");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("Quando acabou a guerra do vietnã?", "a)1975.", "b)1985.", "c)1965.", "d)1970.", "a");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("Aproximadamente, quantas pessoas morreram nessa guerra?", "a)1 milhão.", "b)0,5 milhões.", "c)100 mil.", "d)2 milhões.", "a");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("O que aconteceu com o país após a guerra?", "a)O Vietnã foi reunificado em 2 de julho de 1976 sob o regime comunista, aliado da União Soviética.", "b)O Vietnã foi reunificado em 2 de julho de 1976 sob o regime capitalista, aliado da Rússia.", "c)O Vietnã foi reunificado em 2 de julho de 1976 sob o regime comunista, aliado da Alemanha.", "d)O Vietnã foi reunificado em 2 de julho de 1976 sob o regime capitalista, aliado dos EUA.", "a");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("Algumas das consequências dessa guerra foram:", "a)A guerra arrasou campos agrícolas, destruiu casas e provocou prejuízos econômicos gravíssimos no Vietnã.", "b)Não houve consequências.", "c)A guerra arrasou campos agrícolas, destruiu casas e provocou prejuízos econômicos gravíssimos na China.", "d)A guerra gerou lucros econômicos ao Vietnã.", "a");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("Quem foi o vencedor da guerra?", "a)Vietnã do Norte.", "b)Vietnã do Sul.", "c)Vietnã do Leste.", "d)Vietnã do Oeste.", "a");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("Aproximadamente, qual foi a estimativa de feridos nessa guerra?", "a)2 milhões.", "b)10 milhões.", "c)100 mil.", "d)Não houve feridos.", "a");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("Qual foi o pretexto estadunidense para a sua entrada na guerra?", "a)Incidente do Golfo de Tonquim. Nesse incidente, a embarcação USS Maddox foi supostamente atacada duas vezes por torpedeiros norte-vietnamitas", "b)Incidente do Golfo de Bahamas. Nesse incidente, a embarcação USS Maddox foi supostamente atacada duas vezes por torpedeiros norte-vietnamitas.", "c)Ataque terrorista a Chicago.", "d)Não havia motivos.", "a");
        p.getPerguntasVietna().add(p);
        p = new Perguntas("Porque essa guerra gerou tanta repercurssão?", "a)Por conta da globalização", "b)Não gerou repercurssão.", "c)Por causa dos extraterrestres.", "d)Por que sim.", "a");
        p.getPerguntasVietna().add(p);
    }

    public void esvaziaValores() {
        perguntas.clear();
        quantAcertos = 0;
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
        
        if (reposta.equals(perguntas.get(indice).getResposta())) {
            quantAcertos++;
        }
    }

    public String realizaAjuda(int questao) {
        boolean valido = false;
        String ajuda = "";
        do {
            int indice = rand.nextInt(4);
            valido = true;
            if (indice == 1) {
                if (perguntas.get(questao).getResposta().equals("a")) {
                    valido = false;
                } else {
                    ajuda = "a";
                }
            }
            if (indice == 2) {
                if (perguntas.get(questao).getResposta().equals("b")) {
                    valido = false;
                } else {
                    ajuda = "b";
                }
            }
            if (indice == 3) {
                if (perguntas.get(questao).getResposta().equals("c")) {
                    valido = false;
                } else {
                    ajuda = "c";
                }
            }
            if (indice == 4) {
                if (perguntas.get(questao).getResposta().equals("d")) {
                    valido = false;
                } else {
                    ajuda = "d";
                }
            }
        } while (valido == false);
        return ajuda;
    }

    public String geraData() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
