package exercicios.exercicio06;

public class Ebook {

    private String titulo;
    private String autor;
    private int pagTotal;
    private int pagAtual;

    public Ebook(String titulo, String autor, int pagTotal) {
        this.titulo = titulo;
        this.autor = autor;
        this.pagTotal = pagTotal;
        this.pagAtual = 0;
    }
    // número de páginas não pode ser negativo

    public void avancarPagina() {
        if (pagAtual+1 <= pagTotal) {
            pagAtual++;
            System.out.printf("Página após movimentação: %d\n", pagAtual);
        } else {
            System.out.println("Páginas finalizadas, não é possível novo avanço.");
        }
    }

    public void retrocederPagina() {
        if (pagAtual-1 >= 0) {
            pagAtual--;
            System.out.printf("Página após retroceder: %d\n", pagAtual);
            if (pagAtual == 0) {
                System.out.println("Você está na capa");
            }
        } else {
            System.out.println("Você está na capa, não é possível retroceder mais.");
        }

    }

    public void irParaPagina(int pag) {
        if (pag <= pagTotal && pag >= 0) {
            pagAtual = pag;
            System.out.printf("Página atual: %d\n", pagAtual);
        } else {
            System.out.println("Página inválida");
        }
    }

    public void exibirPagina() {
        System.out.println("Página atual:" + pagAtual);
    }

    public void mostrarCapa() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + pagTotal);
    }
}
