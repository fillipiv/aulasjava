package exercicios.exercicio042;

public class AppRelogio2 {
    public static void main(String[] args) {
        Relogio2 hora3 = new Relogio2(10, 20, 30);

        hora3.getHorario();
        
        hora3.setHorario(02,03,05);

        // hora3.hh = 30; > Alterando para private os atributos
        // fica bloqueado a alteração direta do atributo de outro arquivo
    
        
        hora3.getHorario();

        hora3.setHorario(25,03,05);

        hora3.getHorario();
    }    
}
