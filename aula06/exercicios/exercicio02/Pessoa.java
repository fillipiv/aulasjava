package exercicios.exercicio02;

public abstract class Pessoa {
    private String nome;
    private String telef;

    public Pessoa(String nome, String telef){
        this.nome = nome;
        this.telef = telef;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " / Telefone: " + telef;
    }

}
