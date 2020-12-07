package exercicios.exercicio032;

public abstract class Conta {
    private int id;
    private double saldo;

    public Conta(int id) {
        this.id = id;
        this.saldo = 0;
    }

    public int getConta(int id) {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor " + valor + " inválido para depósito");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return " saldo R$" + saldo + " id conta " + id;
    }
}
