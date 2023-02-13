package inputescola;

import java.io.IOException;
import javax.swing.JOptionPane;

public class InputEscola {
       public static void main(String[] args) throws IOException{
        String ajuda = "";
        float nota1 = 0; float nota2 = 0; float media = 0;

        ajuda = JOptionPane.showInputDialog(null,"Entre com a nota 1: ");
        nota1 = Float.parseFloat(ajuda);

        ajuda = JOptionPane.showInputDialog(null,"Entre com a nota 2: ");
        nota2 = Float.parseFloat(ajuda);
        
        media = (nota1 + nota2)/2;
        
        JOptionPane.showMessageDialog(null, "Média: " + media);
    }
}
