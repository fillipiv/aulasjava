package exercicios.exercicio01;

public class Animal {
    private String nome, raca, cor;
    private int anoNasc;
    private Proprietario proprietario;

    public Animal (){ 
    }

    public Animal (String nome, String raca, String cor, int anoNasc, String nomeProp, String telefone){
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.anoNasc = anoNasc;
        this.proprietario = new Proprietario(nomeProp, telefone);
    }

    @Override
    public String toString() {
        return nome + ", " + raca + ", " + cor + ", " + anoNasc;
    }

    public String getProp(){
        return proprietario.toString();
    }

    public String getAnimal(){
        return "Animal > nome: " + nome + " / raça: " + raca + " / cor: " + cor + " / nascimento: " + anoNasc + " " + proprietario.getProp();
    }

    public String getRaca(){
        return raca;
    }
}
