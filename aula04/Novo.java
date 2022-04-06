import javax.swing.JOptionPane;

public class Novo {
    public static void main (String [] args) {
        int num, fatorial;
        num=
Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que será efetuado a operação")
      fatorial = 1;
      
      while (num >= 1){
          fatorial = fatorial * num;
          num--;
          //System.out.println(fatorial);
      JOptionPane.showMessageDialog(null, "O fatorial do seu numero é: " + fatorial);

      }
    }
}
