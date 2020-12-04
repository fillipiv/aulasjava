package exercicios.exercicio04;

public class Relogio {
    // Todos os atributos privados e métodos públicos
private String hh;
private String mm;
private String ss;

Relogio (String hh, String mm, String ss){
    this.hh = hh;
    this.mm = mm;
    this.ss = ss;
}

public void getHorario(){
    System.out.println("Hora atual é: " + hh + ":" + mm + ":" + ss);
}

public void setHorario(String hora, String min, String seg){
    hh = hora;
    mm = min;
    ss = seg;
}

public void setHora(String hora){
    hh = hora;
}

public void setMin(String min){
    mm = min;
}

public void setSeg(String seg){
    ss = seg;
}


}


