package uri;

import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valor = teclado.nextDouble();
        boolean intervalo1 = valor >= 0 && valor <= 25;
        boolean intervalo2 = valor > 25 && valor <= 50;
        boolean intervalo3 = valor > 50 && valor <= 75;
        boolean intervalo4 = valor > 75 && valor <= 100;

        if (intervalo1){
            System.out.println("Intervalo [0,25]");
        }else{
            if(intervalo2){
                System.out.println("Intervalo (25,50]"); 
            }else{
                if (intervalo3){
                    System.out.println("Intervalo (50,75]");
                }else{
                    if (intervalo4){
                        System.out.println("Intervalo (75,100]");
                    }else{
                        System.out.println("Fora de intervalo");
                    }
                }
            }
        }

        teclado.close();
    }
}
