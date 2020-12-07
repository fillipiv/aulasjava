package exercicios.exercicio032;

public class ContaCorrente extends Conta {
    private final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int id){
        super(id);
    }

    @Override
    public void depositar(double valor){
        super.depositar(valor - TAXA_DEPOSITO);
    }

    @Override
    public void sacar(double valor){
        if(getSaldo() >= valor){
            super.sacar(valor);
        }
    }

    @Override
    public String toString() {
        return "Conta corrente: " + super.toString();
    }
}
