import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, soma, cont;
        // final int QTDE_NOTAS = 6; // constante quando digitamos o final, não possível alterar em outro ponto
        // É escrito em maiusculo com _ entre nomes compostos por convensão e melhor prática java.

        cont = 1; // contador
        soma = 0; // acumulador ou somador

        while(cont < 6){ // QTDE_NOTAS em vez de 6 para poder alterar quando necessario o valor
            System.out.println("Digite o valor");
            valor = teclado.nextInt();
            soma = soma + valor;
            cont++;
        }
        System.out.println("Soma = " + soma);
        teclado.close();
    }
}
