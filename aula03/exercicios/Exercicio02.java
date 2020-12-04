import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // Escreva um programa que exiba a tabuada do número digitado pelo usuário.
        
        System.out.println("Digite um número para ver sua tabuada de 0 a 10:");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int cont = 0;
        int result = 0;

        while (cont <= 10){
            result = cont * numero;
            System.out.printf("%d x %d = %d\n", numero, cont, result);
            cont ++;
        }
        teclado.close();
    }
}
