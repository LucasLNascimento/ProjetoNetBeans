package teladeexibicao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class TelaDeExibicao {

    public static void main(String[] args) {
        int i;
        JFrame janela = new JFrame ("Cadastro de Comida");
        janela.setBounds(750, 300, 300, 650);
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        JPanel Panel1 = new JPanel();
        
        JLabel text1 = new JLabel();
        text1.setText("1° comida ");
        JTextArea compresstext1 = new JTextArea(1,20);
        
        JLabel text2 = new JLabel();
        text2.setText("2° comida ");
        JTextArea compresstext2 = new JTextArea(1,20);
       
        JLabel text3 = new JLabel();
        text3.setText("3° comida ");
        JTextArea compresstext3 = new JTextArea(1,20);
        
        JLabel text4 = new JLabel();
        text4.setText("4° comida ");
        JTextArea compresstext4 = new JTextArea(1,20);
        
        JLabel espaço1 = new JLabel();
        espaço1.setText("Modo de Preperado");
        JTextArea espaçoText1 = new JTextArea (6,25);
        
        JLabel espaço2 = new JLabel();
        espaço2.setText("Montagem de Prato");
        JTextArea espaçoText2 = new JTextArea (6,25);
        
        Panel1.add(text1);
        Panel1.add(compresstext1);
        janela.add(Panel1);
        
        Panel1.add(text2);
        Panel1.add(compresstext2);
        janela.add(Panel1);
        
        Panel1.add(text3);
        Panel1.add(compresstext3);
        janela.add(Panel1);
        
        Panel1.add(text4);
        Panel1.add(compresstext4);
        janela.add(Panel1);
        
        Panel1.add(espaço1);
        Panel1.add(espaçoText1);
        janela.add(Panel1);
        
        Panel1.add(espaço2);
        Panel1.add(espaçoText2);
        janela.add(Panel1);
        
        JButton botão1 = new JButton("Revisar");
        Panel1.add(botão1);
        
        JButton botão2 = new JButton("Voltar");
        Panel1.add(botão2);
        
        JButton botão3 = new JButton("Avançar");
        Panel1.add(botão3);

        janela.setVisible(true);
    }
}
