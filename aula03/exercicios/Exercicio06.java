import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        // Faça um programa que receba 10 números inteiros, calcule e mostre a média dos valores pares e a
        //porcentagem de números ímpares entre todos os números digitados

        // NaN = Not a Number, caso utilize 0 como pares, não faria uma divisão valida e não retornaria número
        Scanner teclado = new Scanner(System.in);
        int numero = 0, par = 0, somaPar = 0;
        final int QNTD_NUM = 10;

        for (int cont = 1 ; cont <= QNTD_NUM ; cont++){
            System.out.printf("Digite o %dº número:", cont);
            numero = teclado.nextInt();

            if (numero % 2 == 0){
                somaPar = somaPar + numero;
                par++;
            }
        }
        if(par > 0){
            System.out.printf("Média dos valores pares: %.2f\n", (double)somaPar / par);
        }else{
            System.out.printf("Nenhum número par foi digitado.\n");
        }
        System.out.printf("Porcentagem de números impares: %.2f%%", (double) (QNTD_NUM - par) / QNTD_NUM * 100);
        teclado.close();
    }
}
