package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salarioAtual = teclado.nextDouble();
        double salarioNovo;
        double reajuste;
        double percentual;

        if (salarioAtual >= 0 && salarioAtual <= 400) {
            percentual = 15;
            reajuste = percentual / 100 * salarioAtual;
            salarioNovo = salarioAtual + reajuste;
            System.out.printf("Novo salario: %.2f\n", salarioNovo);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: %.0f %%\n", percentual);
        } else {
            if (salarioAtual >= 400.01 && salarioAtual <= 800) {
                percentual = 12;
                reajuste = percentual / 100 * salarioAtual;
                salarioNovo = salarioAtual + reajuste;
                System.out.printf("Novo salario: %.2f\n", salarioNovo);
                System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                System.out.printf("Em percentual: %.0f %%\n", percentual);
            } else {
                if (salarioAtual >= 800.01 && salarioAtual <= 1200) {
                    percentual = 10;
                    reajuste = percentual / 100 * salarioAtual;
                    salarioNovo = salarioAtual + reajuste;
                    System.out.printf("Novo salario: %.2f\n", salarioNovo);
                    System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                    System.out.printf("Em percentual: %.0f %%\n", percentual);
                } else {
                    if (salarioAtual >= 1200.01 && salarioAtual <= 2000) {
                        percentual = 7;
                        reajuste = percentual / 100 * salarioAtual;
                        salarioNovo = salarioAtual + reajuste;
                        System.out.printf("Novo salario: %.2f\n", salarioNovo);
                        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                        System.out.printf("Em percentual: %.0f %%\n", percentual);
                    } else {
                        if (salarioAtual > 2000.00) {
                            percentual = 4;
                            reajuste = percentual / 100 * salarioAtual;
                            salarioNovo = salarioAtual + reajuste;
                            System.out.printf("Novo salario: %.2f\n", salarioNovo);
                            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                            System.out.printf("Em percentual: %.0f %%\n", percentual);
                        }
                    }
                }
            }
        }
        teclado.close();
    }
}
