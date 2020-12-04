package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // Faça um programa que leia duas notas de um aluno, calcule e mostre a média aritimética

        Scanner teclado = new Scanner(System.in);
        int nota1;
    

        System.out.println("Digite a nota 1 número inteiro:");
        nota1 = teclado.nextInt();
        System.out.println("Nota 1: " + (nota1));


        int nota2;

        System.out.println("Digite a nota 2 número inteiro:");
        nota2 = teclado.nextInt();
        System.out.println("Nota 2: " + (nota2));

        teclado.close();
        int media;
        media = (nota1 + nota2)/2;
        System.out.println("Média inteira é: "+ (media));

    }
}
