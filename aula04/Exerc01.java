import javax.swing.JOptionPane;
public class Exerc01 {
	public static void main(String [] args){
        int n = 0;
        System.out.println("Contando ate 100");
        
        //WHILE
        
        /*while (n <= 100){
            System.out.print(" ");
            System.out.println(n);
            n++;
        }*/

        //DO-WHILE

        /*do {
            System.out.print(" ");
            System.out.print(n);
            n++;
        } while(n <= 100);*/

        //FOR

        for (int number = 0; number <= 100; number++){
            System.out.print(" ");
            System.out.println(number);
        }

    }
}
