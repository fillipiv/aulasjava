package exercicios.exercicio06;

public class AppEbook {
    public static void main(String[] args) {
    
        Ebook livroJoao = new Ebook("Joãozinho e o Pé de Feijão", "Autor muito famoso", 100);

        livroJoao.mostrarCapa();
        livroJoao.exibirPagina();
        livroJoao.avancarPagina();
        livroJoao.exibirPagina();
        livroJoao.irParaPagina(90);
        livroJoao.exibirPagina();
        livroJoao.retrocederPagina();
        livroJoao.exibirPagina();
        livroJoao.irParaPagina(100);
        livroJoao.avancarPagina();
    }
}
