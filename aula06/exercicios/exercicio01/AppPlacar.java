package exercicios.exercicio01;

public class AppPlacar {
    public static void main(String[] args) {
        Placar placar1 = new Placar();
        Placar placar2 = new Placar("Palmeiras", "Corinthians");
        Placar placar3 = new Placar("Palmeiras", "Corinthians", 4, 0);

        System.out.println(placar1.getResult());
        System.out.println(placar2.getResult());
        System.out.println(placar3.getResult());

        placar3.golMarcadoA();
        placar3.golMarcadoB();
        placar3.chacagemVarB();

    }
}
