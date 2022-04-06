import javax.swing.JOptionPane;
public class Exerc06 {
    public static void main(String [] arg){
        int ano,quatro,cem,quatrocentos;
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano aqui"));

        quatro = ano % 4;
        cem = ano % 100;
        quatrocentos = ano % 400;

        if(quatro == 0 && cem != 0)
            JOptionPane.showMessageDialog(null, "O ano eh bissexto");
        else if(quatrocentos == 0)
            JOptionPane.showMessageDialog(null, "O ano eh bissexto");
        else 
            JOptionPane.showMessageDialog(null, "O ano nao eh bissexto");
    }
    
}
