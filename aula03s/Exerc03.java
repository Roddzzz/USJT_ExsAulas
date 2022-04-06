import javax.swing.JOptionPane;
public class Exerc03 {
	public static void main(String [] args){
        String s = 
            JOptionPane.showInputDialog("Digite aqui sau palavra");
        
        int n1 = 
            Integer.parseInt(JOptionPane.showInputDialog("Digite aqui seu primeiro numero"));
        int n2 = 
            Integer.parseInt(JOptionPane.showInputDialog("Digite aqui seu segundo numero"));
        
        int n1r = n1 - 1;//modo mais facil de entendimento, pois na realidade em string contamos o 0
        int n2r = n2 + 1;//para contar o ultimo numero tambem
        String resultado = s.substring(n1r, n2r);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
