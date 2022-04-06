//import java.math.BigDecimal;
import javax.swing.JOptionPane;
public class Exerc08 {
    public static void main(String [] args){
        double brancos, nulos, validos, total;
        double porcentagemb, porcentagemn, porcentagemv;

        brancos = Double.parseDouble(JOptionPane.showInputDialog("Quantos votos brancos teve a votacao?"));
        nulos = Double.parseDouble(JOptionPane.showInputDialog("Quantos votos nulos teve a votacao?"));
        validos = Double.parseDouble(JOptionPane.showInputDialog("Quantos votos validos teve a votacao?"));
        
        total = brancos + nulos + validos;
        porcentagemb = brancos * 100 / total;
        porcentagemn = nulos * 100 / total;
        porcentagemv = validos * 100 / total;


        JOptionPane.showMessageDialog(null, "A porcentagem e o total dos votos eh: " + total + " votos");
        JOptionPane.showMessageDialog(null, "A porcentagem e o total dos votos eh: " + porcentagemb + "%");
        JOptionPane.showMessageDialog(null, "A porcentagem e o total dos votos eh: " + porcentagemn + "%");
        JOptionPane.showMessageDialog(null, "A porcentagem e o total dos votos eh: " + porcentagemv + "%");
    }
    
}
