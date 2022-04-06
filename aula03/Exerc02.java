import javax.swing.JOptionPane;

public class Exerc02 {
    public static void main(String [] args){
        int a, b, c;
        float raiz1, raiz2, delta;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente de a"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente de b"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente de c"));

        delta = (b * b) + (-4 * a * c);

        JOptionPane.showMessageDialog(null, "O valor de delta:" + delta);
        
        if (delta < 0){
            JOptionPane.showMessageDialog(null, "Nao apresenta raiz");
        }
        else if (delta > 0){
            JOptionPane.showMessageDialog(null, "Apresenta duas raizes");
        }
        else{
            JOptionPane.showMessageDialog(null, "Apresenta uma unica raiz");
        }
        
        raiz1 = (float) ((-(b) + Math.sqrt(delta)) / 2 * a);
        raiz2 = (float) ((-(b) - Math.sqrt(delta)) / 2 * a);
        if (delta < 0){
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Sendo elas x1: " + raiz1);
            JOptionPane.showMessageDialog(null, "Sendo elas x2: " + raiz2);
        }
        
    }
}
