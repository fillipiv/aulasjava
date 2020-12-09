package exercicios.exercicio033;

import java.util.HashMap;

public class GerenciaConta {
    private HashMap<Integer, Conta> mapaContas;
    //Com hash map, fica mais eficiente porém ainda temos o problema de contas com números repitidos.
    //Teriamos que acrescentar uma classe para a criação dos códigos automatizados para não permitir sobescrição.

    public GerenciaConta() {
        mapaContas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        mapaContas.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limiteConta) {
        mapaContas.put(numeroConta, new ContaEspecial(numeroConta, limiteConta));
    }

    public void novaContaPoupanca(int numeroConta) {
        mapaContas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public String exibirSaldo(int numeroConta) {
        Conta c = mapaContas.get(numeroConta);
        
        if (c != null){
            return c.toString();
        }
        return "Conta não encontrada, verifique o número informado.";
    }

    public boolean sacar(int numeroConta, double valor) {
        Conta c = mapaContas.get(numeroConta);
        
        if (c != null){
            return c.sacar(valor);
        }
        return false;
    }

    public boolean depositar(int numeroConta, double valor){
        Conta c = mapaContas.get(numeroConta);
        
        if (c != null){
            return c.depositar(valor);
        }
        return false;
    }

}
