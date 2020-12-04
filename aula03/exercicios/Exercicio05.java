import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        // Escreva um programa que leia 10 número inteiros e exiba quantos são pares e quantos são impares. Use for.
        Scanner teclado = new Scanner(System.in);
        int numero, impar = 0, par = 0;
        
        for (int i = 1; i <= 10; i++){
            System.out.printf("Digite o %dº número:",i);
            numero = teclado.nextInt();
            if (numero % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }

        System.out.printf("O total de pares é: %d\nO total de impares é: %d", par, impar);
        teclado.close();
    }
}
