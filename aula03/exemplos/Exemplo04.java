import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        
        do{
            System.out.println("Digite um valor positivo:");
            valor=teclado.nextInt();
        }while (valor <= 0);

        /* Código original com while acabava com repetição
        
            System.out.println("Digite um valor positivo:");
        valor=teclado.nextInt();

        while(valor <= 0){
            System.out.println("Inválido");
            System.out.println("Digite um valor positivo:");
            valor=teclado.nextInt();
        } */

        teclado.close();
    }
}
