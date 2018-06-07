package formularios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public abstract class FrameRaiz extends JFrame{
    private JPanel panelContent;
    private JPanel panelActions;
    private JButton buttonConfirm, buttonCancel, buttonPular, buttonHelp;
    
    public FrameRaiz(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro! "+e.getMessage());
        }
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);
        panelActions = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonConfirm = new JButton("Confirm");
        buttonConfirm.addActionListener(new ConfirmActionListener());
        panelActions.add(buttonConfirm);
        buttonCancel = new JButton("Cancel");
        buttonCancel.addActionListener(new CancelActionListener());
        panelActions.add(buttonCancel);
        buttonPular = new JButton("Pular");
        buttonPular.addActionListener(new JumpActionListener());
        panelActions.add(buttonPular);
        buttonHelp = new JButton("Ajuda");
        buttonHelp.addActionListener(new HelpActionListener());
        panelActions.add(buttonHelp);
        panelContent = new JPanel();
        add(panelContent, BorderLayout.CENTER);
                
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
            onCancelClick(event);
        }
    }
  
    protected abstract void onHelpClick(ActionEvent event);
    private class HelpActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            onCancelClick(event);
        }
    }
}
