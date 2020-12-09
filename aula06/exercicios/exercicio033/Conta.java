package exercicios.exercicio033;

public abstract class Conta {
    private int id;
    private double saldo;

    public Conta(int id) {
        this.id = id;
        this.saldo = 0;
    }

    public int getConta() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return " saldo R$" + saldo + " id conta " + id;
    }
}
