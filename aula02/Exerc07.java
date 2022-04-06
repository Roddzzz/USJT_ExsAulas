import javax.swing.JOptionPane;
public class Exerc07 {
    public static void main(String [] args){
        int idade, dias;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Coloque aqui sua idade"));

        dias = idade * 365;
        JOptionPane.showMessageDialog(null, "A sua idade em dias eh: " + dias + " dias");
    }
}
