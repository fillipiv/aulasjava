package exercicios.exercicio033;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int id, double limite){
        super(id);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if(getSaldo() + limite  >= valor){
            return super.sacar(valor);
        }
        return false;
    }

    public double getLimite(int id){
        return limite;
    }

    @Override
    public String toString() {
        return "Conta especial: " + super.toString();
    }
}
