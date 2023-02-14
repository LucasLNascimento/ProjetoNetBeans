/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exibirmensagem;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author aluno
 */
public class ExibirMensagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i;
        JFrame janela = new JFrame ("Titulo da janela");
        janela.setBounds(50, 100, 400, 150);
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        FlowLayout flow = new FlowLayout();
        Container caixa = janela.getContentPane();
        caixa.setLayout(flow);
        for(i = 1; i <= 6; i++){
            caixa.add(new JButton("Aperte " + i));
            janela.setVisible(true);
        }
        JOptionPane.showMessageDialog(janela, "Erro, tente de novo", "ERRO", JOptionPane.WARNING_MESSAGE);
    }
    
}
