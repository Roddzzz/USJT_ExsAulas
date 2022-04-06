import javax.swing.JOptionPane;
public class Exerc11 {
    public static void main(String [] args){
        double fixo, carros, taxa , vendas;
        double comissao, porcento, finale;

        fixo = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do seu salario fixo?"));
        carros = Double.parseDouble(JOptionPane.showInputDialog("Quantos carros voce vendeu?"));
        taxa = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da sua comissao fixa para cada carro vendido?"));
        vendas = Double.parseDouble(JOptionPane.showInputDialog("Qual valor total de suas vendas?"));

        comissao = carros + taxa;
        porcento = vendas * 0.05;
        finale = fixo + comissao + porcento;

        JOptionPane.showMessageDialog(null, "O seu salario final eh de: " + finale + " reais");

    }
    
}
