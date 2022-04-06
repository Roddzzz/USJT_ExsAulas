import javax.swing.JOptionPane;
public class Exerc01{
    public static void main(String [] args){
        //variaveis 
        double cotacao;
        double quantidade;
        double valorconvertido;
        //entrada
        //atribuição
        cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotacao"));
        quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade"));
        
        //processamento
        valorconvertido = cotacao * quantidade;
        
        //saida
        JOptionPane.showMessageDialog(null, valorconvertido);
    }
}
