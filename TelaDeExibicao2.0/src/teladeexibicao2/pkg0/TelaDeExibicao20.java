package teladeexibicao2.pkg0;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class TelaDeExibicao20 {

    public static void main(String[] args) {
        JFrame janela = new JFrame ("Cadastro de Comida"); // criação da janela principal
        janela.setBounds(750, 300, 300, 650); // tamanho da tela
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // função para abrir a tela
        
        JPanel Panel1 = new JPanel(); 
        
        JLabel text1 = new JLabel();
        text1.setText("1° ingrediente"); // nome de exibição
        JTextArea compresstext1 = new JTextArea(1,20); // tamanho da caixa texto
        
        JLabel text2 = new JLabel();
        text2.setText("2° ingrediente");
        JTextArea compresstext2 = new JTextArea(1,20);
       
        JLabel text3 = new JLabel();
        text3.setText("3° ingrediente");
        JTextArea compresstext3 = new JTextArea(1,20);
        
        JLabel text4 = new JLabel();
        text4.setText("4° ingrediente");
        JTextArea compresstext4 = new JTextArea(1,20);
        
        JLabel espaço1 = new JLabel();
        espaço1.setText("Modo de Preperado");
        JTextArea espaçoText1 = new JTextArea (6,25);
        
        JLabel espaço2 = new JLabel();
        espaço2.setText("Montagem de Prato");
        JTextArea espaçoText2 = new JTextArea (6,25);
        
        Panel1.add(text1); // adicionar o texto na tela
        Panel1.add(compresstext1);
        janela.add(Panel1); // adicionar o painel na janela
        
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
        
        JButton botão1 = new JButton("Revisar"); // criação do botão
        Panel1.add(botão1);
        
        JButton botão2 = new JButton("Voltar");
        Panel1.add(botão2);
        
        JButton botão3 = new JButton("Avançar");
        Panel1.add(botão3);

        janela.setVisible(true); // ebixir janela
    }
}