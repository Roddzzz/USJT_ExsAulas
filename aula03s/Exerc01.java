import javax.swing.JOptionPane;
public class Exerc01 {
    public static void main(String [] args){
        String nome = 
            JOptionPane.showInputDialog("Digite seu nome aqui");
        String sobrenome =
            JOptionPane.showInputDialog("Digite seu sobrenome aqui");
        
        JOptionPane.showMessageDialog(null, String.format("Ola %s! seu sobrenome eh %s", nome, sobrenome));
    }
}