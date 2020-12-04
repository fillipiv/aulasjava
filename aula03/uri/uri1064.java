import java.util.Scanner;

public class uri1064 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor, somaValor, mediaValor;
        somaValor = 0;
        mediaValor = 0;
        int pares = 0;
        final int QNT_VALOR = 6;

        for(int i=1; i <= QNT_VALOR; i++){
            valor = teclado.nextDouble();
            if (valor>0){
                pares++;
                somaValor = somaValor + valor;
            }
        }
        mediaValor = somaValor / pares;
        System.out.printf("%d valores positivos\n", pares);
        System.out.printf("%.1f\n", mediaValor);

        teclado.close();
    }
}
