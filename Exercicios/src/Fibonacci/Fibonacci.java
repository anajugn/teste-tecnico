package Fibonacci;
import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite a quantidade de termos");
        int numero1 = 0, numero2 = 1;
        for (int quantidadeTermos = x.nextInt(); quantidadeTermos > 0; quantidadeTermos--) {
            System.out.print(numero1 + " ");
            int numero3 = numero1 + numero2;
            numero1 = numero2;
            numero2 = numero3;
        }
        System.out.println("Fim da Sequência");

    }
}