package views;

//import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrineiraInterface {

    public PrineiraInterface() {
        JFrame janela = new JFrame("Welcome!");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setSize(400, 300);
        janela.setVisible(true);
        janela.setLayout(null);

        JButton botao = new JButton("Entrar");
        botao.setBounds(115, 100, 150, 25);

        JLabel texto = new JLabel("Good night world");
        texto.setBounds(200, 200, 150, 50);

        JTextField input = new JTextField();
        input.setBounds(200, 300, 150, 50);

        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String mensagem = input.getText();
                texto.setText(mensagem);
            }
        });
        
    janela.add (botao);

    janela.add (texto);

    janela.add (input);
    }
}
