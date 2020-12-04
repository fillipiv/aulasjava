package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a senha:");
        String senha = teclado.nextLine();
        String senhaCorreta = "R10p5";

        if (senha.equals(senhaCorreta)){ //senha case sensitive
            System.out.println("Acesso concedido");
        }else{
            System.out.println("Acesso negado");
        }
        teclado.close();
    }
}
