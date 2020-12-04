
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /* Um professor leciona em 5 turmas diferentes, e cada turma possui 20 alunos.
        Escreva um programa que leia a média de cada aluno de cada uma das turmas e 
        exiba a média das notas por turna, e a média geral das turmas.
        Dica: Teste com um número de alunos e turmas menor */

        Scanner teclado = new Scanner(System.in);
        double mediaAluno, somaTurma, mediaTurma, somaGeral, mediaGeral;
        final int QTD_TURMA = 2;
        final int QTD_ALUNO = 3;
        somaTurma=0;
        somaGeral=0;
        mediaTurma=0;
        mediaGeral=0;

        for(int turma = 1; turma <= QTD_TURMA; turma++){
            for(int aluno = 1; aluno <= QTD_ALUNO; aluno++){
                System.out.printf("Informe a nota do %dº aluno da turma %d: ", turma, aluno);
                mediaAluno = teclado.nextDouble();
                somaTurma = somaTurma + mediaAluno;
                mediaTurma = somaTurma / QTD_ALUNO;
            }
            System.out.printf("Média da turma %d é %.2f\n", turma, mediaTurma);
            somaGeral = somaGeral + somaTurma;
            somaTurma=0;
        }
        mediaGeral = somaGeral / (QTD_ALUNO * QTD_TURMA); 
        System.out.printf("Média geral das turmas é %.2f", mediaGeral);

        teclado.close();
    }
}
