import javax.swing.*;
import java.awt.*;
public class TesteConteiner {
    public static void main(String args[] ){
        int i;
        JFrame janela = new JFrame("Titulo da janela - Curso FIC");
        janela.setBounds(50, 100, 400, 150);// Seta posição e tamanho
        janela.setDefaultCloseOperation(WindownsConstantes.DISPOSE_ON_CLOSE);
        FlowLayout flow = new FlowLayout();// Define o layout do container
        Container caixa = janela.getContentPane();// Define o tamanho
        caixa.setLayout(flow);//Seta layout do conteiner
        for (i=1; i<=8; i++)
            caixa.add(new JButton("Botão " + i));//Adiciona um botão
        janela.setVisible(true);//Exibe a janela
    }
    
}
