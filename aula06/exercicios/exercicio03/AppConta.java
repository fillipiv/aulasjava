package exercicios.exercicio03;

public class AppConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta(344812, 10000.0);

        System.out.println(conta1.getConta());
        System.out.println(conta1.sacar(11000));
        System.out.println(conta1.sacar(-10000));
        System.out.println(conta1.sacar(9000));
        System.out.println(conta1.getConta());
        System.out.println(conta1.depositar(-3000));
        System.out.println(conta1.depositar(3000));

    }
}
