package exercicios.exercicio033;

import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limiteConta, valor;
        GerenciaConta contas = new GerenciaConta();

        do {
            System.out.println("1 - nova conta corrente");
            System.out.println("2 - nova conta especial");
            System.out.println("3 - nova conta poupança");
            System.out.println("4 - consulta saldo");
            System.out.println("5 - saque");
            System.out.println("6 - deposito");
            System.out.println("7 - sair");
            System.out.print("-> ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1: // Abertura Conta Corrente
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    contas.novaContaCorrente(numeroConta);
                    break;

                case 2: // Abertura Conta Especial (id, limite)
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o limite da conta:");
                    limiteConta = entrada.nextDouble();
                    contas.novaContaEspecial(numeroConta, limiteConta);
                    break;

                case 3: // Abertura Conta Poupança
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;

                case 4: // Saldo conta
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println(contas.exibirSaldo(numeroConta)); 
                    break;

                case 5: // Saque conta
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o valor de saque:");
                    valor = entrada.nextDouble();

                    if(contas.sacar(numeroConta, valor)){
                        System.out.println("Operação realizada.");
                    }else{
                        System.out.println("Saque não realizado.");
                    }
                    break;

                case 6: // Deposito conta
                    System.out.println("Informe o número da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("informe o valor de depósito:");
                    valor = entrada.nextDouble();

                    if(contas.depositar(numeroConta, valor)){
                        System.out.println("Operação realizada.");
                    }else{
                        System.out.println("Depósito não realizado.");
                    }
                    break;

                case 7: // Sair
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
