package exercicios.exercicio01;

import java.util.Scanner;

public class AppAnimal {
    public static void main(String[] args) {

        /*
         * Animal a = new Animal("Pablo", "SRD", "preto", 2019, "Fillipi e Nicolle",
         * "(11)99999-9999");
         * 
         * System.out.println(a); System.out.println(a.getProp());
         * System.out.println(a.getAnimal());
         */

        Scanner entrada = new Scanner(System.in);
        int opcao;
        String nome, raca, cor, nomeProp, telefone;
        int anoNasc;
        GerenciarAnimal animal = new GerenciarAnimal();


/*      animal1.novoAnimal("Pablo", "SRD", "preto", 2019, "Fillipi e Nicolle", "(11)99999-9999");
        animal2.novoAnimal("Jaspion", "SRD", "preto", 2019, "Robson", "(11)99999-9999");
        animal3.novoAnimal("Pablo", "Rotwiler", "preto", 2019, "Robson", "(11)99999-9999"); */

        do {
            System.out.println("1 - Cadastrar animal e proprietário");
            System.out.println("2 - Listar animais");
            System.out.println("3 - Listar proprietários por raça");
            System.out.println("7 - sair");
            System.out.print("-> ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1: // Cadastrar animal e proprietário
                    System.out.println("Informas os seguintes dados:");
                    System.out.print("Nome do animal:");
                    nome = entrada.nextLine();
                    System.out.print("Raça do animal:");
                    raca = entrada.nextLine();
                    System.out.print("Cor do animal:");
                    cor = entrada.nextLine();
                    System.out.print("Ano de nascimento do animal:");
                    anoNasc = entrada.nextInt();
                    System.out.print("Nome do proprietário:");
                    nomeProp = entrada.nextLine();
                    System.out.print("Telefone do proprietário:");
                    telefone = entrada.nextLine();
                    animal.novoAnimal(nome, raca, cor, anoNasc, nomeProp, telefone);
                    break;

                case 2: // Listar animais
                    //animal.listarAnimais();
                    System.out.println(animal.listarAnimais());
                    break;

                case 3: // Listar proprietários por raça
                    System.out.println("Informe a raça:");
                    raca = entrada.nextLine();
                    //animal.listarRaca(raca);
                    System.out.println(animal.listarRaca(raca));
                    break;

                case 4: // Sair
                    System.out.println("Até a próxima!");
                    break;

                default: // se não for nenhum dos outros
                    System.out.println("opção inválida!");
                    break;
            }

        } while (opcao != 4);
        entrada.close();
    }
}
