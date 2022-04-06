import javax.swing.JOptionPane;
public class Exerc04 {
    public static void main(String [] args){
        int numero, anterior;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui seu numero para descobrir seu anterior"));

        anterior = numero - 1;
        JOptionPane.showMessageDialog(null, "O numero anteriro a esse eh: " + anterior);

    }
}
