package exercicios.exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo c1 = new Veiculo("Fiesta", "Ford", 12);
        Veiculo c2 = new Veiculo("C3", "Citroen", 10);
        Veiculo c3 = new Veiculo("Mitsubishi", "ASX", -8);

        c1.carro();
        c2.consumo();
        c3.carro();
        c3.consumo();
        //System.out.println("Consumo: " + c3.consumo());
    }
}
