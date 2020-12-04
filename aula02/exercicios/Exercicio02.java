package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;
        
        System.out.println("Informe as notas das duas provas:");
        nota1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();
        
        //peso 1 - 40%
        //peso 2 - 60%
        media = nota1 * 0.4 + nota2 * 0.6;

        if (media >=6){
            System.out.printf("Aluno aprovado com média %.1f\n", media);
        }else{
            System.out.printf("Aluno reprovado com média %.1f\n", media);
        }
        teclado.close();
    }
}
