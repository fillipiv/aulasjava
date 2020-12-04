package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        //Variáveis
        double custoCarro;
        double custoFabr;
        double percentDist;
        double percentImp;
        double custoDist;
        double imp;

        //Entradas
        System.out.println("Informe o custo de fábrica do carro: ");
        Scanner teclado = new Scanner(System.in);
        custoFabr = teclado.nextDouble();
        System.out.println("Custo de fábrica do carro é: R$" + custoFabr);
        teclado.close();

        //Processamento
        percentDist = 0.28;
        custoDist = percentDist * custoFabr;
        percentImp = 0.45;
        imp = percentImp * custoFabr;
        custoCarro = custoFabr + custoDist + imp;
        
        //Saídas
        System.out.println("Custo final ao consumidor: R$" + custoCarro);
        System.out.println("Montante de imposto: R$" + imp);
    }
    
}
