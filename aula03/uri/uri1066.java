import java.util.Scanner;

public class uri1066 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int QTD_VALOR = 5;
        int valor;
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for(int i=1; i <= QTD_VALOR; i++){
            valor=teclado.nextInt();
            if (valor % 2 == 0){
                par++;
            }else{
                impar++;
            }
            if (valor > 0){
                positivo++;
            }else{
                if (valor == 0){     
                }else{
                negativo++;
                }
            }
        }
        System.out.printf("%d valor(es) par(es)\n",par);
        System.out.printf("%d valor(es) impar(es)\n",impar);
        System.out.printf("%d valor(es) positivo(s)\n",positivo);
        System.out.printf("%d valor(es) negativo(s)\n",negativo);

        teclado.close();
    }
}
