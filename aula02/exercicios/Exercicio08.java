package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe os 3 comprimentos:");
        int ladoA = teclado.nextInt();
        int ladoB = teclado.nextInt();
        int ladoC = teclado.nextInt();

        if ((ladoA > (ladoB + ladoC)) || (ladoB > (ladoC + ladoA)) || (ladoC > (ladoB + ladoA))){
            System.out.println("Comprimentos informados NÃO formam um triângulo");
        }else{
            if ((ladoA == ladoB) && (ladoA == ladoC)){
                System.out.println("Comprimentos informados formam um TRIÂNGULO EQUILÁTERO");
            }else{
                if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)){
                    System.out.println("Comprimentos informados formam um TRIÂNGULO ISÓSCELES");
                }else{
                    System.out.println("Comprimentos informados formam um TRIÂNGULO ESCALENO");
                }
            }
        }
        teclado.close();
    }
}
