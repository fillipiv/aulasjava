public class Exemplo02 {
    public static void main(String[] args) {
        int cont;
        cont = 1; // inicialização

        while (cont < 10) { // teste de condição - limite
            System.out.println(cont);
            cont++; // passo
            // cont = cont + 2; cont += 2; poderia ser também *= -= \= ...
        }
        System.out.println("valor final:" + cont);
    }
}
