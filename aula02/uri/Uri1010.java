package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int codigo1, numero1, codigo2, numero2;
        Double valor1, valor2, fatura;

        codigo1 = teclado.nextInt();
        numero1 = teclado.nextInt();
        valor1 = teclado.nextDouble();

        codigo2 = teclado.nextInt();
        numero2 = teclado.nextInt();
        valor2 = teclado.nextDouble();

        fatura = (numero1*valor1) + (numero2*valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", fatura);
        teclado.close();
    }
}
