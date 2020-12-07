package exercicios.exercicio02;

public class Estudante extends Pessoa{
    private String curso;

    public Estudante (String nome, String telef, String curso){
        super(nome, telef);
        this.curso = curso;
    }

    @Override
    public String toString(){
        return super.toString() + " / Curso: " + curso;
    }

}
