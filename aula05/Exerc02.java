import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("REGRAS: AO DIGITAR 0 OU MENOR, O PROGRAMA PARARÁ AUTOMATICAMENTE!");
        System.out.println("Digite um numero");
        int numDigitado = scan.nextInt();
        int soma = 0;
        int cont = 0;
        while (numDigitado > 0){
            soma = soma + numDigitado;
            System.out.println("Digite um numero");
            numDigitado = scan.nextInt();
            cont++;

        }
        
        System.out.println("A soma dos numeros digitados é: " + soma);
        System.out.println("A quantidade dos numeros digitados é: " + cont);
        System.out.println("A media dos numeros digitados é: " + (soma / cont));
    }
}
