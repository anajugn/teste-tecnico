package Verificacao;

import java.util.Scanner;

public class VerificaLetraA {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String palavra;
            int contagem = 0;
    
            System.out.println("Informe a palavra: ");
            palavra = sc.next();
            for (int i = 0; i < palavra.length(); i++) {
                char letra = palavra.charAt(i);
    
                if (letra == 'a' || letra == 'A') {
                    contagem++;
                }
            }

            if (contagem > 0) {
                System.out.println("Na palavra \"" + palavra + "\", a letra 'a' foi encontrada " + contagem + " vezes.");
            } else {
                System.out.println("Na palavra \"" + palavra + "\", a letra 'a' não foi encontrada.");
            }
        }
    }
    
    

