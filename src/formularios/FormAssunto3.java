package formularios;

import java.awt.event.ActionEvent;
import Objetos.Metodos;
import javax.swing.JLabel;
import PopUps.Popups;
import Objetos.Jogador;
import javax.swing.JOptionPane;

public class FormAssunto3 extends FrameRaiz {

    static int questao = 0;
    static int ajudas = 0;
    static int pulos = 0;
    static int indiceQuestao = 0;
    String nome = "";

    public FormAssunto3() {

        Metodos m = new Metodos();
        if (questao == 10) {
            questao = 0;
            pulos = 0;
            ajudas = 0;
            indiceQuestao = 0;
            boolean valido = false;
            do {
                try {
                    nome = JOptionPane.showInputDialog("Digite seu nome.");
                    valido = true;
                    if (nome.isEmpty()) {
                        Popups.displayErrorMessageJOP("Nome inválido!", this);
                        valido = false;
                    }
                } catch (Exception ex) {
                    Popups.displayErrorMessageJOP("Nome inválido!", this);
                    valido = false;
                }
                Jogador j = new Jogador();
                for (int i = 0; i < j.getJogadores().size(); i++) {
                    if (nome.equals(j.getJogadores().get(i).getNome())) {
                        Popups.displayErrorMessageJOP("Nome inválido!", this);
                        valido = false;
                        break;
                    }
                }
            } while (valido == false);
            
            Jogador j = new Jogador(nome, m.geraData(), m.getQuantAcertos());
            j.getJogadores().add(j);
            TelaInicial.start();
            this.dispose();

        } else {
            opcaoA.setText(m.getPerguntas().get(indiceQuestao).getAlternativa1());
            opcaoB.setText(m.getPerguntas().get(indiceQuestao).getAlternativa2());
            opcaoC.setText(m.getPerguntas().get(indiceQuestao).getAlternativa3());
            opcaoD.setText(m.getPerguntas().get(indiceQuestao).getAlternativa4());
            getPanelContent().add(new JLabel(m.getPerguntas().get(indiceQuestao).getPergunta()));
        }
    }

    public void encerraFrame() {
        this.dispose();
    }

    @Override
    protected void onConfirmClick(ActionEvent event) {
        Metodos m = new Metodos();
        String res = "";
        if ((!opcaoA.isSelected()) && (!opcaoB.isSelected()) && (!opcaoC.isSelected()) && (!opcaoD.isSelected())) {
            Popups.displayErrorMessageJOP("Selecione uma opção!", this);
            opcaoA.requestFocus();
        } else {
            if (opcaoA.isSelected()) {
                res = "a";
            } else if (opcaoB.isSelected()) {
                res = "b";
            } else if (opcaoC.isSelected()) {
                res = "c";
            } else {
                res = "d";
            }
            m.verificaPergunta(indiceQuestao, res);
            System.out.println(questao);
            questao++;
            indiceQuestao++;
            this.dispose();
            if (questao == 0) {
                this.dispose();
            }else{
                FormAssunto1 f1 = new FormAssunto1();
                f1.setVisible(true);
                
            }
        }
    }

    @Override
    protected void onCancelClick(ActionEvent event) {
        
        this.dispose();
        TelaInicial.start();
        questao = 0;
        pulos = 0;
        ajudas = 0;
        indiceQuestao = 0;
    }

    @Override
    protected void onJumpClick(ActionEvent event) {
        pulos++;
        if (pulos > 3) {
            Popups.displayErrorMessageJOP("Quantidade de pulos já permitidos já foi excedida!", this);
            opcaoA.requestFocus();
        } else {
            indiceQuestao++;
            this.dispose();
            if (questao == 0) {
                this.dispose();
            }else{
                FormAssunto1 f1 = new FormAssunto1();
                f1.setVisible(true);
                
            }
        }
    }

    @Override
    protected void onHelpClick(ActionEvent event) {
        Metodos m = new Metodos();
        if (ajudas == 0) {
            Popups.displaySuccessJOP("A alternativa " + m.realizaAjuda(questao) + " está errada!", this);
            ajudas++;
        } else {
            Popups.displayErrorMessageJOP("Número de ajudas excedido.", this);
        }
    }

}
