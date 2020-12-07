package exemplos.exemplo01;

public class Gerente extends Funcionario{
    private int nFuncionario;

    public Gerente (String nome, double salario, int nFuncionario){
        super(nome, salario); // construtor da super classe
       this.nFuncionario = nFuncionario;
    }

    @Override
    public void aumentarSalario(double porcentagem){
        super.aumentarSalario(porcentagem + 0.2);
    }

    @Override
    public String exibir() {
        return super.exibir() + " : " + nFuncionario;
    }
    
    @Override
    public String toString() {
        return super.toString() + " : " + nFuncionario;
    }

}
