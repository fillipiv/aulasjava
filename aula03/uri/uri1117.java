import java.util.Scanner;

public class uri1117 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int QTD_NOTA = 2;
        double mediaAluno = 0;
        boolean notaInvalida = false;
        
        for (int i = 1; i <= QTD_NOTA; i++){
            double nota = teclado.nextDouble();
            if (nota >= 0 && nota <= 10){
                mediaAluno = mediaAluno + nota;
            } else {
                notaInvalida = true;
            }
        }
        if (notaInvalida){
            System.out.println("nota invalida");
        }else{
            System.out.printf("media = %.2f\n", (mediaAluno / QTD_NOTA));
        }

        teclado.close();
    }
}
