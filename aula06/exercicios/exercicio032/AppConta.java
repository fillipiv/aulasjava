package exercicios.exercicio032;

import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limiteConta;
        ContaCorrente cc = null;
        ContaEspecial ce = null;
        ContaPoupanca cp = null;

        do {
            System.out.println("1 - nova conta corrente");
            System.out.println("2 - nova conta especial");
            System.out.println("3 - nova conta poupança");
            System.out.println("4 - consulta saldo");
            System.out.println("5 - saque");
            System.out.println("6 - deposito");
            System.out.println("7 - sair");
            System.out.println("->");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1: // Necessário usar conjuntos para não sobescrever a conta já criada
                System.out.println("Informe o número da conta:");
                numeroConta = entrada.nextInt();
                cc = new ContaCorrente(numeroConta);
                    break;

                case 2: // Necessário usar conjuntos para não sobescrever a conta já criada
                System.out.println("Informe o número da conta:");
                numeroConta = entrada.nextInt();
                System.out.println("Informe o limite da conta:");
                limiteConta = entrada.nextDouble();
                ce = new ContaEspecial(numeroConta, limiteConta);
                    break;

                case 3: // Necessário usar conjuntos para não sobescrever a conta já criada
                System.out.println("Informe o número da conta:");
                numeroConta = entrada.nextInt();
                cp = new ContaPoupanca(numeroConta);
                    break;
                case 4: // Necessário usar conjuntos para buscar o valor da conta correta
                System.out.println(cc);
                System.out.println(ce);
                System.out.println(cp);
                    break;
                case 5:
                System.out.println("Informe o valor de saque:");
                    break;
                case 6:
                System.out.println("informe o valor de depósito:");
                    break;
                case 7:
                System.out.println("Obrigado, volte sempre!");
                    break;

                default: // se não for nenhum dos outros
                System.out.println("opção inválida!");
                    break;
            }

        } while (opcao != 7);
        entrada.close();

    }
}
