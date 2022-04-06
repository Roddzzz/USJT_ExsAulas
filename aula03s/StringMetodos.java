import javax.swing.JOptionPane;
public class StringMetodos{
    public static void main(String [] args) {
        
        //SOMENTE TESTE DOS EXEMPLOS DO PDF
        
        
        //METODO: lenght
        
        /* String ola = JOptionPane.showInputDialog("Digite aqui sua String");
        int comprimento = ola.length();
        JOptionPane.showMessageDialog(null, ola + " tem " + comprimento + " de caracteres"); */


        //METODO: format
        
        /*String nome = JOptionPane.showInputDialog("Digite aqui seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui sua idade"));

        String s = String.format("Ola %s, voce tem %d anos!", nome, idade);
            JOptionPane.showMessageDialog(null, s);*/

        //METODO: charAt

        /*String teste = "Hello, strings";
        int posicao = 
            Integer.parseInt(JOptionPane.showInputDialog("Digite aqui qual posicao voce quer"));
        
        String resultado = String.format("O caractere na posicao %d e %c", posicao, teste.charAt(posicao));
            JOptionPane.showMessageDialog(null, resultado);*/


        //METODO: concat

        /*String nome = 
            JOptionPane.showInputDialog("Digite seu nome aqui");
        
        String sobrenome = 
            JOptionPane.showInputDialog("Digite seu sobrenome aqui");
        
        String resultado = nome.concat(" ") .concat(sobrenome);
        JOptionPane.showMessageDialog(null, resultado);*/


        //METODO: Tolowercase e Touppercase

        /*String hello = "Hello world";
        String minusculas = hello.toLowerCase();
        String maiusculas = hello.toUpperCase();

        JOptionPane.showMessageDialog(null, String.format("%s em letras minusculas fica: %s. Ja em maiusculas, fica: %s", hello, minusculas, maiusculas));*/


        //METODO: equals e equalIgnoreCase

        /*String s1 = 
            JOptionPane.showInputDialog("Digite sua primeira string");
        String s2 =
            JOptionPane.showInputDialog("Digite sua segunda string");
        
        if (s1.equals(s2)) {
            JOptionPane.showMessageDialog(null, "Considerando as caixas, elas sao iguais");
        }
        else {
            JOptionPane.showMessageDialog(null, "Considerando as caixas, elas nao sao iguais");
        }

        if (s1.equalsIgnoreCase(s2)){
            JOptionPane.showMessageDialog(null, "Desconsiderando as caixas, elas sao iguais");
        } else {
            JOptionPane.showMessageDialog(null, "Desconsiderando as caixas, elas nao sao iguais");
        }*/

        //METODO: compareTo

        /*String s1 = 
            JOptionPane.showInputDialog("Digite sua palavra aqui");
        String s2 =    
            JOptionPane.showInputDialog("Digite aqui sua segunda palavra");
        
        int resultado = s1.compareTo(s2);

        if (resultado < 0) {
            JOptionPane.showMessageDialog(null, "A segunda palavra vem depois da primeira");
        } else if (resultado > 0){
            JOptionPane.showMessageDialog(null, "A segunda palavra vem antes da primeira");
        } else {
            JOptionPane.showMessageDialog(null, "As duas palavras ocupam a mesma posicao no dicionario");
        }*/
        
    }
}