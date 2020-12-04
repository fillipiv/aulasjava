import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite um número: ");
        int stop = teclado.nextInt();
        int cont = 1;

        if (stop >0){
            System.out.printf("Sequência impressa: ");
        }else{
            System.out.println("Valor inválido para a sequência.");
        }
        
        while (cont + cont <= stop && stop >0){
            System.out.printf("%d, ",cont);
            cont = cont + cont; // cont *=2;
        }
        if (stop > 0){
        System.out.printf("%d", cont);
        }
        teclado.close();
    }
}
