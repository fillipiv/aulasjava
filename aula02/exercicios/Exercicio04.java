package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double parcela, salario;

        System.out.println("Digite o valor da parcela do empréstimo e salário bruto:");
        parcela = teclado.nextDouble();
        salario = teclado.nextDouble();

        if (parcela <= (0.3 * salario)) {
            System.out.printf("Parcela de R$%.2f é permitida para salário bruto R$%.2f\n", parcela, salario);
        }else{
            System.out.printf("Parcela de R$%.2f NÃO é permitida para salário bruto R$%.2f\n", parcela, salario);
        }
        teclado.close();
    }
}
