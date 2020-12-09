package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // Codifique uma calculadora para representar as operações básicas de soma,
        // subtração, multiplicação e DIVISÃO.
        // Como é bem sabído, não existe divisão cujo denominador seja 0, por exemplo
        // 5/0. Caso isso acontecesse, o JVM
        // iria abortar a execução do programa. Trate essa exceção de modo que o usuário
        // tenha a possibilidade de reparar
        // o erro e digitar um novo valor para o segundo operando.

        Scanner entrada = new Scanner(System.in);
        double n1, n2, result;
        boolean erro = true;

        do {
            try {
                System.out.println("Digite dois números:");
                n1 = Double.parseDouble(entrada.nextLine());
                n2 = Double.parseDouble(entrada.nextLine());

                result = n1 / n2;

                System.out.printf("%f / %f = %f\n", n1, n2, (n1 / n2));
                System.out.println(result);

                erro = false;

            } catch (InputMismatchException ex) {
                System.out.println("Entrada inválida. Tente novamente.");
            } catch (NumberFormatException ex) {
                System.out.println("O número dever ser digitado com '.' no decimal.");
            } catch (ArithmeticException ex) {
                System.out.println("Divisor não pode ser 0");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        } while (erro);

        entrada.close();
    }
}
