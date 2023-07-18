/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author daniel_g_gomes
 */
public class Desijava {
    public static void main(String[] agrs) {
    metodoJoption();
}
    public static void metodoJoption(){
        
        JOptionPane.showInputDialog("Good night world!");
        
        String nome = JOptionPane.showInputDialog("Informe seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade"));
        
        int compartilhar = JOptionPane.showConfirmDialog(null, "Quer compartilhar suas informações?");
        if (compartilhar == JOptionPane.YES_OPTION){
            System.out.println("Suas informações irão ser compartilhadas daqui para frente");
        } else if(compartilhar == JOptionPane.NO_OPTION){
            System.out.println("Suas informações não serão compartilhadas");
        } else if(compartilhar == JOptionPane.CANCEL_OPTION){
            System.out.println("Cadastro cancelado");
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "...");
        JOptionPane.showMessageDialog(null, "Você sabe, você não acredita em si mesmo", "Falhou como sempre", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void metodoScanner() {...31 linhas}
}
