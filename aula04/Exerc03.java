import javax.swing.JOptionPane;
public class Exerc03 {
	public static void main(String [] args){
        int n = 
            Integer.parseInt(JOptionPane.showInputDialog("Digite seu numero aqui"));
        int numero = n;
        int m = n;
        while (n>1){
            m = m * (n-1);
            n--;
        } 
       JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " eh " + m);

    }
}
