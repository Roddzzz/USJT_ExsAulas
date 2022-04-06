import javax.swing.JOptionPane;
public class Exerc09 {
    public static void main(String [] args){
        double salario, percentual, resultado, novo;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salario aqui"));
        percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de reajuste do seu salario aqui (apenas em numeros)"));

        resultado = salario * percentual / 100;
        novo = salario + resultado;
        JOptionPane.showMessageDialog(null, "Seu novo salario eh: " + novo);
    }
}
