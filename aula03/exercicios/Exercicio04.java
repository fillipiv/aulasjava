import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        System.out.printf("Digite o %dº número: ", cont);
        int numero = teclado.nextInt();
        int soma = 0;
        
        while (numero != 0){
            soma = soma + numero;
            cont++;

            System.out.printf("Digite o %dº número: ", cont);
            numero = teclado.nextInt();
        }

        if (numero == 0 && cont != 1){
            System.out.printf("A soma dos valores é: %d", soma);
        }

        if (cont == 1){
            System.out.printf("Não foram informados valores para execução da somatória");
        }
        teclado.close();
    }
}
