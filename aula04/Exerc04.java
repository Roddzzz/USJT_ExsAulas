import javax.swing.JOptionPane;
public class Exerc04 {
	public static void main (String [] args){
        int cont = 0;
        int numero = 
            Integer.parseInt(JOptionPane.showInputDialog("digite seu numero aqui"));

        for(int i = 1; i <= numero; i++){
                if (numero % i == 0){
                    cont++;
                }
            }

        if(cont == 2){
            JOptionPane.showMessageDialog(null, "O numero eh primo");
        } else {
            JOptionPane.showMessageDialog(null, "O numero nao eh primo");
        }

    }
}
