package exemplos.exemplo04;

public class Pessoa {
    //atributo
    String nome;
    float salario;

    //método construtor
    Pessoa(String nome, float salario){
        this.nome = nome; // this se refere ao próprio objeto > pegando parâmetro e colocar no atributo do objeto
        this.salario = salario;
    }

    //método
    void apresentar(){
        System.out.println("Olá! Eu sou " + nome);
    }

    void salario(){
        System.out.println("Eu ganho: " + salario);
    }
}
