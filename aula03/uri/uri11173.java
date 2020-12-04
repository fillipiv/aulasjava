import java.util.Scanner;

public class uri11173 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double mediaAluno = 0;
        double media1 = 0;
        double media2 = 0;
        boolean notaInvalida = false;
        
        media1 = teclado.nextDouble();
        media2 = teclado.nextDouble();

        if (media1 >= 0 && media1 <= 10){
            mediaAluno = mediaAluno + media1;
        } else {
            notaInvalida = true;
        }

        if (media2 >= 0 && media2 <= 10){
            mediaAluno = mediaAluno + media2;
        } else {
            notaInvalida = true;
        }

        if (notaInvalida){
            System.out.println("nota invalida");
        }else{
            System.out.printf("media = %.2f", (mediaAluno / 2));
        }

        teclado.close();
    }
}
