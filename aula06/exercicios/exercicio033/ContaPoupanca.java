package exercicios.exercicio033;

public class ContaPoupanca extends Conta {
    // private double saldoPoupanca;
    private static double taxaSaque = 0.10;

    public ContaPoupanca(int id) { // saldoPoupanca?
        super(id);
        // this.saldoPoupanca = saldoPoupanca;
    }

    @Override
    public boolean sacar(double valor) {
        if ((getSaldo() + taxaSaque ) >= valor) {
            return super.sacar(valor + taxaSaque);
            //saldoPoupanca = saldoPoupanca - (valor + TAXA_POUPANCA);
        }
        return false;
    }

    public static void setTaxaSaque(double taxa){
        if (taxaSaque > 0){
            taxaSaque = taxa;
        }
    }

    @Override
    public String toString() {
        return "Conta poupança: " + super.toString();
    }
}
