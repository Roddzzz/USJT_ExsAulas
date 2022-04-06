import javax.swing.JOptionPane;
public class Exerc01 {
    public static void main(String[] args) {
        int n1 = 
            Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o primeiro numero"));
        int n2 = 
            Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o segundo numero"));
        
        Object[] selecao = {"Adição", "Subtração", "Multiplicação", "Divisão",};
        Object valorSelecionado = JOptionPane.showInputDialog(null, "Selecione a operação", "Operação", JOptionPane.INFORMATION_MESSAGE, null, selecao, selecao[0]);
        
        if (valorSelecionado == "Adição"){
            JOptionPane.showMessageDialog(null, n1 + n2);
        } else if (valorSelecionado == "Subtração"){
            JOptionPane.showMessageDialog(null, n1 - n2);
        } else if (valorSelecionado == "Multiplicação"){
            JOptionPane.showMessageDialog(null, n1 * n2);
        } else if (valorSelecionado == "Divisão"){
            JOptionPane.showMessageDialog(null, n1 / n2);
        }
        
        int opcao = JOptionPane.showConfirmDialog(null,"Deseja voltar para realizar mais operações?",
          "Escolha um",JOptionPane.YES_NO_OPTION); //0 yes 1 no
        
        
        int n = opcao + 0;
        while (n == 0){
            int n3 = 
            Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o primeiro numero"));
        int n4 = 
            Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o segundo numero"));
        
        Object[] selecao2 = {"Adição", "Subtração", "Multiplicação", "Divisão",};
        Object valorSelecionado2 = JOptionPane.showInputDialog(null, "Selecione a operação", "Operação", JOptionPane.INFORMATION_MESSAGE, null, selecao, selecao[0]);
        
        if (valorSelecionado2 == "Adição"){
            JOptionPane.showMessageDialog(null, n3 + n4);
        } else if (valorSelecionado2 == "Subtração"){
            JOptionPane.showMessageDialog(null, n3 - n4);
        } else if (valorSelecionado2 == "Multiplicação"){
            JOptionPane.showMessageDialog(null, n3 * n4);
        } else if (valorSelecionado2 == "Divisão"){
            JOptionPane.showMessageDialog(null, n3 / n4);
        }
        n = JOptionPane.showConfirmDialog(null,"Deseja voltar para realizar mais operações?",
        "Escolha um",JOptionPane.YES_NO_OPTION); //0 yes 1 no
        }


    }
}
