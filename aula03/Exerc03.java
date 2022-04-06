import javax.swing.JOptionPane;
public class Exerc03 {
    public static void main(String [] args){
        double a,b,c;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu primeiro numero"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu segundo numero"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu terceiro numero"));

        if (a > b  && a > c) 
            JOptionPane.showMessageDialog(null, "Esse eh o maior numero: " + a);
        else if (b > a && b > c) 
            JOptionPane.showMessageDialog(null, "Esse eh o maior numero: " + b);  
        else if (c > b && c > a)
            JOptionPane.showMessageDialog(null,"Esse eh o maior numero: " + c);
    }
    
}
