package exercicios.exercicio02;

public class App {
    public static void main(String[] args) {
        
        // Pessoa pessoa = new Pessoa("Gustavo Gomez", "(11)99999-1111"); // após definir a classe pessoa como "abstract"
        // permite criação de extends, mas não permite criação de objetos diretos desta classe. Funciona apenas como modelo.
        Estudante estudante = new Estudante("Rafael Veiga", "(11)99999-2222", "Brilhar no Verdão");
        Professor professor = new Professor("Abel Ferreira", "(+351)99999-3333", 1000000.00);

        //System.out.println(pessoa);
        System.out.println(estudante);
        System.out.println(professor);
    }
}
