package exercicios.exercicio01;

import java.util.ArrayList;

public class GerenciarAnimal {
    private ArrayList<Animal> listaAnimais;

    public GerenciarAnimal() {
        listaAnimais = new ArrayList<>();
    }

    public void novoAnimal(String nome, String raca, String cor, int anoNasc, String nomeProp, String telefone) {
        listaAnimais.add(new Animal(nome, raca, cor, anoNasc, nomeProp, telefone));
    }

    public String listarAnimais(){
        return listaAnimais.toString();
    }

    public String listarRaca(String raca){
        String saida = "";
        for (Animal animal : listaAnimais) {
            if(animal.getRaca().equals(raca)){
            saida += animal.getProp() + "\n";
            }
        }
        return saida;
    }
}
