package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota:");
        Double nota = teclado.nextDouble();

        if (nota < 7){
            if (nota >=5){
                System.out.println("Exame");
            }else{
                System.out.println("Reprovado");
            }
        }else{
            System.out.println("Aprovado");
        }
        teclado.close();
    }
}
