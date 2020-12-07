package exercicios.exercicio02;

public class Professor extends Pessoa{
    private double salario;

    public Professor (String nome, String telef, double salario){
        super(nome, telef);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + " / Salário: R$" + salario;
    }
}
