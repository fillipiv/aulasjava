package exercicios;

import java.util.Scanner;

public class Exercicio02float {
    public static void main(String[] args) {
        // Faça um programa que leia duas notas de um aluno, calcule e mostre a média aritimética

        // Abre teclado e declara variáveis
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;

        //Pede a primeira nota e apresenta o que foi digitado
        System.out.println("Digite a nota 1:");
        nota1 = teclado.nextDouble();
        System.out.println("Nota 1: " + (nota1));

        //Pede a segunda nota e apresenta o que foi digitado
        System.out.println("Digite a nota 2:");
        nota2 = teclado.nextDouble();
        System.out.println("Nota 2: " + (nota2));

        //Fecha o teclado
        teclado.close();

        //Calcula a média
        media = (nota1 + nota2)/2;
        System.out.println("Média é: "+ (media));

    }
}
