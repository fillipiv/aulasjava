package exercicios.exercicio03;

public class Conta {
    private int id;
    private double saldo;

    public Conta(int id, double saldo){
        this.id = id;
        this.saldo = saldo;
    }

    public String getConta(){
        return "Conta: " + id + " > saldo: R$" + saldo;
    }

    public String depositar(double deposit){
        if (deposit > 0 ){
            saldo = saldo + deposit;
            return "Deposito de R$" + deposit + " efetuado. Saldo é R$" + saldo;
        } else {
            return "Valor " + deposit + " inválido para depósito";
        }
    }

    public String sacar(double saque){
        if (saque > 0 && (saque <= saldo)){
            saldo = saldo - saque;
            return "Saque de R$" + saque + " efetuado. Saldo é R$" + saldo;
        } else {
            if (saque > saldo){
                return "Saldo atual de R$" + saldo + ". Não permite saque de R$" + saque;
            } else {
                return "Valor " + saque + " inválido para saque";
            }
        }
    }
}
