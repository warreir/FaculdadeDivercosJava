package JFrame;

import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JFramePrograma extends JFrame{
    public JFramePrograma() {
        JTextField textlNome = new JTextField(10);
        JTextField textUsername = new JTextField(10);
        JTextField textlPassworld = new JTextField(10);
        JTextArea textArealObs = new JTextArea(10, 30);
        JLabel labelNome = new JLabel("Nome:");
        JLabel labelUsername = new JLabel("Username:");
        JLabel labelPassworld = new JLabel("Passworld:");
        JLabel labelObs = new JLabel("Obs:");
        JButton botao = new JButton("Botão");

        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(5, 2));
        pane.add(labelNome);
        pane.add(textlNome);

        pane.add(labelUsername);
        pane.add(textUsername);

        pane.add(labelPassworld);
        pane.add(textlPassworld);

        pane.add(labelObs);
        pane.add(textArealObs);

        pane.add(botao);
        this.setSize(800,600);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        JFramePrograma programa = new JFramePrograma();

    }
}