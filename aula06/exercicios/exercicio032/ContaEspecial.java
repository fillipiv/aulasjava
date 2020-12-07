package exercicios.exercicio032;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int id, double limite){
        super(id);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if(getSaldo() + limite  >= valor){
            super.sacar(valor);
            limite = limite - (getSaldo() - valor);
        }
    }

    public double getLimite(int id){
        return limite;
    }

    @Override
    public String toString() {
        return "Conta especial: " + super.toString();
    }
}
