package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double nota1, nota2, nota3, media;

        nota1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();
        nota3 = teclado.nextDouble();

        media = ((nota1*2) + (nota2*3) + (nota3*5)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

        teclado.close();
    }
}
