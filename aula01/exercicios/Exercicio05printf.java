package exercicios;

import java.util.Scanner;

public class Exercicio05printf {
    public static void main(String[] args) {
        
        //Variáveis
        double custoCarro;
        double custoFabr;
        double percentDist;
        double percentImp;
        double custoDist;
        double imp;

        //Entradas
        System.out.printf("Informe o custo de fábrica do carro:\n");
        Scanner teclado = new Scanner(System.in);
        custoFabr = teclado.nextDouble();
        System.out.printf("Custo de fábrica do carro é: R$%.2f\n", custoFabr);
        teclado.close();

        //Processamento
        percentDist = 0.28;
        custoDist = percentDist * custoFabr;
        percentImp = 0.45;
        imp = percentImp * custoFabr;
        custoCarro = custoFabr + custoDist + imp;
        
        //Saídas
        System.out.printf("Custo final ao consumidor: R$%.2f\n", custoCarro);
        System.out.printf("Montante de imposto: R$%.2f\n", imp);
    }
    
}
