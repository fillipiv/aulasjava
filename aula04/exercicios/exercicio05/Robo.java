package exercicios.exercicio05;

public class Robo {

    private int x;
    private int y;

    public Robo(int x, int y) {
        setRobo(x, y);
    }

    public void setRobo(int x, int y) {
        if (x >= -10 && x <= 10 && y >= -10 && y <= 10) {
            this.x = x;
            this.y = y;
        } else {
            System.out.println("Posição inválida");
        }
    }

    public void getRobo() {
        System.out.printf("Robo na posição: X = %d / Y = %d\n", x, y);
    }

    public void moveRoboN() {
        setRobo(x+1, y);
    }

    public void moveRoboS() {
        setRobo(x-1, y);
    }

    public void moveRoboL() {
        setRobo(x, y+1);
    }

    public void moveRoboO() {
        setRobo(x, y-1);
    }
}
