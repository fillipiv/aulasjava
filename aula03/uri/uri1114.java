import java.util.Scanner;

public class uri1114 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int SENHA = 2002;
        int senha = 0;
        boolean senhaCorreta = false;

        for ( ; senhaCorreta == false; ){
            senha = teclado.nextInt();
            if (senha == SENHA) {
                senhaCorreta = true;
                System.out.println("Acesso Permitido");
            }else{
                System.out.println("Senha Invalida");
            }
        }
        
        teclado.close();
    }
}
