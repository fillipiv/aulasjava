package exercicios.exercicio03;

public class Veiculo {
    private String modelo;
    private String marca;
    private double consumo;

    public Veiculo(String modelo, String marca, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    public void carro(){
        System.out.println("Carro é um "+ modelo +" da marca " + marca + ".");
    }
    void consumo(){
        System.out.printf("Seu consumo é de %.2f km/L.\n", consumo);
    }

    //double consumo(){
    //    return consumo;
    //}
}
