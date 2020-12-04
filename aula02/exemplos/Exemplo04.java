package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome");
        nome = teclado.nextLine();

        // nome == Fillipi -> não usar
        // nomr.equals("Fillipi") -> OK
        if (nome.equalsIgnoreCase("Fillipi")){
            System.out.println("Olá Fillipi");
        }else{
            System.out.println("Você não é o Fillipi");
        }
        teclado.close();
    }
}
