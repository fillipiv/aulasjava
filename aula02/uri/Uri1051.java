package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario = teclado.nextDouble();
        boolean intervalo1 = salario >= 0 && salario <= 2000;
        boolean intervalo2 = salario >=2000.01 && salario <=3000;
        boolean intervalo3 = salario >=3000.01 && salario <=4500;
        boolean intervalo4 = salario >4500.00;
        double imposto;

        if (intervalo1) {
            System.out.printf("Isento\n");
        }else{
            if(intervalo2) {
                imposto = (salario - 2000) * 0.08;
                System.out.printf("R$ %.2f\n", imposto);
            }else{
                if (intervalo3){
                    imposto = (1000 * 0.08 + (salario - 3000) * 0.18);
                    System.out.printf("R$ %.2f\n", imposto); 
                }else{
                    if (intervalo4){
                        imposto = (1000 * 0.08 + 1500 * 0.18 + (salario - 4500) * 0.28);
                        System.out.printf("R$ %.2f\n", imposto); 
                    }
                }
            }
        }
    teclado.close();
    }
}
