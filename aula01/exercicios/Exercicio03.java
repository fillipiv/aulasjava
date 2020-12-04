package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    // Faça um programa que leia o salário de um funcionário, Sabendo que o salário teve aumento de 25%
    // calcule o novo salário

    public static void main(String[] args) {
        
        //declara variáveis
        double salarioAtual;
        double salarioNovo;
        double aumento;

        //Atribui aumento 25%
        aumento = 1.25;

        //Pede, recebe e exibe o salário atual
        System.out.println("Digite o salário atual do funcionário");
        Scanner teclado = new Scanner(System.in);
        salarioAtual = teclado.nextDouble();
        System.out.println("Salário atual do funcionário: " + salarioAtual);

        //Fecha o teclado
        teclado.close();

        //Calcula e exibe o novo salário
        salarioNovo = salarioAtual * aumento;
        System.out.println("Novo salário com aumento de 25% será: " + salarioNovo);
    }
}
