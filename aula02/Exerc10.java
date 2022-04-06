import javax.swing.JOptionPane;
public class Exerc10 {
    public static void main(String [] args){
        double fabrica, impostos, percentual, valor;

        fabrica = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de fabrica do veiculo?"));

        impostos = fabrica * 0.45;
        percentual = fabrica * 0.28;

        valor = fabrica + impostos + percentual;

        JOptionPane.showMessageDialog(null, "O valor final do seu veiculo eh: " + valor + " reais");
    }
        
}
