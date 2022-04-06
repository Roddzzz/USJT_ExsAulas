import javax.swing.JOptionPane;
public class Exerc02{
    public static void main(String [] args){
        
        double numeroum;
        double numerodois;
        double numerotres;
        double numeroquatro;
        double resultado;

        numeroum = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
        numerodois = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
        numerotres = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro numero"));
        numeroquatro = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto numero"));

        resultado = numeroum * numeroum + numerodois * numerodois + numerotres * numerotres + numeroquatro * numeroquatro;

        JOptionPane.showMessageDialog(null, resultado);
    }
}
