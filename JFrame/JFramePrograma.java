package JFrame;

import javax.swing.JFrame;

public class JFramePrograma {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Primeira janela");
        //janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(800,600);
        janela.setVisible(true);
    }
}