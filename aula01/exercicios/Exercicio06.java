package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        
        //Variáveis
        double medidaKm;
        double medidaPolegada;
        double medidaPe;
        double medidaJarda;
        double medidaMilha;

        //Entradas 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a medida em km para conversão:");
        medidaKm = teclado.nextDouble();
        System.out.printf("A medida informada é %.2fkm\n", medidaKm);
        teclado.close();

        //Processamento
        medidaMilha = medidaKm/0.62137;
        medidaJarda = medidaMilha/1760.0;
        medidaPe = medidaJarda/3.0;
        medidaPolegada = medidaPe/12.0;

        //Saída
        System.out.printf("A medida em Km equivale a:\n %.2f milhas\n %.2f jardas\n %.2f pes \n %.2f polegadas", medidaMilha, medidaJarda, medidaPe, medidaPolegada);
    }
}
