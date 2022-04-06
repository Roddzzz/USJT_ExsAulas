import javax.swing.JOptionPane;
public class Exerc04 {
    public static void main (String [] args){
        String n = 
            JOptionPane.showInputDialog("Digite sua palavra composta por duas paavras seprada por espacos aqui");
        
        String[] espaco = n.split(" ");

        String n1 = espaco[0];
        String n2 = espaco[1];

        int cont1 = n1.length();
        int cont2 = n2.length();

        String resultado = String.format("A palavra %s contem %d letras, ja a palavra %s contem %d letras", n1, cont1, n2, cont2);
        JOptionPane.showMessageDialog(null, resultado);

    }
}
