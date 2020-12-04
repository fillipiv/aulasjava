package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    // Escreva um método em Java que encontre o menor entre três números inteiros
    // fornecidos como parâmetros
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 3 valores inteiros");
        int numeroA = teclado.nextInt();
        int numeroB = teclado.nextInt();
        int numeroC = teclado.nextInt();
        int menor = (menorNumero(numeroA, numeroB, numeroC));

        System.out.printf("Menor número é: %d", menor);

        teclado.close();
    }

    public static int menorNumero(int valorA, int valorB, int valorC) {
        if (valorA <= valorB && valorA <= valorC) {
            return valorA;
        } else {
            if (valorB <= valorA && valorB <= valorC) {
                return valorB;
            } else {
                return valorC;
            }
        }
    }
}

//Solução alternativa
// ambas estão no one note
