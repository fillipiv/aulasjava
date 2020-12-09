package exercicios.exercicio033;

public class ContaCorrente extends Conta {
    private final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int id){
        super(id);
    }

    @Override
    public boolean depositar(double valor){
        return super.depositar(valor - TAXA_DEPOSITO);
    }

    @Override
    public boolean sacar(double valor){

        if(getSaldo() >= valor){
            return super.sacar(valor);
        } 
        return false;
    }

    @Override
    public String toString() {
        return "Conta corrente: " + super.toString();
    }
}
