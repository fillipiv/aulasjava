package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        //Variáveis
        double salarioMinimo;
        double consumoQW;
        double precoQW;
        double gastosResid;
        double gastosResidDesc;

        //Entradas
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o salário mínimo atual: ");
        salarioMinimo = teclado.nextDouble();
        System.out.println("Salário mínimo atual: R$ " + salarioMinimo);
        
        System.out.println("Digite a quantidade de Quilowatts consumido pela residência: ");
        consumoQW = teclado.nextDouble();
        System.out.println("Consumo QW:  " + consumoQW);

        // Processamento
        precoQW = (1.0/500) * salarioMinimo;
        gastosResid = precoQW * consumoQW;
        gastosResidDesc = gastosResid * 0.85;

        //Saídas
        System.out.println("O valor atual de cada QW é: R$ " + precoQW);
        System.out.println("O gasto da residência foi de: R$ " + gastosResid);
        System.out.println("O gasto com desconto de 15% é: R$  " + gastosResidDesc);

        teclado.close();
    }
    
}
