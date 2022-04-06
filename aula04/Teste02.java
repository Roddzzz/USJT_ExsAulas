import javax.swing.JOptionPane;
public class Teste02 {
    public static void main(String[] args) {
        int numero, cont, i;
        cont = 0;
        numero = 6;
        i = 1;
        while (i <= numero){
            if(numero % i == 0){
                cont++;
            }
            i++;
        }
        if (cont == 2){
            System.out.println("primo");
        } else {
            System.out.println("nao eh primo");
        }
    }
}
