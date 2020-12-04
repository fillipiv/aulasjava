package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor, nota100, nota50, nota20, nota10, nota5, nota2, nota1, valorSobra;

        valor = teclado.nextInt();

        nota100 = valor/100;
        valorSobra = valor%100;
        nota50 = valorSobra/50;
        valorSobra = valorSobra%50;
        nota20 = valorSobra/20;
        valorSobra = valorSobra%20;
        nota10 = valorSobra/10;
        valorSobra = valorSobra%10;
        nota5 = valorSobra/5;
        valorSobra = valorSobra%5;
        nota2 = valorSobra/2;
        valorSobra = valorSobra%2;
        nota1 = valorSobra/1;

        System.out.printf("%d\n", valor);
        System.out.printf("%d nota(s) de R$ 100,00\n", nota100);
        System.out.printf("%d nota(s) de R$ 50,00\n", nota50);
        System.out.printf("%d nota(s) de R$ 20,00\n", nota20);
        System.out.printf("%d nota(s) de R$ 10,00\n", nota10);
        System.out.printf("%d nota(s) de R$ 5,00\n", nota5);
        System.out.printf("%d nota(s) de R$ 2,00\n", nota2);
        System.out.printf("%d nota(s) de R$ 1,00\n", nota1);

        teclado.close();
    }
    
}
