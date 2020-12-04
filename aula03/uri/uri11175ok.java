import java.util.Scanner;

public class uri11175ok {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int QTD_NOTA = 2;
        double mediaAluno = 0;
        
        for (int i = 1; i <= QTD_NOTA; i++){
            double nota = teclado.nextDouble();
            if (nota >= 0 && nota <= 10){
                mediaAluno = mediaAluno + nota;
            } else {
                i--;
                System.out.println("nota invalida");
            }
        }
        System.out.printf("media = %.2f\n", (mediaAluno / QTD_NOTA));

        teclado.close();
    }
}
