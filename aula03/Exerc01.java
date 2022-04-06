import javax.swing.JOptionPane;
public class Exerc01 {
    public static void main(String [] args){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite seu numero aqui"));

        if (numero > 0)
            JOptionPane.showMessageDialog(null, "Numero positivo");

        
        else if (numero < 0)
            JOptionPane.showMessageDialog(null, "Numero negativo");
        
        else 
            JOptionPane.showMessageDialog(null, "Numero nulo");
        
    }
    
}
