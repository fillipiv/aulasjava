package exercicios.exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio hora1 = new Relogio("15", "00", "04");

        hora1.getHorario();

        hora1.setMin("13");

        hora1.getHorario();

        hora1.setHorario("15", "16", "30");

        hora1.getHorario();

        Relogio hora2 = new Relogio("10", "00", "04");
        
        hora2.getHorario();
    }
}
