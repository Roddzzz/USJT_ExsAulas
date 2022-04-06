import javax.swing.JOptionPane;
public class Exerc03OutroJeito {
	public static void main(String [] args){
        int n =
            Integer.parseInt(JOptionPane.showInputDialog("Digite aqui seu numero"));
        
        long fatorial = 1;
        for(int i = 1; i <= n; i++){
            fatorial = fatorial * i;
            System.out.println(fatorial);// explicação dada no console
        }

        JOptionPane.showMessageDialog(null, "O fatorial de: " + n + " eh " + fatorial);
    }
}
