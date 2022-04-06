import javax.swing.JOptionPane;
public class Exerc03 {
    public static void main(String [] args){
        double preco, quantidade, total, comissao;

        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do produto escolhido"));
        quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de produtos"));

        total = preco * quantidade; 
        comissao = total * 0.05;
        
        JOptionPane.showMessageDialog(null, "Valor a pagar: " + comissao);
    }
} 
