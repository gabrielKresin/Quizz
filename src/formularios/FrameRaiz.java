package formularios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

public abstract class FrameRaiz extends JFrame{
    protected JPanel panelContent;
    protected JPanel panelActions;
    protected JButton buttonConfirm, buttonCancel, buttonPular, buttonHelp;
    protected JRadioButton opcaoA, opcaoB, opcaoC, opcaoD;
    
    public FrameRaiz(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro! "+e.getMessage());
        }
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);
        setSize(2000, 800);
        panelActions = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
        buttonConfirm = new JButton("Confirmar");
        buttonConfirm.setBounds(800, 700, 40, 100);
        buttonConfirm.addActionListener(new ConfirmActionListener());
        panelActions.add(buttonConfirm);
        
        
        buttonCancel = new JButton("Sair");
        buttonCancel.addActionListener(new CancelActionListener());
        panelActions.add(buttonCancel);
        buttonConfirm.setBounds(200, 700, 40, 100);
        
        buttonPular = new JButton("Pular");
        buttonPular.addActionListener(new JumpActionListener());
        panelActions.add(buttonPular);
        buttonPular.setBounds(300, 700, 40, 100);
        
        buttonHelp = new JButton("Ajuda");
        buttonHelp.addActionListener(new HelpActionListener());
        panelActions.add(buttonHelp);
        buttonHelp.setBounds(400, 700, 40, 100);
        
        opcaoA = new JRadioButton();
        opcaoA.setLocation(100, 100);
        
        opcaoB = new JRadioButton();
        opcaoB.setLocation(100, 200);
        
        opcaoC = new JRadioButton();
        opcaoC.setLocation(100, 300);
        
        opcaoD = new JRadioButton();
        opcaoD.setLocation(100, 400);
        
        ButtonGroup opcoes = new ButtonGroup();
        opcoes.add(opcaoA);
        opcoes.add(opcaoB);
        opcoes.add(opcaoC);
        opcoes.add(opcaoD);
        
        panelActions.add(buttonHelp);
        panelContent = new JPanel();
        add(panelContent, BorderLayout.CENTER);
        panelContent.add(buttonConfirm);
        panelContent.add(buttonCancel);
        panelContent.add(buttonPular);
        panelContent.add(buttonHelp);
        panelContent.add(opcaoA);
        panelContent.add(opcaoB);
        panelContent.add(opcaoC);
        panelContent.add(opcaoD);   
        
    }
    public JPanel getPanelContent() {
        return panelContent;
    }
    
    protected abstract void onConfirmClick(ActionEvent event);
    private class ConfirmActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            onConfirmClick(event);
        }
    }
    
     protected abstract void onCancelClick(ActionEvent event);
    private class CancelActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            onCancelClick(event);
        }
    }
    
    protected abstract void onJumpClick(ActionEvent event);
    private class JumpActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            onJumpClick(event);
        }
    }
  
    protected abstract void onHelpClick(ActionEvent event);
    private class HelpActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            onHelpClick(event);
        }
    }
}
