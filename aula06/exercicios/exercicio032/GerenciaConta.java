package exercicios.exercicio032;

import java.util.ArrayList;

public class GerenciaConta {
    private ArrayList<Conta> listaContas;
    // para evitar duplicidade de contas, em vez de utilizar Array, podemos mudar para Árvore
    // Ou, no momento de criação da conta, em vez da pessoa gerar o número, termos um método da criação do número
    // Ou, utilizar um hash map e maximizar a performance de busca de contas! private HashMaps<Conta> listaContas;
    // Solução do HASH no exercicio033 desta aula
    

    public GerenciaConta() {
        listaContas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
        /*
         * ContaCorrente cc = new ContaCorrente(numeroConta); listaContas.add(cc);
         */
        // Feito em só uma linha:
        listaContas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limiteConta) {
        listaContas.add(new ContaEspecial(numeroConta, limiteConta));
    }

    public void novaContaPoupanca(int numeroConta) {
        listaContas.add(new ContaPoupanca(numeroConta));
    }

    public String exibirSaldo(int numeroConta) {
        for (Conta c : listaContas) { // para cada conta na lista contas
            if (c.getConta() == numeroConta) {
                return c.toString();
            }
        }
        return "Conta não encontrada, verifique o número informado.";
    }

    public boolean sacar(int numeroConta, double valor) {
        for (Conta c : listaContas) { // para cada conta na lista contas
            if (c.getConta() == numeroConta) {
                return c.sacar(valor);
            }
        }
        return false;
    }

    public boolean depositar(int numeroConta, double valor){
        for (Conta c : listaContas) { // para cada conta na lista contas
            if (c.getConta() == numeroConta) {
                return c.depositar(valor);
            }
        }
        return false;
    }

}
