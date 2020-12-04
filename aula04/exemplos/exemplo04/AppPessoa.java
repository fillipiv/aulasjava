package exemplos.exemplo04;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Fillipi", 10000);
        Pessoa p2 = new Pessoa("Carlos", 5500);

    // Perde a necessidade de dar atributo apartado, quando usamos o construtor para adicionar o atributo nome
    // como parâmetro:    
    /* p1.nome = "Fillipi";
        p2.nome = "Carlos";
 */        
        p1.apresentar();
        p2.apresentar();

        p1.salario();
    }
}
