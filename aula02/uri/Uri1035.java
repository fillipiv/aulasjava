package uri;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de variáveis
        int valorA = teclado.nextInt();
        int valorB = teclado.nextInt();
        int valorC = teclado.nextInt();
        int valorD = teclado.nextInt();

        if (valorB > valorC && 
        valorD > valorA && 
        (valorC + valorD > valorA + valorB) &&
        (valorC >= 0 ) &&
        (valorD >= 0 ) &&
        (valorA %2 == 0)) {
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
        teclado.close();
    }
}
