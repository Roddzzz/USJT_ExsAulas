import javax.swing.JOptionPane;
public class Exerc05 {
    public static void main(String [] args){
        double base, altura, area;

        base = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui quantos centimetros da base tem o retangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui quantos centimetros de altura tem o retangulo"));

        area = base * altura;
        JOptionPane.showMessageDialog(null, "A area do seu retangulo eh: " + area);

    }
    
}
