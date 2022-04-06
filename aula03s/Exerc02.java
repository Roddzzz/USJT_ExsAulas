import javax.swing.JOptionPane;
public class Exerc02 {
    public static void main(String [] args){
        JOptionPane.showMessageDialog(null, "Ola convidado");
        JOptionPane.showMessageDialog(null, "Sua senha deve ter pelo menos 4 caracteres, conter A ou a e possuir um numero impar");
        String senha =  
            JOptionPane.showInputDialog("Digite sua senha");
        
        int comprimento = senha.length();
        boolean A =  senha.contains("A");
        boolean a =  senha.contains("a");
        boolean impar1 = senha.contains("1");
        boolean impar3 = senha.contains("3");
        boolean impar5 = senha.contains("5");
        boolean impar7 = senha.contains("7");
        boolean impar9 = senha.contains("9");
        
        if (comprimento < 4){
            JOptionPane.showMessageDialog(null,"Sua senha deve conter mais caracteres");
        } else {
            if (A == true || a == true){
                if (impar1 == true || impar3 == true || impar5 == true || impar7 == true || impar9 == true){
                    JOptionPane.showMessageDialog(null, "Sua senha esta apta!");
            } else {
                JOptionPane.showMessageDialog(null, "Sua senha deve conter pelo menos um numero impar");
            }
            } else {
                JOptionPane.showMessageDialog(null, "Sua senha deve conter A ou a");
            }

        }
    }    
}
