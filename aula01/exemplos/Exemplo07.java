package exemplos;

public class Exemplo07 {
    public static void main(String[] args) {
        
        double resultado;
        resultado = 7.0 / 9;
        
        // printf - print formatado
        // printf( FORMATO , VALORES/VARIÁVEIS )
        // %d - int %f - decimal %s - string %c - caracter
        // %.xf - x qtde de casas decimais
        // \n - pula linha
        System.out.printf("O resultado é %f\n", resultado);
        System.out.printf("O resultado é %.2f\n", resultado);
        System.out.printf("%d / %d = %.2f\n", 7, 9, resultado);

        int valorInteiro = 5;
        double valorDouble = 8.5;

        System.out.println(valorInteiro);
        System.out.println(valorDouble);

        valorDouble = valorInteiro;
        System.out.println(valorDouble);

        //Não é possível diretamente inserir valor double em variável inteira, não cabe
        //valorInteiro = valorDouble;
        System.out.println(valorDouble);

        valorDouble = 5.9989765;
        valorInteiro = (int) valorDouble; //down cast - força uma conversão de retirar campos não suportados. Perda de info
        System.out.println(valorInteiro);
    }
}
