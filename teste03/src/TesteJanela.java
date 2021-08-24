import javax.swing.*;
public class TesteJanela {
//Objeto Janela
public static void main(String args[] ){
    final JFrame janela = JFrame("Título ");
    janela.setBounds(50, 100, 400, 150);// Seta posição e tamanho
    janela.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
    janela.setVisible(true); // Exibe a janela
}   
}
