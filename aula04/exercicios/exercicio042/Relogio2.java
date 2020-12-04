package exercicios.exercicio042;

public class Relogio2 {
    
    // Todos os atributos privados e métodos públicos
private int hh;
private int mm;
private int ss;


Relogio2 (int hh, int mm, int ss){
    setHorario(hh, mm, ss);
}

// Original que não validava dados de entrada
/* Relogio2 (int hh, int mm, int ss){
    this.hh = hh;
    this.mm = mm;
    this.ss = ss; 
}*/

public void getHorario(){
    System.out.printf("Hora atual é: %02d : %02d : %02d\n", hh, mm, ss);
}

public void setHorario(int hora, int min, int seg){
    if((hora < 0 || hora >= 24 ) || (min < 0 || min >= 60 ) || (seg < 0 || seg >= 60 )){
        System.out.println("Horário inválido");
    }else{
        hh = hora;
        mm = min;
        ss = seg;
    }
}


}
