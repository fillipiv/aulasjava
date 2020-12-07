package exercicios.exercicio01;

public class Placar {
    private String timeA, timeB;
    private int golA, golB;

    public Placar (){ // Construtor padrão
        timeA = "Palmeiras";
        timeB = "Corinthians";
        golA=1;
        golB=0;
    }

    public Placar (String timeA, String timeB){
        this.timeA = timeA;
        this.timeB = timeB;
    }

    public Placar (String timeA, String timeB, int golA, int golB){
        this.timeA = timeA;
        this.timeB = timeB;
        this.golA = golA;
        this.golB = golB;
    }

    public String getResult(){
        return timeA + " " + golA + " X " + golB + " " + timeB;
    }

    public void golMarcadoA(){
        golA++;
        System.out.println("GOOOOLL DO VERDÃÃÃOOO!!");
        System.out.println(getResult());
    }

    public void golMarcadoB(){
        golB++;
        System.out.println("Gol do Corinthians >:(");
        System.out.println(getResult());
    }

    public void chacagemVarA(){
        golA--;
        System.out.println("Gol anulado pelo VAR! >:(");
        System.out.println(getResult());
    }

    public void chacagemVarB(){
        golB--;
        System.out.println("Gol anulado pelo VAR! :D");
        System.out.println(getResult());
    }
        
}
