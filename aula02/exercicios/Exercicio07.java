package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o sálario:");
        double salario = teclado.nextDouble();
        double imposto;
        double salarioLiq;

        if (salario <= 600){
            System.out.printf("Salário %.2f isento de INSS (inferior a R$600,00)\n", salario);
        }else{
            if (salario <= 1200){
                System.out.printf("Salário %.2f com INSS de 20%% (entre a R$600,01 e R$1200,00)\n", salario);
                imposto = 0.2*salario;
                salarioLiq = salario - imposto;
                System.out.printf("Imposto de %.2f e salário líquido %.2f\n", imposto, salarioLiq);
            }else{
                if (salario <= 2000){
                    System.out.printf("Salário %.2f com INSS de 25%% (entre a R$1200,01 e R$2000,00)\n", salario);
                    imposto = 0.25*salario;
                    salarioLiq = salario - imposto;
                    System.out.printf("Imposto de %.2f e salário líquido %.2f\n", imposto, salarioLiq);
                }else{
                    System.out.printf("Salário %.2f com INSS de 30%% (superior a R$2000,00)\n", salario);
                    imposto = 0.3*salario;
                    salarioLiq = salario - imposto;
                    System.out.printf("Imposto de %.2f e salário líquido %.2f\n", imposto, salarioLiq);
                }
            }
        }
        teclado.close();
    }
}
