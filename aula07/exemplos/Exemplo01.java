package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;

        try{
            System.out.print("Digite um número inteiro:");
            numero1 = entrada.nextInt();
            entrada.nextLine(); // Para evitar o erro de leitura do buffer > Ocorre quando estamos fazendo leitura de textos 
            //leitura de números. Duas saídas. Executar nextline extra para mudar a linha, ou fazer a conversão de todos os inteiros
            // doubles floats e outros para número a partir de texto: numero2 = Integer.parseInt(texto);
            System.out.println("Você digitou "+ numero1);

            System.out.print("Digite um número inteiro:");
            String texto = entrada.nextLine();
            numero2 = Integer.parseInt(texto); // converte o texto em inteiro
            System.out.println("Você digitou "+ numero2);

        } catch(InputMismatchException ex){
            System.out.println("Você não digitou um número inteiro.");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        catch(Exception ex){
            System.out.println("Erro na digitação.");
            System.out.println(ex.getMessage());
            ex.printStackTrace();

        }finally{ //o que sempre tem que executar, com sucesso ou erro. Ex: Fechar conexão com banco de dados.
            System.out.println("Final do Programa");
            entrada.close();
        }
    }
}
