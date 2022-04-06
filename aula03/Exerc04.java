import javax.swing.JOptionPane;
public class Exerc04 {
    public static void main(String [] args){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numeor de 1 a 7"));

        switch (numero){
            case 1:
                JOptionPane.showMessageDialog(null, "Segunda");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Terca");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Quarta");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Quinta");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Sexta");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sabado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Dia invalido");
                break;
        }
    }
}
