package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // Escreva um método em java que receba um número inteiro fornecido como parâmetro
        // e retorne se o número é par ou não

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número para verificar se é par: ");
        int numero = teclado.nextInt();
        if (par(numero)){
            System.out.printf("Número %d é par\n", numero);
        } else{
            System.out.printf("Número %d não é par\n", numero);
        }

        ehPar(numero);
        
        teclado.close();
    }

    public static boolean par(int numero){
        boolean ehPar = false;
        if (numero % 2 == 0){
            ehPar = true;
        }
        return ehPar;
    }

    // Outra solução:
    public static void ehPar(int numero){
        if (numero % 2 == 0){
            System.out.printf("Número %d é par\n", numero);
        }else{
            System.out.printf("Número %d não é par\n", numero);
        }
    }
}
